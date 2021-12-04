package task4_part2;

import java.util.*;

public class Salad {
    List<Vegetable> vegetables = new ArrayList<>();

    public void addIngredient(Vegetable vegetable) {
        this.vegetables.add(vegetable);
    }

    public double getCalories() {
        double sum = 0;

        for (Vegetable vegetable : vegetables) {
            sum = sum + vegetable.getCalories();
        }

        return sum;
    }

    public List<Vegetable> sortByCalories(String order) {
        List<Vegetable> vegetablesCopy = new ArrayList<>(vegetables);

        if (order.equals("DESC")) {
            Collections.sort(vegetablesCopy, Collections.reverseOrder(new SortByCalories()));
        } else if (order.equals("ASC")) {
            Collections.sort(vegetablesCopy, new SortByCalories());
        }

        return vegetablesCopy;
    }

    public List<Vegetable> rangeByCalories(int start, int end) {
        List<Vegetable> rangedVegetables = new ArrayList<>();

        for (Vegetable vegetable : vegetables) {
            int calories = vegetable.getCalories();

            if (calories >= start && calories <= end) {
                rangedVegetables.add(vegetable);
            }
        }

        return rangedVegetables;
    }
}
