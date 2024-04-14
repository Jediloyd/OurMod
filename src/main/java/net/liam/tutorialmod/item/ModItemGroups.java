package net.liam.tutorialmod.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.liam.tutorialmod.TutorialMod;
import net.liam.tutorialmod.block.ModBlocks;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {
    public  static final ItemGroup SODA_GROUP = Registry.register(Registries.ITEM_GROUP,
            new Identifier(TutorialMod.MOD_ID, "mtn_dew"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.soda"))
                    .icon(() -> new ItemStack(ModItems.MTN_DEW)).entries((displayContext, entries) -> {
                        entries.add(ModItems.BTRY_ACID);
                        entries.add(ModItems.MTN_DEW);
                        entries.add(ModBlocks.MT_DEW_BLOCK);

                    }).build());


    public static void registerItemGroups() {
        TutorialMod.LOGGER.info("Registering Item Groups  for " +TutorialMod.MOD_ID);
    }
}
