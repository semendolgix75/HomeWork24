package pro.sky.course2.HomeWork24.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import pro.sky.course2.HomeWork24.service.BasketService;

import java.util.Collection;
import java.util.List;

@RestController
@RequestMapping("/store/order")
public class BasketController {
    @Autowired
    private BasketService basketService;

    @GetMapping("/add")
    public List<Integer> add(@RequestParam List<Integer> items) {
        return basketService.add(items);
    }

    @GetMapping
    public List<Integer> get() {
        return basketService.get();
    }
}