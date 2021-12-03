package homewqork4part2;

import java.util.Comparator;

class SortByCalories implements Comparator<Vegetable> {
    @Override
    public int compare(Vegetable a, Vegetable b){
        return a.getCalories() - b.getCalories();
    }
}

