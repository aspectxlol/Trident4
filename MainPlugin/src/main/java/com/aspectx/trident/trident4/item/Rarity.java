package com.aspectx.trident.trident4.item;

import java.util.List;
import java.util.Objects;

public class Rarity extends TridentRarity {
    public String rarity;
    public String Color_Code;

    public Rarity(String key) {
            this.rarity = key;
            if (Objects.equals(rarity, "unCommon")) {
                this.Color_Code = "§7";
            } else if (Objects.equals(rarity, "Common")) {
                this.Color_Code = "§r";
            } else if (Objects.equals(rarity, "Rare")) {
                this.Color_Code = "§1";
            } else if (Objects.equals(rarity, "Epic")) {
                this.Color_Code = "§5";
            } else if (Objects.equals(rarity, "Legendary")) {
                this.Color_Code = "§6";
            } else if (Objects.equals(rarity, "Mythic")) {
                this.Color_Code = "§d";
            }
        }

    public String toItemTitle(String itemName) {
        return this.Color_Code + itemName;
    }

    public void addRarityTag(List<String> lore) {
        lore.add("");
        lore.add("§ka§l" + this.rarity + "§ka");
    }
}
