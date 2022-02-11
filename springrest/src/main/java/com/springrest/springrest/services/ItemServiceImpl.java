package com.springrest.springrest.services;
import com.springrest.springrest.MyItem.MyItem;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;

@Service
public class ItemServiceImpl implements ItemService{

    List<MyItem> list;
    public ItemServiceImpl(){
        list=new ArrayList<MyItem>();
        list.add(new MyItem(1, "first"));
        list.add(new MyItem(2, "Second"));
    }

    @Override
    public List<MyItem> getItemList() {
        return this.list;
    }

    @Override
    public MyItem getItem(int itemid) {
        for(MyItem i: list){
            if(i.getItemId() == itemid) return i;
        }
        return null;
    }

    @Override
    public MyItem createItem(MyItem item) {
        list.add(item);
        return item;
    }

    @Override
    public MyItem deleteItem(int itemid) {
        MyItem delobj = null;
        for(MyItem i: list) if(i.getItemId() == itemid){ delobj = i; break; }
        if(delobj != null) list.remove(delobj);
        return delobj;
    }
}
