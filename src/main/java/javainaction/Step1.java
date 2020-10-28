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
        menu.add(new Dish("pork", false, 800, Dish.Type.MEAT));
        menu.add(new Dish("beef", false, 700, Dish.Type.MEAT));
        menu.add(new Dish("chicken", false, 400, Dish.Type.MEAT));
        menu.add(new Dish("french fries", false, 530, Dish.Type.OTHER));
        menu.add(new Dish("rice", true, 350, Dish.Type.OTHER));
        menu.add(new Dish("season fruit", true, 120, Dish.Type.OTHER));
        menu.add(new Dish("pizza", true, 550, Dish.Type.OTHER));
        menu.add(new Dish("prawns", false, 300, Dish.Type.FISH));
        menu.add(new Dish("salmon", false, 450, Dish.Type.FISH));

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
