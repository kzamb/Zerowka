package pl.sages.trzecidzien.interfejsy.zadania;
//Stworzyć klasę prostokąt, która podobnie jak koło implementuje dwa przedstawione wcześniej interfejsy.

public class Rectangle implements HasArea, HasCircumference {

    private Point leftBottom;
    private Point rightUpper;


    @Override
    public double getArea() {

        return (getaDiffX()) *
                (getDiffY());
    }

    @Override
    public double getCircumference() {
        return 2*getaDiffX() + 2*getDiffY();
    }

    private double getDiffY() {
        return rightUpper.getY() - leftBottom.getY();
    }

    private double getaDiffX() {
        return (rightUpper.getX() - leftBottom.getX());
    }


    public boolean hasCommonArea (Rectangle other) {
        // sprawdzic czy odleglosc sredkow jest wieksza od sum polowy odleglosci w 2 wymiarach
        return false;
    }
}
