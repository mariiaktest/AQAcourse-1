package lecture4;

import java.util.Arrays;

public class TwoVehicles4 {
    public static void main(String[] args) {
        Vehicle4 minivan = new Vehicle4();
        Vehicle4 sportcar = new Vehicle4();
        double galoons;
        int dist = 252;

        minivan.passengers = 6;
        minivan.fuelcap = 22;
        minivan.mpg = 31;

        sportcar.passengers = 2;
        sportcar.fuelcap = 12;
        sportcar.mpg = 20;

        galoons = minivan.fuelNeeded(dist);
        System.out.println("Для преодаления  " + dist + " миль мини-фургону требуется " +  galoons + " галлонов топива");

        galoons = sportcar.fuelNeeded(dist);
        System.out.println("Для преодаления  " + dist + " миль  спорткару требуется " +  galoons + " галлонов топива" );

    }
}
