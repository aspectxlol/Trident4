package com.aspectx.trident.trident4.items;

import java.util.Objects;

public class Rarity {
    public String itemRarity;
    public String RarityColor;
    public Rarity(String rarity) {
        this.itemRarity = rarity;
        if (Objects.equals(rarity, "unCommon")) {
            this.RarityColor = "§7";
        } else if (Objects.equals(rarity, "Common")) {
            this.RarityColor = "§r";
        } else if (Objects.equals(rarity, "Rare")) {
            this.RarityColor = "§1";
        } else if (Objects.equals(rarity, "Epic")) {
            this.RarityColor = "§5";
        } else if (Objects.equals(rarity, "Legendary")) {
            this.RarityColor = "§6";
        } else if (Objects.equals(rarity, "Mythic")) {
            this.RarityColor = "§d";
        } else {
            this.RarityColor = "§r";
        }
    }
}
