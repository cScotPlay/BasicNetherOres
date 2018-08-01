package cscot.basicnetherores.objects.blocks;

import java.util.List;
import java.util.Random;

import cscot.basicnetherores.BasicNetherOres;
import cscot.basicnetherores.init.BlockInit;
import cscot.basicnetherores.init.BlockOreInit;
import cscot.basicnetherores.init.ItemInit;
import cscot.basicnetherores.util.handler.ConfigHandler;
import cscot.basicnetherores.util.interfaces.IHasModel;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.properties.PropertyEnum;
import net.minecraft.block.state.BlockStateContainer;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.entity.Entity;
import net.minecraft.entity.monster.EntityPigZombie;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.init.Enchantments;
import net.minecraft.init.Items;
import net.minecraft.item.EnumDyeColor;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.EnumHand;
import net.minecraft.util.NonNullList;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.RayTraceResult;
import net.minecraft.world.World;
import net.minecraftforge.event.world.BlockEvent;

public class BlockOreBase extends Block implements IHasModel {

	private String name, oreDictName;
	
	public BlockOreBase(String name, String oreDictName) {
		
		super(Material.ROCK);
		setUnlocalizedName(name);
		setRegistryName(name);
		setLocalizedName(oreDictName);
		setCreativeTab(BasicNetherOres.BASICNETHERORES);
		
		this.name = name;
		this.oreDictName = oreDictName;
		
		this.setHarvestLevel("pickaxe", 2);
		this.setHardness(3);
		
		BlockOreInit.BLOCKORES.add(this);
		ItemInit.ITEMS.add(new ItemBlock(this).setRegistryName(this.getRegistryName()));
	}

	private String setLocalizedName(String oreDictName) {
		return this.oreDictName;
	}

	
	@Override
    public Item getItemDropped(IBlockState state, Random rand, int fortune) {
		
		return 	this == BlockOreInit.ORE_NETHEREMERALD ? Items.EMERALD :
				this == BlockOreInit.ORE_NETHERDIAMOND ? Items.DIAMOND :
				this == BlockOreInit.ORE_NETHERREDSTONE ? Items.REDSTONE :
				this == BlockOreInit.ORE_NETHERLAPIS ? Items.DYE :
				this == BlockOreInit.ORE_NETHERCOAL ? Items.COAL :
				Item.getItemFromBlock(this);
       
	}

    @Override
    public int getExpDrop(IBlockState state, net.minecraft.world.IBlockAccess world, BlockPos pos, int fortune) {
        
    	Random rand = world instanceof World ? ((World)world).rand : new Random();
        
    	if (this.getItemDropped(state, rand, fortune) != Item.getItemFromBlock(this)) {
            int i = 0;

            if (this == BlockOreInit.ORE_NETHERCOAL) {
                
            	i = MathHelper.getInt(rand, 0, 2);
            }
            else if (this == BlockOreInit.ORE_NETHERDIAMOND) {
                
            	i = MathHelper.getInt(rand, 3, 7);
            }
            else if (this == BlockOreInit.ORE_NETHEREMERALD) {
                
            	i = MathHelper.getInt(rand, 3, 7);
            }
            else if (this == BlockOreInit.ORE_NETHERREDSTONE) {
                
            	i = MathHelper.getInt(rand, 2, 5);
            }
            else if (this == BlockOreInit.ORE_NETHERLAPIS) {
                
            	i = MathHelper.getInt(rand, 2, 5);
            }
            else if (this == Blocks.QUARTZ_ORE) {
                
            	i = MathHelper.getInt(rand, 2, 5);
            }

            return i;
        }
        return 0;
    }
    
    @Override
    public int quantityDropped(Random rand) {       
    	
    	return	this == BlockOreInit.ORE_NETHERREDSTONE ? 3 + rand.nextInt(4) :
        		this == BlockOreInit.ORE_NETHERLAPIS ? 4 + rand.nextInt(5) :
        		this == BlockOreInit.ORE_NETHERCOAL ? 1 + rand.nextInt(2) :
        		1;
	}
    
    @Override //Set Block Drop Type
	public int damageDropped(IBlockState state) {
		
		return this == BlockOreInit.ORE_NETHERLAPIS ? EnumDyeColor.BLUE.getDyeDamage() : 0;

	}
	
	@Override
	public int quantityDroppedWithBonus(int fortune, Random random)
    {
        if (fortune > 0 && Item.getItemFromBlock(this) != this.getItemDropped((IBlockState)this.getBlockState().getValidStates().iterator().next(), random, fortune))
        {
            int i = random.nextInt(fortune + 2) - 1;

            if (i < 0)
            {
                i = 0;
            }

            return this.quantityDropped(random) * (i + 1);
        }
        else
        {
            return this.quantityDropped(random);
        }
    }
    
    @Override
    public void harvestBlock(World world, EntityPlayer thief, BlockPos pos, IBlockState state, TileEntity te, ItemStack stack) {
    	
    	super.harvestBlock(world, thief, pos, state, te, stack);

    	if (ConfigHandler.pigmanGuard) {

    		EnumHand hand = thief.getActiveHand();
    		ItemStack silkTouch = thief.getHeldItemMainhand();

    		if (silkTouch == null || EnchantmentHelper.getEnchantmentLevel(Enchantment.getEnchantmentByLocation("minecraft:silk_touch"), silkTouch) <= 0 || !ConfigHandler.silkEffect) {

				pigmenGuards(thief, world, pos);
    		}
    	}
    }
    
    private void pigmenGuards(EntityPlayer thief, World world, BlockPos pos) {

		int x = pos.getX(), y = pos.getY(), z = pos.getZ();

		int rngProt;
		rngProt = ConfigHandler.protectionRange;

    	List<?> list = world.getEntitiesWithinAABB(EntityPigZombie.class, new AxisAlignedBB(x - rngProt, y - rngProt, z - rngProt, x + rngProt, y + rngProt, z + rngProt));
    	
    	for(int i = 0; i < list.size(); i++) {
    		
    		Entity entity = (Entity)list.get(i);
    		if(entity instanceof EntityPigZombie) {
    			
    			EntityPigZombie guardPigs = (EntityPigZombie)entity;
    			guardPigs.setRevengeTarget(thief);
    		}
    	}
	}
	
	@Override  //This is the block that returns when selecting in creative mode
	public ItemStack getPickBlock(IBlockState state, RayTraceResult target, World world, BlockPos pos, EntityPlayer player) {
			
		return new ItemStack(Item.getItemFromBlock(this), 1, getMetaFromState(world.getBlockState(pos)));
	}

    @Override
	public void registerModels() {
		
    	BasicNetherOres.proxy.registerItemRenderer(Item.getItemFromBlock(this), 0, "inventory");
	
    }	


}
