package task4_part2;

public abstract class Vegetable {
    int calories;
    String name;
    int weight;

    public Vegetable(String name, int calories, int weight) {
        this.name = name;
        this.calories = calories;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public String setName(){
        return name;
    }

    public  int getCalories() {
        return calories;
    }

    public int setCalories(){
        return calories;
    }

    public int getWeight(){
        return weight;
    }

    public int setWeight(){
        return weight;
    }

    public double calories(){
        System.out.println("Каллорийность на 100 грамм : " + calories * weight / 100 );
        return calories * weight / 100;
    }
    public String toString() {
        return
                "\nОвощ: " + this.getName() +
                "\nС весом: " + this.getWeight() +
                "\nС калорийностью: " + this.getCalories();
    }


}

