package javainaction;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Step1 {
    private static final Logger log = LoggerFactory.getLogger(Step1.class);

    public static void main(String[] args) {
        List<Dish> menu = new ArrayList<>();
        menu.add(new Dish(100, "사과"));
        menu.add(new Dish(200, "라면"));
        menu.add(new Dish(300, "스파게티"));
        menu.add(new Dish(400, "치킨"));
        menu.add(new Dish(500, "밀리터리버거"));

        List<Dish> lowCaloricDishes = new ArrayList<>();
        for (Dish dish : menu) {
            if (dish.getCalories() < 400) {
                lowCaloricDishes.add(dish);
            }
        }
        Collections.sort(lowCaloricDishes, new Comparator<Dish>() {
            @Override
            public int compare(Dish dish1, Dish dish2) {
                return Integer.compare(dish1.getCalories(), dish2.getCalories());
                
            }
        });
        List<String> lowCaloricDishesName = new ArrayList<>();
        for (Dish dish : lowCaloricDishes) {
            lowCaloricDishesName.add(dish.getName());
            log.debug(dish.getName());
        }
    }
}
