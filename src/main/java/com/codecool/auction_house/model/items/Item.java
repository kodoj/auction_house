package com.codecool.auction_house.model.items;

import java.util.Objects;

public class Item {

    String name;
    String descriptin;
    ItemType type;
    Game game;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescriptin() {
        return descriptin;
    }

    public ItemType getType() {
        return type;
    }

    public void setType(ItemType type) {
        this.type = type;
    }

    public Game getGame() {
        return game;
    }

    public void setGame(Game game) {
        this.game = game;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Item)) return false;
        Item item = (Item) o;
        return Objects.equals(getName(), item.getName()) &&
                Objects.equals(getDescriptin(), item.getDescriptin()) &&
                getType() == item.getType() &&
                getGame() == item.getGame();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getDescriptin(), getType(), getGame());
    }

    public void setDescriptin(String descriptin) {
        this.descriptin = descriptin;
    }
}
