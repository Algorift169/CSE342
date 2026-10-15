package October15;

abstract class Shape {
    protected double length;
    protected double width;

    protected Shape() {
        this.length = 0.0;
        this.width = 0.0;
    }

    public Shape(double length, double width) {
        this.length = length;
        this.width = width;
    }

    abstract double area();

    abstract void display();
}

class Rectangle extends Shape {
    public Rectangle(double length, double width) {
        super(length, width);
    }

    public double area() {
        return this.length * this.width;
    }

    void display() {
        System.out.println("Length: " + this.length);
        System.out.println("Width: " + this.width);
        // System.out.println("Area: );
    }
}

public class abs {
    public static void main(String[] args) {
        Rectangle[] Rec = new Rectangle[3];

        Rec[0] = new Rectangle(2, 3);
        Rec[1] = new Rectangle(1, 5);
        Rec[2] = new Rectangle(2.56, 12.55);

        for (int i = 0; i < Rec.length; i++) {
            System.out.println("Rectangle: " + (i + 1) + "\n");
            Rec[i].display();
            System.out.println("Area:" + Rec[i].area());
            System.out.println("____________________________________________");
        }
    }
}
