package homewqork4part2;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Salad salad = new Salad();
        salad.addIngredient(new Tomato("Помидор", 400, 120));
        salad.addIngredient(new Cucumber("Огурец", 300, 100));
        salad.addIngredient(new Onion("Лук", 50, 15));
        salad.addIngredient(new Cabbage("Капуста", 200, 100));
        System.out.println("Калорийность салата: " + salad.getCalories() + " каллорий на 100 грамм");
        List<Vegetable> sortedByCalories = salad.sortByCalories("Desc");


        for(int i = 0; i < sortedByCalories.size(); i++){
            System.out.println(sortedByCalories.get(i).getName() + " " + sortedByCalories.get(i).getCalories());
        }
    }




        }


