package robotics.mbe13_item_tools;

import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemTool;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.text.TextComponentString;
import net.minecraft.world.World;
import robotics.Robotics;

import java.util.Set;

/**
 * User: The Grey Ghost
 * Date: 30/12/2014
 * <p>
 * ItemToolsTest is a simple tool used to test the interactions between tools and blocks
 * For background information see here
 * http://greyminecraftcoder.blogspot.ch/2015/01/mining-blocks-with-tools.html
 * <p>
 * Manipulating the item properties or methods is generally the best way to customise mining behaviour if you are creating
 * your own custom item.
 * <p>
 * Item.setHarvestLevel(ToolClass, level) - first choice - give your tool one or more ToolClasses equivalent to existing tool eg "pickaxe", "axe".
 * ItemTool constructor -
 * EFFECTIVE_ON set of blocks - to add extra "special case" blocks that your item is effective on which don't match the Item's ToolClass(es).
 * ToolMaterial, which affects the maximum dig speed and the tool durability.
 * Item.getStrVsBlock() - add further "special cases" that ToolClass and ItemTool constructor don't cover.
 * Item.onBlockStartBreak() - can be used to abort block breaking before it is destroyed
 * Item.onBlockDestroyed() - used to damage the item once the block is destroyed
 * <p>
 * Item.getDigSpeed() has been removed in 10.1.2
 * <p>
 * In Adventure mode, the "CanDestroy" NBT tag in the tool's itemstack is used to determine which blocks it can destroy.
 */

public class ItemToolsTest extends ItemTool
{

    /**
     * @param attackDamage
     * @param attackSpeed
     * @param material
     * @param effectiveBlocks
     */
    public ItemToolsTest(float attackDamage, float attackSpeed, ToolMaterial material, Set effectiveBlocks)
    {
        super(attackDamage, attackSpeed, material, effectiveBlocks);
        this.setCreativeTab(CreativeTabs.MISC);   // the item will appear on the Miscellaneous tab in creative

        final int WOOD_HARDNESS_LEVEL = 0;
        final int STONE_HARDNESS_LEVEL = 1;
        this.setHarvestLevel("axe", WOOD_HARDNESS_LEVEL);  // default.  can also be set when creating the block instance, which is typically what vanilla does
        this.setHarvestLevel("pickaxe", STONE_HARDNESS_LEVEL);  // can add hardness level for as many or few ToolClasses as you want; new ToolClasses also possible
    }

    // can be useful to add further "special cases" that ToolClass and ItemTool constructor don't cover.

    /**
     * @param p_getDestroySpeed_1_
     * @param p_getDestroySpeed_2_
     * @return
     */
    @Override
    public float getDestroySpeed(ItemStack p_getDestroySpeed_1_, IBlockState p_getDestroySpeed_2_)
    {
        // Merge: p_getDestroySpeed_2_.toString() vs p_getDestroySpeed_2_ became the latter
        StartupCommon.methodCallLogger.enterMethod("ItemToolsTest.getDestroySpeed", p_getDestroySpeed_1_.getDisplayName() + ", " + p_getDestroySpeed_2_);
        Float result = super.getDestroySpeed(p_getDestroySpeed_1_, p_getDestroySpeed_2_);
        StartupCommon.methodCallLogger.exitMethod("ItemToolsTest.getDestroySpeed", String.valueOf(result));
        return result;
    }

    //   Item.onBlockStartBreak() - called immediately before the block is destroyed - can be used to abort block breaking before it is destroyed

    /**
     * @param itemstack
     * @param pos
     * @param player
     * @return
     */
    @Override
    public boolean onBlockStartBreak(ItemStack itemstack, BlockPos pos, EntityPlayer player)
    {
        StartupCommon.methodCallLogger.enterMethod("ItemToolsTest.onBlockStartBreak", itemstack.getDisplayName() + ", " + pos + ", " + player.getName());
        Boolean result = super.onBlockStartBreak(itemstack, pos, player);
        if (Robotics.proxy.playerIsInCreativeMode(player)) {
            final boolean PRINT_IN_CHAT_WINDOW = true;
            player.sendStatusMessage(new TextComponentString("Currently in creative mode; switch to survival mode using /gamemode."),
                    PRINT_IN_CHAT_WINDOW);
        }
        StartupCommon.methodCallLogger.exitMethod("ItemToolsTest.onBlockStartBreak", String.valueOf(result));
        return result;
    }

    /**
     * @param stack
     * @param worldIn
     * @param iBlockState
     * @param pos
     * @param playerIn
     * @return
     */
    @Override
    // damage the item when it destroys a block - defaults to 1 damage for tools
    public boolean onBlockDestroyed(ItemStack stack, World worldIn, IBlockState iBlockState, BlockPos pos, EntityLivingBase playerIn)
    {
        StartupCommon.methodCallLogger.enterMethod("ItemToolsTest.onBlockDestroyed",
                stack.getDisplayName() + ", {world}, " + iBlockState.toString() + ", "
                        + pos + ", " + playerIn.getName()
        );
        Boolean result = super.onBlockDestroyed(stack, worldIn, iBlockState, pos, playerIn);
        StartupCommon.methodCallLogger.exitMethod("ItemToolsTest.onBlockDestroyed", String.valueOf(result));
        return result;
    }


//  @Override
//  public boolean canHarvestBlock(Block blockIn) {
//    Startup.methodCallLogger.enterMethod("ItemToolsTest.canHarvestBlock#1", blockIn.getLocalizedName());
//    Boolean result = super.canHarvestBlock(blockIn);
//    Startup.methodCallLogger.exitMethod("ItemToolsTest.canHarvestBlock#1", result.toString());
//    return result;
//  }
//
//  @Override
//  public boolean canHarvestBlock(Block par1Block, ItemStack itemStack) {
//    Startup.methodCallLogger.enterMethod("ItemToolsTest.canHarvestBlock#2", par1Block.getLocalizedName() + ", " + itemStack.getDisplayName());
//    Boolean result = super.canHarvestBlock(par1Block, itemStack);
//    Startup.methodCallLogger.exitMethod("ItemToolsTest.canHarvestBlock#2", result.toString());
//    return result;
//  }
//
//  @Override
//  public int getHarvestLevel(ItemStack stack, String toolClass) {
//    Startup.methodCallLogger.enterMethod("ItemToolsTest.getHarvestLevel", stack.getDisplayName() + ", " + toolClass);
//    Integer result = super.getHarvestLevel(stack, toolClass);
//    Startup.methodCallLogger.exitMethod("ItemToolsTest.getHarvestLevel", result.toString());
//    return result;
//  }
}
