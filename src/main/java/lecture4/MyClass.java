package lecture4;

public class MyClass {
    private int alpha; // закрытый доступ
    public int betta; // открытый доступ
    int gamma; // тип доступа по умолчанию (public)

    void setAlpha(int a){
        alpha = a;
    }

    int getAlpha(){
        return alpha;
    }

    public int getBetta() {
        return betta;
    }

    public void setBetta(int betta) {
        this.betta = betta;
    }

    public int getGamma() {
        return gamma;
    }

    public void setGamma(int gamma) {
        this.gamma = gamma;
    }
}

