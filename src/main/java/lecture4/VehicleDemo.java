package lecture4;

import java.util.Arrays;

public class VehicleDemo {
    public static void main(String[] args) {
        Vehicle minivan = new Vehicle();
        int range;

        minivan.passengers = 7;
        minivan.fuelcap = 12;
        minivan.mpg = 21;

        range = minivan.fuelcap * minivan.mpg;
        System.out.println("Мини-фургон может перевезти " + minivan.passengers + " пассажиров на растояние " + range + " миль");
    }
}
