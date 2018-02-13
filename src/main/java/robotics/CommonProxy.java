package robotics;

import net.minecraft.entity.player.EntityPlayer;

/**
 * CommonProxy is used to set up the mod and start it running.  It contains all the code that should run on both the
 * Standalone client and the dedicated server.
 * For more background information see here http://greyminecraftcoder.blogspot.com/2013/11/how-forge-starts-up-your-code.html
 */
public abstract class CommonProxy
{

    /**
     * Run before anything else. Read your config, create blocks, items, etc, and register them with the GameRegistry
     */
    public void preInit()
    {
        //read config first
        robotics.mbe70_configuration.StartupCommon.preInitCommon();

        robotics.mbe01_block_simple.StartupCommon.preInitCommon();
        robotics.mbe02_block_partial.StartupCommon.preInitCommon();
        robotics.mbe03_block_variants.StartupCommon.preInitCommon();
        robotics.mbe04_block_dynamic_block_model1.StartupCommon.preInitCommon();
        robotics.mbe05_block_dynamic_block_model2.StartupCommon.preInitCommon();
        robotics.mbe06_redstone.StartupCommon.preInitCommon();
        robotics.mbe08_creative_tab.StartupCommon.preInitCommon();
        robotics.mbe10_item_simple.StartupCommon.preInitCommon();
        robotics.mbe11_item_variants.StartupCommon.preInitCommon();
        robotics.mbe12_item_nbt_animate.StartupCommon.preInitCommon();
        robotics.mbe13_item_tools.StartupCommon.preInitCommon();
        robotics.mbe15_item_dynamic_item_model.StartupCommon.preInitCommon();
        robotics.mbe20_tileentity_data.StartupCommon.preInitCommon();
        robotics.mbe21_tileentityspecialrenderer.StartupCommon.preInitCommon();
        robotics.mbe30_inventory_basic.StartupCommon.preInitCommon();
        robotics.mbe31_inventory_furnace.StartupCommon.preInitCommon();
        robotics.mbe35_recipes.StartupCommon.preInitCommon();
        robotics.mbe40_hud_overlay.StartupCommon.preInitCommon();
        robotics.mbe50_particle.StartupCommon.preInitCommon();
        robotics.mbe60_network_messages.StartupCommon.preInitCommon();
        robotics.mbe75_testing_framework.StartupCommon.preInitCommon();
        robotics.testingarea.StartupCommon.preInitCommon();
    }

    /**
     * Do your mod setup. Build whatever data structures you care about. Register recipes,
     * send FMLInterModComms messages to other mods.
     */
    public void init()
    {
        robotics.mbe70_configuration.StartupCommon.initCommon();

        robotics.mbe01_block_simple.StartupCommon.initCommon();
        robotics.mbe02_block_partial.StartupCommon.initCommon();
        robotics.mbe03_block_variants.StartupCommon.initCommon();
        robotics.mbe04_block_dynamic_block_model1.StartupCommon.initCommon();
        robotics.mbe05_block_dynamic_block_model2.StartupCommon.initCommon();
        robotics.mbe06_redstone.StartupCommon.initCommon();
        robotics.mbe08_creative_tab.StartupCommon.initCommon();
        robotics.mbe10_item_simple.StartupCommon.initCommon();
        robotics.mbe11_item_variants.StartupCommon.initCommon();
        robotics.mbe12_item_nbt_animate.StartupCommon.initCommon();
        robotics.mbe13_item_tools.StartupCommon.initCommon();
        robotics.mbe15_item_dynamic_item_model.StartupCommon.initCommon();
        robotics.mbe20_tileentity_data.StartupCommon.initCommon();
        robotics.mbe21_tileentityspecialrenderer.StartupCommon.initCommon();
        robotics.mbe30_inventory_basic.StartupCommon.initCommon();
        robotics.mbe31_inventory_furnace.StartupCommon.initCommon();
        robotics.mbe35_recipes.StartupCommon.initCommon();
        robotics.mbe40_hud_overlay.StartupCommon.initCommon();
        robotics.mbe50_particle.StartupCommon.initCommon();
        robotics.mbe60_network_messages.StartupCommon.initCommon();
        robotics.mbe75_testing_framework.StartupCommon.initCommon();
//    robotics.testingarea.StartupCommon.initCommon();
    }

    /**
     * Handle interaction with other mods, complete your setup based on this.
     */
    public void postInit()
    {
        robotics.mbe70_configuration.StartupCommon.postInitCommon();

        robotics.mbe01_block_simple.StartupCommon.postInitCommon();
        robotics.mbe02_block_partial.StartupCommon.postInitCommon();
        robotics.mbe03_block_variants.StartupCommon.postInitCommon();
        robotics.mbe04_block_dynamic_block_model1.StartupCommon.postInitCommon();
        robotics.mbe05_block_dynamic_block_model2.StartupCommon.postInitCommon();
        robotics.mbe06_redstone.StartupCommon.postInitCommon();
        robotics.mbe08_creative_tab.StartupCommon.postInitCommon();
        robotics.mbe10_item_simple.StartupCommon.postInitCommon();
        robotics.mbe11_item_variants.StartupCommon.postInitCommon();
        robotics.mbe12_item_nbt_animate.StartupCommon.postInitCommon();
        robotics.mbe13_item_tools.StartupCommon.postInitCommon();
        robotics.mbe15_item_dynamic_item_model.StartupCommon.postInitCommon();
        robotics.mbe20_tileentity_data.StartupCommon.postInitCommon();
        robotics.mbe21_tileentityspecialrenderer.StartupCommon.postInitCommon();
        robotics.mbe30_inventory_basic.StartupCommon.postInitCommon();
        robotics.mbe31_inventory_furnace.StartupCommon.postInitCommon();
        robotics.mbe35_recipes.StartupCommon.postInitCommon();
        robotics.mbe40_hud_overlay.StartupCommon.postInitCommon();
        robotics.mbe50_particle.StartupCommon.postInitCommon();
        robotics.mbe60_network_messages.StartupCommon.postInitCommon();
        robotics.mbe75_testing_framework.StartupCommon.postInitCommon();
        robotics.testingarea.StartupCommon.postInitCommon();
    }

    // helper to determine whether the given player is in creative mode
    //  not necessary for most examples
    abstract public boolean playerIsInCreativeMode(EntityPlayer player);

    /**
     * is this a dedicated server?
     *
     * @return true if this is a dedicated server, false otherwise
     */
    abstract public boolean isDedicatedServer();
}
