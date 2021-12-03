package homewqork4part2;

import homework4part1.Airline;
import homework4part1.DayOfWeek;
import org.w3c.dom.DOMException;
import org.w3c.dom.DocumentFragment;
import org.w3c.dom.Node;
import org.w3c.dom.ranges.Range;
import org.w3c.dom.ranges.RangeException;

import java.util.*;

public class Salad {
    List<Vegetable> vegetables = new ArrayList<>();

    public void addIngredient(Vegetable vegetable) {
        this.vegetables.add(vegetable);
    }

    public double getCalories() {
        double sum = 0;
        for (int i = 0; i < vegetables.size(); i++) {
            sum = sum + vegetables.get(i).getCalories();
        }
        return sum;
    }

    public List<Vegetable> sortByCalories(String order) {
        List<Vegetable> vegetablesCopy = new ArrayList<>(vegetables);
        if (order == "Desc") {
            Collections.sort(vegetablesCopy, Collections.reverseOrder(new SortByCalories()));
        } else if (order == "Asc") {
            Collections.sort(vegetablesCopy, new SortByCalories());
        }

        return vegetablesCopy;
    }


    }




















