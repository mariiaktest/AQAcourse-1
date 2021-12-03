package lecture4;

import java.util.Arrays;

public class TwoVehicles5 {
    public static void main(String[] args) {
        Vehicle5 minivan = new Vehicle5(12, 23, 33);
        Vehicle5 sportcar = new Vehicle5(2, 8, 12);
        double galoons;
        int dist = 252;

        galoons = minivan.fuelNeeded(dist);
        System.out.println("Для преодаления " + dist + " миль мини-фургону требуется " + galoons + " галлонов топлива");

        galoons = sportcar.fuelNeeded(dist);
        System.out.println("Для преодаления " + dist + " миль спорткару требуется " + galoons + " галлонов топлива");
        }

    }

