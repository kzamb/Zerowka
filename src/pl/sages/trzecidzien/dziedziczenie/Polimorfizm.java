package pl.sages.trzecidzien.dziedziczenie;

public class Polimorfizm {

    public static void show(Pet pet) {
        System.out.println("To jest zwierzątko o imieniu: " + pet.getName());

    }
    public static void show(Dog dog) {
        System.out.println("To jest pies o umieniu "+ dog.getName());
    }


    public static void main(String[] args) {
        Dog pies = new Dog("Ciapek");
        Cat kot = new Cat("Mruczek");


        Pet zwierzatko1 = new Dog("Pongo");
        Pet zwierzatko2 = new Cat("Bonifacy");

        ((Dog) zwierzatko1).aport(); //niezalecana

        zwierzatko1.voice();
        zwierzatko2.voice();

        show(kot);

        Parrot papuga = new Parrot("Kamila");
        papuga.fly();
        Pet polly = new Parrot("Druga papuga");
        show((Pet) polly);


    }
}
