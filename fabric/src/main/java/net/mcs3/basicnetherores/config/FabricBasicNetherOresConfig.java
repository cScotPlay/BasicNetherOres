package net.mcs3.basicnetherores.config;

import io.github.fablabsmc.fablabs.api.fiber.v1.builder.ConfigTreeBuilder;
import io.github.fablabsmc.fablabs.api.fiber.v1.exception.ValueDeserializationException;
import io.github.fablabsmc.fablabs.api.fiber.v1.serialization.FiberSerialization;
import io.github.fablabsmc.fablabs.api.fiber.v1.serialization.JanksonValueSerializer;
import io.github.fablabsmc.fablabs.api.fiber.v1.tree.ConfigTree;
import io.github.fablabsmc.fablabs.api.fiber.v1.tree.PropertyMirror;
import net.mcs3.basicnetherores.Constants;

import java.io.*;
import java.nio.file.*;

import static io.github.fablabsmc.fablabs.api.fiber.v1.schema.type.derived.ConfigTypes.*;

public class FabricBasicNetherOresConfig {

    public static void setup() {
        try {
            Files.createDirectory(Paths.get("config"));
        } catch (FileAlreadyExistsException ignored) {} catch (IOException e) {
            Constants.LOGGER.warn("Failed to make config dir", e);
        }

        JanksonValueSerializer serializer = new JanksonValueSerializer(false);
        ConfigTree common = COMMON.configure(ConfigTree.builder());
        setupConfig(common, Paths.get("config", Constants.MOD_ID + "-common.json5"), serializer);
        BasicNetherOresConfig.setCommon(COMMON);
    }

    private static void setupConfig(ConfigTree config, Path p, JanksonValueSerializer serializer) {
        writeDefaultConfig(config, p, serializer);

        try (InputStream s = new BufferedInputStream(Files.newInputStream(p, StandardOpenOption.READ, StandardOpenOption.CREATE))) {
            FiberSerialization.deserialize(config, s, serializer);
        } catch (IOException | ValueDeserializationException e) {
            Constants.LOGGER.error("Error loading config from {}", p, e);
        }
    }

    private static void writeDefaultConfig(ConfigTree config, Path path, JanksonValueSerializer serializer) {
        try (OutputStream s = new BufferedOutputStream(Files.newOutputStream(path, StandardOpenOption.WRITE, StandardOpenOption.CREATE_NEW))) {
            FiberSerialization.serialize(config, s, serializer);
        } catch (FileAlreadyExistsException ignored) {} catch (IOException e) {
            Constants.LOGGER.error("Error writing default config", e);
        }
    }

    private static class Common implements BasicNetherOresConfig.ConfigAccess {
        //Ore Generation Toggle
        public final PropertyMirror<Boolean> emeraldGeneration = PropertyMirror.create(BOOLEAN);
        public final PropertyMirror<Boolean> diamondGeneration = PropertyMirror.create(BOOLEAN);
        public final PropertyMirror<Boolean> redstoneGeneration = PropertyMirror.create(BOOLEAN);
        public final PropertyMirror<Boolean> lapisGeneration = PropertyMirror.create(BOOLEAN);
        public final PropertyMirror<Boolean> coalGeneration = PropertyMirror.create(BOOLEAN);
        public final PropertyMirror<Boolean> silverGeneration = PropertyMirror.create(BOOLEAN);
        public final PropertyMirror<Boolean> ironGeneration = PropertyMirror.create(BOOLEAN);
        public final PropertyMirror<Boolean> leadGeneration = PropertyMirror.create(BOOLEAN);
        public final PropertyMirror<Boolean> nickelGeneration = PropertyMirror.create(BOOLEAN);
        public final PropertyMirror<Boolean> copperGeneration = PropertyMirror.create(BOOLEAN);
        public final PropertyMirror<Boolean> aluminumGeneration = PropertyMirror.create(BOOLEAN);
        public final PropertyMirror<Boolean> tinGeneration = PropertyMirror.create(BOOLEAN);
        public final PropertyMirror<Boolean> osmiumGeneration = PropertyMirror.create(BOOLEAN);
        public final PropertyMirror<Boolean> uraniumGeneration = PropertyMirror.create(BOOLEAN);
        public final PropertyMirror<Boolean> zincGeneration = PropertyMirror.create(BOOLEAN);

