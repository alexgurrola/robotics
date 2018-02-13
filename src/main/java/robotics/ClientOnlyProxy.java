package robotics;

import net.minecraft.client.Minecraft;
import net.minecraft.client.entity.EntityPlayerSP;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;

/**
 * ClientProxy is used to set up the mod and start it running on normal minecraft.  It contains all the code that should run on the
 * client side only.
 * For more background information see here http://greyminecraftcoder.blogspot.com/2013/11/how-forge-starts-up-your-code.html
 */
public class ClientOnlyProxy extends CommonProxy
{

    /**
     * Run before anything else. Read your config, create blocks, items, etc, and register them with the GameRegistry
     */
    public void preInit()
    {
        super.preInit();
        robotics.mbe70_configuration.StartupClientOnly.preInitClientOnly();

        robotics.mbe01_block_simple.StartupClientOnly.preInitClientOnly();
        robotics.mbe02_block_partial.StartupClientOnly.preInitClientOnly();
        robotics.mbe03_block_variants.StartupClientOnly.preInitClientOnly();
        robotics.mbe04_block_dynamic_block_model1.StartupClientOnly.preInitClientOnly();
        robotics.mbe05_block_dynamic_block_model2.StartupClientOnly.preInitClientOnly();
        robotics.mbe06_redstone.StartupClientOnly.preInitClientOnly();
        robotics.mbe08_creative_tab.StartupClientOnly.preInitClientOnly();
        robotics.mbe10_item_simple.StartupClientOnly.preInitClientOnly();
        robotics.mbe11_item_variants.StartupClientOnly.preInitClientOnly();
        robotics.mbe12_item_nbt_animate.StartupClientOnly.preInitClientOnly();
        robotics.mbe13_item_tools.StartupClientOnly.preInitClientOnly();
        robotics.mbe15_item_dynamic_item_model.StartupClientOnly.preInitClientOnly();
        robotics.mbe20_tileentity_data.StartupClientOnly.preInitClientOnly();
        robotics.mbe21_tileentityspecialrenderer.StartupClientOnly.preInitClientOnly();
        robotics.mbe30_inventory_basic.StartupClientOnly.preInitClientOnly();
        robotics.mbe31_inventory_furnace.StartupClientOnly.preInitClientOnly();
        robotics.mbe35_recipes.StartupClientOnly.preInitClientOnly();
        robotics.mbe40_hud_overlay.StartupClientOnly.preInitClientOnly();
        robotics.mbe50_particle.StartupClientOnly.preInitClientOnly();
        robotics.mbe60_network_messages.StartupClientOnly.preInitClientOnly();
        robotics.mbe75_testing_framework.StartupClientOnly.preInitClientOnly();
        robotics.testingarea.StartupClientOnly.preInitClientOnly();
    }

    /**
     * Do your mod setup. Build whatever data structures you care about. Register recipes,
     * send FMLInterModComms messages to other mods.
     */
    public void init()
    {
        super.init();
        robotics.mbe70_configuration.StartupClientOnly.initClientOnly();

        robotics.mbe01_block_simple.StartupClientOnly.initClientOnly();
        robotics.mbe02_block_partial.StartupClientOnly.initClientOnly();
        robotics.mbe03_block_variants.StartupClientOnly.initClientOnly();
        robotics.mbe04_block_dynamic_block_model1.StartupClientOnly.initClientOnly();
        robotics.mbe05_block_dynamic_block_model2.StartupClientOnly.initClientOnly();
        robotics.mbe06_redstone.StartupClientOnly.initClientOnly();
        robotics.mbe08_creative_tab.StartupClientOnly.initClientOnly();
        robotics.mbe10_item_simple.StartupClientOnly.initClientOnly();
        robotics.mbe11_item_variants.StartupClientOnly.initClientOnly();
        robotics.mbe12_item_nbt_animate.StartupClientOnly.initClientOnly();
        robotics.mbe13_item_tools.StartupClientOnly.initClientOnly();
        robotics.mbe15_item_dynamic_item_model.StartupClientOnly.initClientOnly();
        robotics.mbe20_tileentity_data.StartupClientOnly.initClientOnly();
        robotics.mbe21_tileentityspecialrenderer.StartupClientOnly.initClientOnly();
        robotics.mbe30_inventory_basic.StartupClientOnly.initClientOnly();
        robotics.mbe31_inventory_furnace.StartupClientOnly.initClientOnly();
        robotics.mbe35_recipes.StartupClientOnly.initClientOnly();
        robotics.mbe40_hud_overlay.StartupClientOnly.initClientOnly();
        robotics.mbe50_particle.StartupClientOnly.initClientOnly();
        robotics.mbe60_network_messages.StartupClientOnly.initClientOnly();
        robotics.mbe75_testing_framework.StartupClientOnly.initClientOnly();
        robotics.testingarea.StartupClientOnly.initClientOnly();
    }

    /**
     * Handle interaction with other mods, complete your setup based on this.
     */
    public void postInit()
    {
        super.postInit();
        robotics.mbe70_configuration.StartupClientOnly.postInitClientOnly();

        robotics.mbe01_block_simple.StartupClientOnly.postInitClientOnly();
        robotics.mbe02_block_partial.StartupClientOnly.postInitClientOnly();
        robotics.mbe03_block_variants.StartupClientOnly.postInitClientOnly();
        robotics.mbe04_block_dynamic_block_model1.StartupClientOnly.postInitClientOnly();
        robotics.mbe05_block_dynamic_block_model2.StartupClientOnly.postInitClientOnly();
        robotics.mbe06_redstone.StartupClientOnly.postInitClientOnly();
        robotics.mbe08_creative_tab.StartupClientOnly.postInitClientOnly();
        robotics.mbe10_item_simple.StartupClientOnly.postInitClientOnly();
        robotics.mbe11_item_variants.StartupClientOnly.postInitClientOnly();
        robotics.mbe12_item_nbt_animate.StartupClientOnly.postInitClientOnly();
        robotics.mbe13_item_tools.StartupClientOnly.postInitClientOnly();
        robotics.mbe15_item_dynamic_item_model.StartupClientOnly.postInitClientOnly();
        robotics.mbe20_tileentity_data.StartupClientOnly.postInitClientOnly();
        robotics.mbe21_tileentityspecialrenderer.StartupClientOnly.postInitClientOnly();
        robotics.mbe30_inventory_basic.StartupClientOnly.postInitClientOnly();
        robotics.mbe31_inventory_furnace.StartupClientOnly.postInitClientOnly();
        robotics.mbe35_recipes.StartupClientOnly.postInitClientOnly();
        robotics.mbe40_hud_overlay.StartupClientOnly.postInitClientOnly();
        robotics.mbe50_particle.StartupClientOnly.postInitClientOnly();
        robotics.mbe60_network_messages.StartupClientOnly.postInitClientOnly();
        robotics.mbe75_testing_framework.StartupClientOnly.postInitClientOnly();
        robotics.testingarea.StartupClientOnly.postInitClientOnly();
    }

    @Override
    public boolean playerIsInCreativeMode(EntityPlayer player)
    {
        if (player instanceof EntityPlayerMP) {
            EntityPlayerMP entityPlayerMP = (EntityPlayerMP) player;
            return entityPlayerMP.interactionManager.isCreative();
        } else if (player instanceof EntityPlayerSP) {
            return Minecraft.getMinecraft().playerController.isInCreativeMode();
        }
        return false;
    }

    @Override
    public boolean isDedicatedServer()
    {
        return false;
    }

}
