package cscot.basicnetherores.objects.blocks;


import cscot.basicnetherores.BasicNetherOres;
import cscot.basicnetherores.init.BlockInit;
import cscot.basicnetherores.init.ItemInit;
import cscot.basicnetherores.util.interfaces.IHasModel;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;

public class BlockBase extends Block implements IHasModel
{
	public BlockBase(String name, Material material) 
	{
		super(material);
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(BasicNetherOres.BASICNETHERORES);
		
		BlockInit.BLOCKS.add(this);
		ItemInit.ITEMS.add(new ItemBlock(this).setRegistryName(this.getRegistryName()));
		
	}

	@Override
	public void registerModels()
	{
		BasicNetherOres.proxy.registerItemRenderer(Item.getItemFromBlock(this), 0, "inventory");
	}
}
