package lecture4;

public class Vehicle2 {
    int passengers;
    int fuelcap;
    int mpg;

    void range() {
        System.out.println(" Дальность - " + fuelcap * mpg + " миль.");
    }
}