package pro.sky.course2.HomeWork24.model;

import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.SessionScope;

import java.util.*;

@Component
@SessionScope
public class BasketImpl implements Basket{
    private final Set<Integer> basketList = new HashSet<>();

    public List<Integer> add(List<Integer> basketList) {
        this.basketList.addAll(basketList);
        return new ArrayList<>(this.basketList);
    }

    public List<Integer> get() {
        return new ArrayList<>(this.basketList);
    }


}
