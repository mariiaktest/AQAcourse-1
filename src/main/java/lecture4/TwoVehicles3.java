package lecture4;

import java.sql.SQLOutput;
import java.util.Arrays;

public class TwoVehicles3 {
    public static void main(String[] args) {
        Vehicle3 minivan = new Vehicle3();
        Vehicle3 sportcar = new Vehicle3();
        int range1, range2;

        minivan.passengers = 6;
        minivan.fuelcap = 22;
        minivan.mpg = 31;

        sportcar.passengers = 2;
        sportcar.fuelcap = 12;
        sportcar.mpg = 20;

        range1 = minivan.range();
        range2 = sportcar.range();

        System.out.println("Мини-фургон может перевезти " + minivan.passengers + " пассажиров на растояние " + range1 + " миль");

        System.out.println("Cпорткар может перевезти " + sportcar.passengers + " пассажирa на растояние " + range2 + " миль");
    }

}
