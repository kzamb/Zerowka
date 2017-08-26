package pl.sages.trzecidzien.dziedziczenie;

public class Dog extends Pet {
    public Dog(String name) {
        super(name);
    }
    public void aport() {
        System.out.println("Aport");
    }

    @Override
    public void voice() {
        System.out.println("hau, hau, hauuuuuuu...");
    }
    public static void main(String[] args) {
        Dog reks = new Dog("Reksio");
        System.out.println("ten pies nazywa sie "+ reks.getName());
        reks.voice();
    }
}
