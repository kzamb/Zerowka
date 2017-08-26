package pl.sages.trzecidzien.dziedziczenie;

public class Polimorfizm {
    public static void main(String[] args) {
        Dog pies = new Dog("Ciapek");
        Cat kot = new Cat("Mruczek");


        Pet zwierzatko1 = new Dog("Pongo");
        Pet zwierzatko2 = new Cat("Bonifacy");

        ((Dog) zwierzatko1).aport(); //niezalecana

        zwierzatko1.voice();
        zwierzatko2.voice();
    }
}
