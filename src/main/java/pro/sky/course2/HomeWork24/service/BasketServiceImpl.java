package pro.sky.course2.HomeWork24.service;

import org.springframework.stereotype.Service;
import org.springframework.web.context.annotation.SessionScope;
import pro.sky.course2.HomeWork24.model.Basket;

import java.util.Collection;
import java.util.List;
@SessionScope
@Service
public class BasketServiceImpl implements BasketService {

    private final Basket basket;
    public BasketServiceImpl(Basket basket) {
        this.basket = basket;
    }

    @Override
    public List<Integer> add(List<Integer> items) {
        for (Integer id : items)
            basket.addProduct(id);
        return items;
    }

    @Override
    public List<Integer> get() {
        return basket.get();

    }
}