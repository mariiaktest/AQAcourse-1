package lecture4;

import java.util.Arrays;

public class AbsDemo {
    public static void main(String[] args) {
        TwoDShape shapes[] = new TwoDShape[4];

        shapes [0] = new Triangle("контурный", 8.0, 12.0);
        shapes [1] = new Rectangle(5);
        shapes [2] = new Rectangle(6,6);
        shapes [3] = new Triangle(7.0);

        for(int i = 0; i < shapes.length; i++){
            System.out.println("Обьект - " + shapes[i].getName());
            System.out.println("Площадь - " + shapes[i].area());
            System.out.println();
        }
    }
}
