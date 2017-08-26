package pl.sages.trzecidzien.dziedziczenie;

public class Cat extends Pet {
    public Cat(String name) {
        super(name);
    }

    @Override
    public void voice() {
        System.out.println("Miaaaaaaaaaałłłłł");
    }
    public static void main(String[] args) {
        Cat cat = new Cat("Mruczek");
        System.out.println(cat.getName());
        cat.voice();

    }
}
