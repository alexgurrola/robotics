package robotics.mbe06_redstone;

import net.minecraft.item.ItemBlock;
import net.minecraftforge.fml.common.registry.ForgeRegistries;
import net.minecraftforge.fml.common.registry.GameRegistry;
import robotics.mbe06_redstone.input.BlockRedstoneColouredLamp;
import robotics.mbe06_redstone.input.TileEntityRedstoneColouredLamp;
import robotics.mbe06_redstone.input_and_output.BlockRedstoneMeter;
import robotics.mbe06_redstone.input_and_output.TileEntityRedstoneMeter;
import robotics.mbe06_redstone.output_only.BlockRedstoneTarget;
import robotics.mbe06_redstone.output_only.BlockRedstoneVariableSource;

/**
 * User: The Grey Ghost
 * Date: 24/12/2014
 * <p>
 * The Startup classes for this example are called during startup, in the following order:
 * preInitCommon
 * preInitClientOnly
 * initCommon
 * initClientOnly
 * postInitCommon
 * postInitClientOnly
 * See Robotics class for more information
 */
public class StartupCommon
{
    public static BlockRedstoneColouredLamp blockRedstoneColouredLamp;
    public static BlockRedstoneTarget blockRedstoneTarget;
    public static BlockRedstoneMeter blockRedstoneMeter;
    public static BlockRedstoneVariableSource blockRedstoneVariableSource;

    public static ItemBlock itemBlockRedstoneColouredLamp;
    public static ItemBlock itemBlockRedstoneTarget;
    public static ItemBlock itemBlockRedstoneMeter;
    public static ItemBlock itemBlockRedstoneVariableSource;

    public static void preInitCommon()
    {
        // ------input-------
        // each instance of your block should have a name that is unique within your mod.  use lower case.

        blockRedstoneColouredLamp = (BlockRedstoneColouredLamp) (new BlockRedstoneColouredLamp()
                .setUnlocalizedName("mbe06d_block_redstone_coloured_lamp_unlocalised_name"));
        blockRedstoneColouredLamp.setRegistryName("mbe06d_block_redstone_coloured_lamp_registry_name");
        ForgeRegistries.BLOCKS.register(blockRedstoneColouredLamp);

        // We also need to create and register an ItemBlock for this block otherwise it won't appear in the inventory
        itemBlockRedstoneColouredLamp = new ItemBlock(blockRedstoneColouredLamp);
        itemBlockRedstoneColouredLamp.setRegistryName(blockRedstoneColouredLamp.getRegistryName());
        ForgeRegistries.ITEMS.register(itemBlockRedstoneColouredLamp);

        // And register the tileentity too...
        GameRegistry.registerTileEntity(TileEntityRedstoneColouredLamp.class, "mbe06d_redstone_coloured_lamp_tileentity");

        // -----input and output ---------

        blockRedstoneMeter = (BlockRedstoneMeter) (new BlockRedstoneMeter()
                .setUnlocalizedName("mbe06c_block_redstone_meter_unlocalised_name"));
        blockRedstoneMeter.setRegistryName("mbe06c_block_redstone_meter_registry_name");
        ForgeRegistries.BLOCKS.register(blockRedstoneMeter);

        itemBlockRedstoneMeter = new ItemBlock(blockRedstoneMeter);
        itemBlockRedstoneMeter.setRegistryName(blockRedstoneMeter.getRegistryName());
        ForgeRegistries.ITEMS.register(itemBlockRedstoneMeter);

        GameRegistry.registerTileEntity(TileEntityRedstoneMeter.class, "mbe06c_redstone_meter_tileentity");

        //-----------output_only---------

        blockRedstoneTarget = (BlockRedstoneTarget) (new BlockRedstoneTarget()
                .setUnlocalizedName("mbe06b_block_redstone_target_unlocalised_name"));
        blockRedstoneTarget.setRegistryName("mbe06b_block_redstone_target_registry_name");
        ForgeRegistries.BLOCKS.register(blockRedstoneTarget);

        itemBlockRedstoneTarget = new ItemBlock(blockRedstoneTarget);
        itemBlockRedstoneTarget.setRegistryName(blockRedstoneTarget.getRegistryName());
        ForgeRegistries.ITEMS.register(itemBlockRedstoneTarget);

        blockRedstoneVariableSource = (BlockRedstoneVariableSource) (new BlockRedstoneVariableSource()
                .setUnlocalizedName("mbe06_block_redstone_variable_source_unlocalised_name"));
        blockRedstoneVariableSource.setRegistryName("mbe06_block_redstone_variable_source_registry_name");
        ForgeRegistries.BLOCKS.register(blockRedstoneVariableSource);

        itemBlockRedstoneVariableSource = new ItemBlock(blockRedstoneVariableSource);
        itemBlockRedstoneVariableSource.setRegistryName(blockRedstoneVariableSource.getRegistryName());
        ForgeRegistries.ITEMS.register(itemBlockRedstoneVariableSource);
    }

    public static void initCommon()
    {
    }

    public static void postInitCommon()
    {
    }

}
