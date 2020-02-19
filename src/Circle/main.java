package Circle;

public class main {
    public static void main(String[] args) {
        Circle c = new Circle(5.0, "White");
        System.out.println("Area of this circle is: "+c.getArea());
        System.out.println(c.toString());

        Cylinder c1 = new Cylinder(4.0,"blue",2.0);
        System.out.println("Volume of this cylinder is: "+ c1.getVolume());
        System.out.println(c1.toString());
    }
}
