package lecture4;

abstract public class TwoDShape {
    private double width;
    private double height;
    private String name;

    TwoDShape(){
        width = height = 0.0;
        name = "none";
    }
    TwoDShape(double w, double h, String n){
        width = w;
        height = h;
        name = n;
        }
        TwoDShape(double x, String n){
        width = height = x;
        name = n;
        }

        TwoDShape(TwoDShape ob){
        width = ob.width;
        height = ob.height;
        name = ob.name;

        }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    void showDim(){
        System.out.println("Ширина и высота - " + width + " и " + height);
    }
    abstract double area();
}

