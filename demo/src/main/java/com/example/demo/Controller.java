package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class Controller {

    @Autowired
    private MyService myService;

    @GetMapping("/items")
    public List<Item> getAllItems() {
        return myService.getAllItems();
    }

    @PostMapping("/items")
    public Item createItem(@RequestBody Item item) {
        return myService.createItem(item);
    }

    @GetMapping("/items/{id}")
    public Item getItemById(@PathVariable int id) {
        return myService.getItemById(id);
    }

    @PutMapping("/items/{id}")
    public Item updateItem(@PathVariable int id, @RequestBody Item item) {
        return myService.updateItem(id, item);
    }

    @DeleteMapping("/items/{id}")
    public void deleteItem(@PathVariable int id) {
        myService.deleteItem(id);
    }
}
