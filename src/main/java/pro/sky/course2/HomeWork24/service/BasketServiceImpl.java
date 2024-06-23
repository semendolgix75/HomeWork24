package pro.sky.course2.HomeWork24.service;

import org.springframework.stereotype.Service;
import org.springframework.web.context.annotation.SessionScope;
import pro.sky.course2.HomeWork24.model.BasketImpl;

import java.util.List;
@SessionScope
@Service
public class BasketServiceImpl implements BasketService {

    private final BasketImpl basket;
    public BasketServiceImpl(BasketImpl basket) {
        this.basket = basket;
    }

    @Override
    public List<Integer> add(List<Integer> BasketList) {
        return basket.add(BasketList);
    }

    @Override
    public List<Integer> get() {
        return basket.get();

    }
}