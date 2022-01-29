package com.cscot.basicnetherores.client;

import com.cscot.basicnetherores.BasicNetherOres;

import java.io.IOException;
import java.io.InputStream;
import java.nio.file.FileSystemAlreadyExistsException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class ShippedResourcePacks
{
    public static void extractFiles(String... packs) {
        createFolderIfMissing("resourcepacks");

        for (String name : packs)
        {
            InputStream folderInJar = ShippedResourcePacks.class.getResourceAsStream("/opt_in/" + name + ".zip");

            try {
                Files.copy(folderInJar, Paths.get("resourcepacks/" + name + ".zip"));
            } catch (FileSystemAlreadyExistsException e) {
            } catch (IOException e) {
                e.printStackTrace();
            }

            try {folderInJar.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public static void createFolderIfMissing(String name)
    {
        try {
            Files.createDirectories(Paths.get(name));
        } catch (IOException e){
            BasicNetherOres.LOGGER.warn("Could not create Folder: {}", name);
        }
    }
}
