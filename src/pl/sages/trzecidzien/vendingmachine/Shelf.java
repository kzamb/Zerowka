package pl.sages.trzecidzien.vendingmachine;

public class Shelf {
    private Product product;
    private int counter;

    public Shelf(Product product, int counter) {
        this.product = product;
        this.counter = counter;
    }

    public Product getProduct() {
        return product;
    }

    public int getCounter() {
        return counter;
    }

    public boolean isEmpty() {
        return counter==0;
    }

    public void takeProduct() {
        if (counter>0) { counter--;
        } else {
            System.out.println("Niedozwolona operacja\n" +
                    "Nie można wziąć z pustej półki");
        }

    }
}
