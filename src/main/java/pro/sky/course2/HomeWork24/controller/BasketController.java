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
@RequestMapping("/order")
public class BasketController {

    private final BasketService basketService;

    public BasketController(BasketService basketService) {
        this.basketService = basketService;
    }

    @GetMapping("add")
    public List<Integer> add(@RequestParam List<Integer> goods) {
        return basketService.add(goods);
    }

    @GetMapping("get")
    public List<Integer> get() {
        return basketService.get();
    }
}