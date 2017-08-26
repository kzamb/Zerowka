package pl.sages.trzecidzien.interfejsy.zadania;

public class Polygon implements HasCircumference {
    private Point[] points;


    @Override
    public double getCircumference() {

        double suma=0;

        for(int i=0; i<points.length;i++) {
            suma+=points[i].distance(points[i+1]);
        }
        suma+=points[points.length].distance(points[0]);

        return suma;
    }
}
