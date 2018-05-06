package cscot.basicnetherores.objects.items;

import cscot.basicnetherores.BasicNetherOres;
import cscot.basicnetherores.init.IngotInit;
import cscot.basicnetherores.util.interfaces.IHasModel;
import net.minecraft.item.Item;

public class IngotBase extends Item implements IHasModel {

    public IngotBase(String name, String localName) {

        setUnlocalizedName(localName);
        setRegistryName(name);
        setCreativeTab(BasicNetherOres.BASICNETHERORES);

        IngotInit.ITEMINGOTS.add(this);
    }

    @Override
    public void registerModels() {

        BasicNetherOres.proxy.registerItemRenderer(this, 0, "inventory");

    }
}
