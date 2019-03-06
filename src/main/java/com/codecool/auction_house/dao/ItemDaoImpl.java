package com.codecool.auction_house.dao;

import com.codecool.auction_house.model.items.Item;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository("ItemDaoPostgres")
public class ItemDaoImpl implements ItemDao{

    List<Item> items = new ArrayList<>();

    @Override
    public void insertItem(Item item) {

    }

    @Override
    public Item selectItem(int id) {
        return null;
    }

    @Override
    public List<Item> selectWholeItems() {
        return items;
    }

    @Override
    public void updateItem(int id, Item item) {

    }

    @Override
    public void removeItem(int id) {

    }
}
