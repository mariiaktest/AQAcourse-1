package lecture4;

public class B2 extends A{
    int k;
    B2(int a, int b, int c){
        super(a, b);
        k =c;
    }

    void show(){
        super.show();
        System.out.println("k: " + k);
    }
}
