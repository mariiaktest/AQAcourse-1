package lecture4;

import java.util.Arrays;

public class TwoVehicles {
    public static void main(String[] args) {
        Vehicle minivan = new Vehicle();
        Vehicle sportcar = new Vehicle();
        int range, range1;

        minivan.passengers = 7;
        minivan.fuelcap = 23;
        minivan.mpg = 12;

        sportcar.passengers = 1;
        sportcar.fuelcap = 12;
        sportcar.mpg = 8;

        range = minivan.fuelcap * minivan.mpg;
        range1 = sportcar.fuelcap * sportcar.mpg;

        System.out.println("Мини-фургон может перевезти " + minivan.passengers + " пассажиров на растояние " + range + " миль");

        System.out.println("Cпорткар может перевезти " + sportcar.passengers + " пассажирa на растояние " + range1 + " миль");


    }
}
