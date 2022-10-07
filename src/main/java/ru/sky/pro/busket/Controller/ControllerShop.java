package ru.sky.pro.busket.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import ru.sky.pro.busket.Entity.Item;
import ru.sky.pro.busket.Service.ServiceShopImpl;

import java.util.ArrayList;
import java.util.HashSet;

@RestController
@RequestMapping("/order")
public class ControllerShop {

    private final ServiceShopImpl serviceForShop;

    public ControllerShop(ServiceShopImpl serviceForShop) {
        this.serviceForShop = serviceForShop;
    }


    @GetMapping("/get")
    public HashSet<Item> get() {
        return serviceForShop.get();
    }

    @GetMapping("/add")
    public void add(@RequestParam("id") ArrayList<Integer> id) {
        serviceForShop.add(id);
    }

}
