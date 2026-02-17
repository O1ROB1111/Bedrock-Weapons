package me.FellTomato6998.items;

import me.FellTomato6998.bedrockWeapons.BedrockWeapons;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;

import java.util.function.Function;

public class Moditems {
    //Bedrock Ingot
    public static final Item BEDROCKINGOT_ITEM = register("bedrockingot", Item::new, new Item.Settings());

    //Bedrock Sword
    public static final Item BEDROCKSWORD_ITEM = register("bedrocksword", Item::new, new Item.Settings());

    //Bedrock Axe
    public static final Item BEDROCKAXE_ITEM = register("bedrockaxe", Item::new, new Item.Settings());

    //Bedrock Spear
    public static final Item BEDROCKSPEAR_ITEM = register("bedrockspear", Item::new, new Item.Settings());

    //Bedrock Golden Apple
    public static final Item BEDROCKGOLDENAPPLE_ITEM = register("bedrockgoldenapple", Item::new, new Item.Settings());

    //Other
    public static Item register(String name, Function<Item.Settings, Item> itemFactory, Item.Settings settings) {
        RegistryKey<Item> itemKey = RegistryKey.of(RegistryKeys.ITEM, Identifier.of(BedrockWeapons.MOD_ID, name));
        Item item = itemFactory.apply(settings.registryKey(itemKey));
        Registry.register(Registries.ITEM, itemKey, item);
        return item;
    }

    public static void registerModItems() {
        BedrockWeapons.LOGGER.info("Registering Bedrock Weapons & More Items");
    }
}
