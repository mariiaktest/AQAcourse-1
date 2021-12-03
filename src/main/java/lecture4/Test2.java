package lecture4;

public class Test2 {
    int a, b;

    Test2(int i, int j){
        a = i;
        b = j;
    }
    void change(Test2 ob){
        ob.a = ob.a + ob.b;
        ob.b = - ob.b;
    }
}
