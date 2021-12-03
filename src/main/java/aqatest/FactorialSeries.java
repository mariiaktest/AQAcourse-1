package aqatest;

import java.util.Arrays;

public class FactorialSeries {
    public static void main(String[] args) {
        int n = 5;
        int result = 0;
        int current_factorial = 1;

        for (int i = 1; i <= n; i++){
            current_factorial *= i;

            if (i % 2 == 0){
                result -= current_factorial;
            }
            else {
                result += current_factorial;
            }
        }

        System.out.println(result);
    }
}
