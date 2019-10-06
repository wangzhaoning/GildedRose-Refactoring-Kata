package com.gildedrose;

class GildedRose {
    Item[] items;

    GildedRose(Item[] items) {
        this.items = items;
    }

    void passOneDay() {
        for (Item item : items) {
            item.passOneDay();
        }
    }

}