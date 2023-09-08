package name.record_mod.registry;

import name.record_mod.RecordMod;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {
    public static final Item COUNTDOWN = registerItem("countdown",
            new Item(new FabricItemSettings()));
    public static final Item HALFCOUNTDOWN = registerItem("haft_countdown",
            new Item(new FabricItemSettings()));
    public static Item registerItem(String name, Item item, ItemGroup... itemGroups) {
        Item registeredItem = Registry.register(Registries.ITEM, new Identifier(RecordMod.MOD_ID,name), item);
        for (ItemGroup itemGroup: itemGroups){
            ItemGroupEvents.modifyEntriesEvent(itemGroup).register(entries -> entries.add(registeredItem));
        }
        return  registeredItem;
    }
    public static void registerModItem () {
        RecordMod.LOGGER.debug("Registering mod items for" +RecordMod.MOD_ID);
    }
}
