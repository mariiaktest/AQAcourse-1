package lecture4;

import java.util.Arrays;

public class ParamDemo {
    public static void main(String[] args) {
        ChkNum chkNum = new ChkNum();
        if (chkNum.isEven(10)) System.out.println("10 - четное число");
        if (chkNum.isEven(9)) System.out.println("9 - не четное число");
        if (chkNum.isEven(8)) System.out.println("8 - четное число");
    }
}
