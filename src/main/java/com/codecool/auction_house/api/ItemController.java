package com.codecool.auction_house.api;

import com.codecool.auction_house.model.items.Item;
import com.codecool.auction_house.service.ItemService;

import java.util.List;

public class ItemController {

    private final ItemService itemService;

    public ItemController(ItemService itemService) {
        this.itemService = itemService;
    }

    public void addItem(Item item) {
        itemService.addItem(item);
    }

    public Item selectItem(int id) {
        return itemService.selectItem(id);
    }

    public List<Item> selectWholeItems() {
        return itemService.selectWholeItems();
    }

    public void updateItem(int id, Item item) {
        itemService.updateItem(id, item);
    }

    public void removeItem(int id) {
        itemService.removeItem(id);
    }
}
