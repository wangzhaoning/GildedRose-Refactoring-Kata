package com.gildedrose.item;

import com.gildedrose.Item;

public class AgeBire extends Item {
    public AgeBire( int sellIn, int quality) {
        super("Aged Brie", sellIn, quality);
    }

    @Override
    protected void updateQualityAfterExpiration() {
        increaseQuality();
    }

    @Override
    protected void updateQuality() {
        increaseQuality();
    }
}
