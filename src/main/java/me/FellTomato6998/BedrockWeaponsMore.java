package me.FellTomato6998;

import me.FellTomato6998.items.Moditems;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.ItemGroups;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BedrockWeaponsMore implements ModInitializer {
	public static final String MOD_ID = "bedrock-weapons";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		Moditems.registerModItems();

		//Creative Menu

		//Bedrock Sword
		ItemGroupEvents.modifyEntriesEvent(ItemGroups.COMBAT)
				.register(entries -> entries.add(Moditems.BEDROCKSWORD_ITEM));

		//Bedrock Axe
		ItemGroupEvents.modifyEntriesEvent(ItemGroups.COMBAT)
				.register(entries -> entries.add(Moditems.BEDROCKAXE_ITEM));

		//Bedrock Spear
		ItemGroupEvents.modifyEntriesEvent(ItemGroups.COMBAT)
				.register(entries -> entries.add(Moditems.BEDROCKSPEAR_ITEM));

		//Bedrock Axe
		ItemGroupEvents.modifyEntriesEvent(ItemGroups.FOOD_AND_DRINK)
				.register(entries -> entries.add(Moditems.BEDROCKGOLDENAPPLE_ITEM));

	}
}