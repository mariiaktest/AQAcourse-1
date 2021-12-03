package lecture4;

import java.util.Arrays;

public class OverloadDemo {
    public static void main(String[] args) {
        Overload ob = new Overload();
        int resI;
        int resD;

        ob.ovlDemo();
        System.out.println();

        ob.ovlDemo(3);
        System.out.println();

        resI = ob.ovlDemo(3, 4);
        System.out.println("Результат вызова ob.ovlDemo(3,4): " + resI);
        System.out.println();

        resD = ob.ovlDemo(5, 7);
        System.out.println("Результат вызова ob.ovlDemo(5,7): " + resD);
        System.out.println();
    }
}
