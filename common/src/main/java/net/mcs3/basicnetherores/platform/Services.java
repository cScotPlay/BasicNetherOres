package net.mcs3.basicnetherores.platform;

import net.mcs3.basicnetherores.Constants;
import net.mcs3.basicnetherores.platform.services.IPlatformHelper;

import javax.annotation.Nullable;
import java.util.ServiceLoader;
import java.util.function.Supplier;
import java.util.stream.Collectors;

public class Services {

    public static final IPlatformHelper PLATFORM = loadService(IPlatformHelper.class, null);

    public static <T> T loadService(Class<T> clazz, @Nullable Supplier<T> defaultImpl) {
        var providers = ServiceLoader.load(clazz).stream().toList();
        if (providers.isEmpty() && defaultImpl != null) {
            return defaultImpl.get();
        } else if (providers.size() != 1) {
            var names = providers.stream().map(p -> p.type().getName()).collect(Collectors.joining(",", "[", "]"));
            var msg = "There should be exactly one implementation of %s on the classpath. Found: %s"
                    .formatted(clazz.getName(), names);
            throw new IllegalStateException(msg);
        } else {
            var provider = providers.get(0);
            Constants.LOGGER.debug("Instantiating {} for service {}", provider.type().getName(), clazz.getName());
            return provider.get();
        }
    }
}