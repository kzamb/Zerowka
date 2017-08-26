package pl.sages.trzecidzien.interfejsy.ogolne;

public class Circle implements Shape {

    private double r;

    public Circle(double r) {
        this.r = r;
    }

    @Override
    public double getArea() {
        return Math.PI*r*r;
    }
}
