package com.example.demo;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class MyService {
    private List<Item> itemList = new ArrayList<>();
    private int idCounter = 1;

    public List<Item> getAllItems() {
        itemList.add(new Item(1,"NAME"));
        return itemList;
    }

    public Item getItemById(int id) {
        for (Item item : itemList) {
            if (item.getId() == id) {
                return item;
            }
        }
        return null;
    }

    public Item createItem(Item item) {
        item.setId(idCounter++);
        itemList.add(item);
        return item;
    }

    public Item updateItem(int id, Item item) {
        for (int i = 0; i < itemList.size(); i++) {
            if (itemList.get(i).getId() == id) {
                item.setId(id);
                itemList.set(i, item);
                return item;
            }
        }
        return null;
    }

    public void deleteItem(int id) {
        itemList.removeIf(item -> item.getId() == id);
    }
}

