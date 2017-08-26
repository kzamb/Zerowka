package pl.sages.trzecidzien.interfejsy.zadania;

public class Line extends Point {

    private Point p1;
    private Point p2;


    public Line(double x, double y, Point p1, Point p2) {
        super(x, y);
        this.p1 = p1;
        this.p2 = p2;
    }

    public double getLength () {
        return this.p1.distance(p2);
    }
    private double wspM () {
        return (this.p1.getY() - this.p2.getY()) / (this.p1.getX() - this.p2.getX());
    }

    public boolean isParallel (Line line) {

        return (this.wspM()==line.wspM());

    }
    public boolean isPerpendicular (Line line) {

        return (this.wspM()==- line.wspM());

    }

    public Point getP1() {
        return p1;
    }

    public void setP1(Point p1) {
        this.p1 = p1;
    }

    public Point getP2() {
        return p2;
    }

    public void setP2(Point p2) {
        this.p2 = p2;
    }
}
