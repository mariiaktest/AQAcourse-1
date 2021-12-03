package lecture4;

import java.util.Arrays;

public class SDemo {
    public static void main(String[] args) {
        StaticDemo ob1 = new StaticDemo();
        StaticDemo ob2 = new StaticDemo();

        ob1.x = 22;
        ob2.x = 33;

        System.out.println("ob1.x и ob2.x независимы. ob1.x: " + ob1.x + " " + ob2.x);
        System.out.println();

        System.out.println("Статическая переменная y - общая");
        System.out.println("Присвоим StaticDemo.y значение 19");
        StaticDemo.y = 19;

        System.out.println("ob1.sum: " + ob1.sum());
        System.out.println("ob2.sum: " + ob2.sum());
        System.out.println();

        System.out.println("Изменим StaticDemo.y значение 100" );
        StaticDemo.y = 100;

        System.out.println("ob1.sum: " + ob1.sum());
        System.out.println("ob2.sum: " + ob2.sum());
        System.out.println();
    }

}
