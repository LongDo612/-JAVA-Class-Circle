package Circle;

public class Cylinder extends Circle{
    double height;

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public Cylinder(double radius, String color, double height) {
        super(radius, color);
        this.height = height;
    }

    public Cylinder() {
    }

    public double getVolume() {
        return super.getArea() * height;
    }

    @Override
    public String toString() {
        return "This cylinder has bottom radius: " +super.getRadius()+", color: "+super.getColor()+", height is: " + getHeight()+", subclass of: "+super.toString();
    }
}
