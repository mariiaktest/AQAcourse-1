package lecture4;

public class Vehicle3 {
    int passengers;
    int fuelcap;
    int mpg;

    int range(){
        return fuelcap * mpg;
    }
}
