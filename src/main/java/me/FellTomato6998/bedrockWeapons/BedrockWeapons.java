package me.FellTomato6998.bedrockWeapons;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.ItemGroups;

public class BedrockWeapons implements ModInitializer {

    @Override
    public void onInitialize() {
        Moditems.registerModItems();

        //Creative Menu
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.COMBAT)
                .register(entries -> entries.add(Moditems.BEDROCKSWORD_ITEM));
    }
}
