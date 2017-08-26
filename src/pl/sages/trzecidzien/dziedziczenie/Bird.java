package pl.sages.trzecidzien.dziedziczenie;

public abstract class Bird extends Pet{
    public Bird(String name) {
        super(name);
    }

    public void fly() {};

    @Override
    public String toString() {
        return super.toString();
    }
}
