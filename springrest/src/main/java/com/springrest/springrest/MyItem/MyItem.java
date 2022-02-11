package com.springrest.springrest.MyItem;

public class MyItem {
    private int itemId;
    private String itemName;

    public MyItem(int itemId, String itemName) {
        this.itemId = itemId;
        this.itemName = itemName;
    }

    public MyItem() {
    }

    public int getItemId() {
        return itemId;
    }

    public void setItemId(int itemId) {
        this.itemId = itemId;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    @Override
    public String toString() {
        return "MyItem{" +
                "itemId=" + itemId +
                ", itemName='" + itemName + '\'' +
                '}';
    }
}
