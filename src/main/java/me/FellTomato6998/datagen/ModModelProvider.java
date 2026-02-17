package me.FellTomato6998.datagen;

import me.FellTomato6998.items.Moditems;
import net.fabricmc.fabric.api.client.datagen.v1.provider.FabricModelProvider;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.minecraft.client.data.Models;

public class ModModelProvider extends FabricModelProvider {
    public ModModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(net.minecraft.client.data.BlockStateModelGenerator blockStateModelGenerator) {

    }

    @Override
    public void generateItemModels(net.minecraft.client.data.ItemModelGenerator itemModelGenerator) {
        itemModelGenerator.register(Moditems.BEDROCKSWORD_ITEM, Models.GENERATED);
    }
}
