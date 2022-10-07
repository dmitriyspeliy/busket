package ru.sky.pro.busket.Service;

import ru.sky.pro.busket.Entity.Item;

import java.util.ArrayList;
import java.util.HashSet;

public interface ServiceForShop {
    HashSet<Item> get();

    void add(ArrayList<Integer> arr);
}
