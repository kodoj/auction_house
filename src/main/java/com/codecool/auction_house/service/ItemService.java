package com.codecool.auction_house.service;

import com.codecool.auction_house.dao.ItemDao;
import com.codecool.auction_house.model.items.Item;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ItemService {

    private final ItemDao itemDao;

    @Autowired
    public ItemService(@Qualifier("ItemDaoPostgres") ItemDao itemDao) {
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
