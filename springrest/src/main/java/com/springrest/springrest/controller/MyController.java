package com.springrest.springrest.controller;
import com.springrest.springrest.MyItem.MyItem;
import com.springrest.springrest.services.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class MyController {

    @Autowired //injecting the @Service annotated class's object
    private ItemService itemservobj;

    @GetMapping("/home")
    public String home(){
        return "Welcome to test!";
    }
    @GetMapping("/items")
    public List<MyItem> getItems(){
        return this.itemservobj.getItemList();
    }

    @GetMapping("/items/{itemid}")
    public MyItem getItem(@PathVariable String itemid){
        return this.itemservobj.getItem(Integer.parseInt(itemid));
    }

    @PostMapping("/items")
    public MyItem createItem(@RequestBody MyItem item){
        return this.itemservobj.createItem(item);
    }

    @DeleteMapping("/items/{itemid}")
    public MyItem deleteItem(@PathVariable String itemid){
        return this.itemservobj.deleteItem(Integer.parseInt(itemid));
    }

}
