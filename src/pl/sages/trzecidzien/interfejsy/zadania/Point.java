package pl.sages.trzecidzien.interfejsy.zadania;

public class Point {
    private double x;
    private double y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double distance(Point p) {
        double len =0;
        len = Math.sqrt((this.x - p.x) * (this.x - p.x) + (this.y - p.y)*(this.y - p.y));
        return len;
    }
}
