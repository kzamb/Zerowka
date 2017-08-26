package pl.sages.trzecidzien.interfejsy.zadania;

public class Circle implements HasArea, HasCircumference {
    private Point center;
    private double radius;

    public Circle(Point center, double radius) {
        this.center = center;
        this.radius = radius;
    }

    public Circle(Point center) {
        this(center, 1.0);
    }

    @Override
    public double getArea() {
        return Math.PI*this.radius*this.radius;
    }

    @Override
    public double getCircumference() {
        return 2*Math.PI*this.radius;
    }

    public boolean hasCommonArea(Circle c) {

        return (this.center.distance(c.center)<=(this.radius + c.radius));
    }

    public boolean isInside(Point p) {

        return (this.center.distance(p)<=this.radius);
    }


    public static void main(String[] args) {

        Circle one   = new Circle(new Point(0,0), 1);
        Circle two   = new Circle(new Point(1,1), 1);
        Circle three = new Circle(new Point(2,2), 1);

        System.out.println(one.hasCommonArea(two)==true);
        System.out.println(one.hasCommonArea(three)==false);
        System.out.println();


    }

}
