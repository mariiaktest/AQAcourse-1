package lecture4;

public class Vehicle5 {
    int passengers;
    int fuelcap;
    int mpg;

    Vehicle5(int p, int f, int m){
        passengers = p;
        fuelcap = f;
        mpg = m;
    }
    int range(){
        return fuelcap * mpg;
    }
    double fuelNeeded(int miles){
        return (double) miles / mpg;
    }

}
