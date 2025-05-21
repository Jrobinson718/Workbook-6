package com.pluralsight.collection;

import java.util.ArrayList;
import java.util.List;

public class FixedList<T> {
    List<T> items = new ArrayList<>();
    int maxSize;


    public FixedList(int maxSize) {
        this.maxSize = maxSize;
    }

    public List<T> getItems() {
        return items;
    }

    public void add(T item) {
        if (this.items.size() < this.maxSize) {
            items.add(item);
        }
    }
}
