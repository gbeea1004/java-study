package javainaction;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Step1 {
    private static final Logger log = LoggerFactory.getLogger(Step1.class);

    public static void main(String[] args) {
        List<Dish> menu = new ArrayList<>();
        menu.add(new Dish(100, "사과"));
        menu.add(new Dish(200, "라면"));
        menu.add(new Dish(300, "스파게티"));
        menu.add(new Dish(400, "치킨"));
        menu.add(new Dish(500, "밀리터리버거"));

        List<String> lowCaloricDishesName = menu.stream()
                                                .filter(d -> d.getCalories() < 400)
                                                .sorted(Comparator.comparing(Dish::getCalories))
                                                .map(Dish::getName)
                                                .collect(Collectors.toList());
        for (String name : lowCaloricDishesName) {
            log.debug(name);
        }
    }
}
