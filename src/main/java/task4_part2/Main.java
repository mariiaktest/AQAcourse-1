package task4_part2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Введите диапазон для поиска по каллориях");
        System.out.print("Начало диапазона: ");
        String rangeStart = br.readLine();
        System.out.print("Конец диапазона: ");
        String rangeEnd = br.readLine();

        Salad salad = new Salad();
        salad.addIngredient(new Tomato("Помидор", 400, 120));
        salad.addIngredient(new Cucumber("Огурец", 300, 100));
        salad.addIngredient(new Onion("Лук", 50, 15));
        salad.addIngredient(new Cabbage("Капуста", 200, 100));
        System.out.println("\nКаллорийность салата: " + salad.getCalories() + " каллорий на 100 грамм");

        List<Vegetable> sortedByCalories = salad.sortByCalories("Desc");
        List<Vegetable> rangedByCalories = salad.rangeByCalories(Integer.parseInt(rangeStart), Integer.parseInt(rangeEnd));

        System.out.println("\nОтсортировано по каллориях:");

        for(Vegetable vegetable : sortedByCalories){
            System.out.println(vegetable.getName() + "\t" + vegetable.getCalories());
        }

        System.out.println("\nДиапазон каллорий:");

        for (Vegetable vegetable : rangedByCalories) {
            System.out.println(vegetable.getName() + "\t" + vegetable.getCalories());
        }
    }
}
