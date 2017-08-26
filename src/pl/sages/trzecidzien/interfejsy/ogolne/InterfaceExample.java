package pl.sages.trzecidzien.interfejsy.ogolne;

public class InterfaceExample {
    public static void main(String[] args) {
        Shape kwadrat = new Rectangle(10,10);
        Shape circle = new Circle(5);

        System.out.println(kwadrat.getArea());
        System.out.println(circle.getArea());

    }
}
