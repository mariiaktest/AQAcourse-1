package lecture4;

import java.util.Arrays;

public class TwoVehicles2 {
    public static void main(String[] args) {
        Vehicle minivan = new Vehicle();
        Vehicle sportcar = new Vehicle();

        int range1, range2;

        minivan.passengers = 6;
        minivan.fuelcap = 22;
        minivan.mpg = 31;

        sportcar.passengers = 2;
        sportcar.fuelcap = 12;
        sportcar.mpg = 20;

        System.out.println("Мини-фургон может перевезти " + minivan.passengers + " пассажиров ");
        minivan.range();

        System.out.println("Cпорткар может перевезти " + sportcar.passengers + " пассажиров ");
        sportcar.range();

    }
}
