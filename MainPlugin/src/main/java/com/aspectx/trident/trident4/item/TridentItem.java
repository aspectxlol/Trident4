package com.aspectx.trident.trident4.item;

import org.bukkit.Material;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.List;

public class TridentItem {
    public TridentItem(String Name, Material Material, int Amount, List<String> lore, Rarity rarity, Boolean isUnbreakable) {
        ItemStack item = new ItemStack(Material, Amount);
        ItemMeta meta = item.getItemMeta();
        assert meta != null;
        meta.setDisplayName(rarity.toItemTitle(Name));
        rarity.addRarityTag(lore);
        meta.setLore(lore);
        meta.setUnbreakable(isUnbreakable);
        meta.addItemFlags(ItemFlag.HIDE_DESTROYS);
        meta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
        meta.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
    }
}