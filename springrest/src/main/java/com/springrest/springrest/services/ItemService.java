package com.springrest.springrest.services;
import com.springrest.springrest.MyItem.MyItem;
import java.util.List;

public interface ItemService {
    public List<MyItem> getItemList();
    public MyItem getItem(int itemid);
    MyItem createItem(MyItem item);
    MyItem deleteItem(int itemid);
}
