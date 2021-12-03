package aqatest;

import java.util.Arrays;

public class NumberSum {
    public static void main(String[] args) {
        int count = 0;
        for (int i = 100000; i<= 999999; i++){
            int left = (i/100000) + ( i / 10000 % 10) + ( i/1000%10);
            int right = ( i/100%10) + (i/10%10) + (i%10);

          if ( left == right){
              count++;


          }

        }
        System.out.println(count);
    }
}
