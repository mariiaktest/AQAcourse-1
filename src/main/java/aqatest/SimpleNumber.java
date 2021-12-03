package aqatest;

import java.io.IOException;
import java.util.Arrays;

public class SimpleNumber {
    public static void main(String[] args) {

        for (int x = 2; x <= 100; x++) {
            boolean SimpleNumber = true;
            for (int y = 2; y < x; y++) {
                if (x % y == 0) {
                    SimpleNumber = false;
                    break;
                }
            }
            if (SimpleNumber) {
                System.out.println(x + " Is prime number");
            }

        }
    }
}