        public ConfigTree configure(ConfigTreeBuilder builder) {
            builder.fork("emeraldGeneration")
                    .beginValue("enabled", BOOLEAN, true)
                    .withComment("Generate Emerald Ore")
                    .finishValue(emeraldGeneration::mirror)
                    .finishBranch()

                    .fork("diamondGeneration")
                    .beginValue("enabled", BOOLEAN, true)
                    .withComment("Generate Diamond Ore")
                    .finishValue(diamondGeneration::mirror)
                    .finishBranch()

                    .fork("redstoneGeneration")
                    .beginValue("enabled", BOOLEAN, true)
                    .withComment("Generate Restone Ore")
                    .finishValue(redstoneGeneration::mirror)
                    .finishBranch()

                    .fork("lapisGeneration")
                    .beginValue("enabled", BOOLEAN, true)
                    .withComment("Generate Lapis Ore")
                    .finishValue(lapisGeneration::mirror)
                    .finishBranch()

                    .fork("coalGeneration")
                    .beginValue("enabled", BOOLEAN, true)
                    .withComment("Generate Coal Ore")
                    .finishValue(coalGeneration::mirror)
                    .finishBranch()

                    .fork("silverGeneration")
                    .beginValue("enabled", BOOLEAN, true)
                    .withComment("Generate Silver Ore")
                    .finishValue(silverGeneration::mirror)
                    .finishBranch()

                    .fork("ironGeneration")
                    .beginValue("enabled", BOOLEAN, true)
                    .withComment("Generate Iron Ore")
                    .finishValue(ironGeneration::mirror)
                    .finishBranch()

                    .fork("leadGeneration")
                    .beginValue("enabled", BOOLEAN, true)
                    .withComment("Generate Lead Ore")
                    .finishValue(leadGeneration::mirror)
                    .finishBranch()

                    .fork("nickelGeneration")
                    .beginValue("enabled", BOOLEAN, true)
                    .withComment("Generate Nickel Ore")
                    .finishValue(nickelGeneration::mirror)
                    .finishBranch()

                    .fork("copperGeneration")
                    .beginValue("enabled", BOOLEAN, true)
                    .withComment("Generate Copper Ore")
                    .finishValue(copperGeneration::mirror)
                    .finishBranch()

                    .fork("aluminumGeneration")
                    .beginValue("enabled", BOOLEAN, true)
                    .withComment("Generate Aluminum Ore")
                    .finishValue(aluminumGeneration::mirror)
                    .finishBranch()

                    .fork("tinGeneration")
                    .beginValue("enabled", BOOLEAN, true)
                    .withComment("Generate Tin Ore")
                    .finishValue(tinGeneration::mirror)
                    .finishBranch()

                    .fork("osmiumGeneration")
                    .beginValue("enabled", BOOLEAN, true)
                    .withComment("Generate Osmium Ore")
                    .finishValue(osmiumGeneration::mirror)
                    .finishBranch()

                    .fork("uraniumGeneration")
                    .beginValue("enabled", BOOLEAN, true)
                    .withComment("Generate Uranium Ore")
                    .finishValue(uraniumGeneration::mirror)
                    .finishBranch()

                    .fork("zincGeneration")
                    .beginValue("enabled", BOOLEAN, true)
                    .withComment("Generate Zinc Ore")
                    .finishValue(zincGeneration::mirror)
                    .finishBranch();

            return builder.build();
        }


        @Override
        public boolean emeraldGeneration() {
            return emeraldGeneration.getValue();
        }

        @Override
        public boolean diamondGeneration() {
            return diamondGeneration.getValue();
        }

        @Override
        public boolean redstoneGeneration() {
            return redstoneGeneration.getValue();
        }

        @Override
        public boolean lapisGeneration() {
            return lapisGeneration.getValue();
        }

        @Override
        public boolean coalGeneration() {
            return coalGeneration.getValue();
        }

        @Override
        public boolean silverGeneration() {
            return silverGeneration.getValue();
        }

        @Override
        public boolean ironGeneration() {
            return ironGeneration.getValue();
        }

        @Override
        public boolean leadGeneration() {
            return leadGeneration.getValue();
        }

        @Override
        public boolean nickelGeneration() {
            return nickelGeneration.getValue();
        }

        @Override
        public boolean copperGeneration() {
            return copperGeneration.getValue();
        }

        @Override
        public boolean aluminumGeneration() {
            return aluminumGeneration.getValue();
        }

        @Override
        public boolean tinGeneration() {
            return tinGeneration.getValue();
        }

        @Override
        public boolean osmiumGeneration() {
            return osmiumGeneration.getValue();
        }

        @Override
        public boolean uraniumGeneration() {
            return uraniumGeneration.getValue();
        }

        @Override
        public boolean zincGeneration() {
            return zincGeneration.getValue();
        }
    }

    private static final Common COMMON = new Common();
}
