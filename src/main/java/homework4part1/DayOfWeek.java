package homework4part1;

public class DayOfWeek {
    private int day;
    private String name;

    DayOfWeek(int day, String name) {
        this.day = day;
        this.name = name;
    }

    public int getDay() { return this.day; }

    public String getName() {
        return this.name;
    }
}
