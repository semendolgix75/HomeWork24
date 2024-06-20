package pro.sky.course2.HomeWork24.model;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
@Component
public class Basket {
    private final List<Integer> basketList = new ArrayList<>();

    public void addProduct(Integer items) {
        basketList.add(items);
    }

    public List<Integer> get() {
        return new ArrayList<>(basketList);
    }


}
