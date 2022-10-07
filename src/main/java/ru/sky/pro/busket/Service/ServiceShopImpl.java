package ru.sky.pro.busket.Service;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;
import ru.sky.pro.busket.Entity.Busket;
import ru.sky.pro.busket.Entity.Item;

import java.util.ArrayList;
import java.util.HashSet;

@Service
public class ServiceShopImpl implements ServiceForShop{

    private final Busket busket;

    public ServiceShopImpl(Busket busket){
        this.busket = busket.sessionScopedBean();
    }

    @Override
    public HashSet<Item> get() {
        return busket.getUnicList();
    }

    @Override
    public void add(ArrayList<Integer> arr) {
        arr.forEach(x->busket.getUnicList().add(new Item(x)));
    }
}
