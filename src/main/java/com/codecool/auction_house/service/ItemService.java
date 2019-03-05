package com.codecool.auction_house.service;

import com.codecool.auction_house.dao.ItemDao;
import com.codecool.auction_house.model.items.Item;

import java.util.List;

public class ItemService {

    private final ItemDao itemDao;

    public ItemService(ItemDao itemDao) {
        this.itemDao = itemDao;
    }

    public void addItem(Item item) {
        itemDao.insertItem(item);
    }

    public Item selectItem(int id) {
        return itemDao.selectItem(id);
    }

    public List<Item> selectWholeItems() {
        return itemDao.selectWholeItems();
    }

    public void updateItem(int id, Item item) {
        itemDao.updateItem(id, item);
    }

    public void removeItem(int id) {
        itemDao.removeItem(id);
    }
}
