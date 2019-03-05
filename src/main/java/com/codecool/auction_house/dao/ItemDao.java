package com.codecool.auction_house.dao;

import com.codecool.auction_house.model.items.Item;

import java.util.List;

public interface ItemDao {

    void insertItem(Item item);

    Item selectItem(int id);

    List<Item> selectWholeItems();

    void updateItem(int id, Item item);

    void removeItem(int id);

}
