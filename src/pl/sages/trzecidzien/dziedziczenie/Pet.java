package pl.sages.trzecidzien.dziedziczenie;

public abstract class Pet {
    protected String name;


    public Pet(String name) {
        this.name = name;
        //alt+insert na PC lub command+n Mac
    }


    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Pet{" +
                "name='" + name + '\'' +
                '}';
    }

    public abstract void voice();

}
