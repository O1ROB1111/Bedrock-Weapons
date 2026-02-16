package me.FellTomato6998.bedrockWeapons;

import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;

public class Moditems {
    //Bedrock Sword
    public static final Item BEDROCKSWORD_ITEM = registerItem("bedrocksword", new Item.Settings().maxCount(1));

    //Bedrock Axe
    public static final Item BEDROCKAXE_ITEM = registerItem("bedrockaxe", new Item.Settings().maxCount(1));

    //Other
    private static Item registerItem(String name, Item.Settings settings) {
        Identifier id = Identifier.of("bedrock-weapons", name);
        RegistryKey<Item> key = RegistryKey.of(RegistryKeys.ITEM, id);
        return Registry.register(Registries.ITEM, key, new Item(settings.registryKey(key)));
    }

    public static void registerModItems() {
    }
}
