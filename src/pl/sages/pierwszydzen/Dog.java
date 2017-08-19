package pl.sages.pierwszydzen;

/**
 * Created by vjdwmx on 8/19/2017
 */
public class Dog {
    String name;
    int age;

    public Dog(String name) {
        this.name = name;
    }

    public void bark() {
        System.out.println("Jestem " + this.name);
        System.out.println("Hau, Hau");
    }
}
