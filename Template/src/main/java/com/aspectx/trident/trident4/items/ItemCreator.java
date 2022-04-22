package com.aspectx.trident.trident4.items;

import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.List;

public class ItemCreator {
    public static ItemStack createItem(String itemName, Material Material, List<String> lore, Rarity Rarity) {
        ItemStack item = new ItemStack(Material, 1);
        ItemMeta meta = item.getItemMeta();
        assert meta != null;
        meta.setDisplayName(Rarity.RarityColor + itemName);
        lore.add("");
        lore.add(Rarity.RarityColor + "§k§l" + Rarity.itemRarity + "§r§k");
        meta.setLore(lore);

        item.setItemMeta(meta);
        return item;
    }
}

