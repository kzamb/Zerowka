package pl.sages.trzecidzien.vendingmachine;

public class VendingMachine {

    private Shelf[] shelves;
    private CoinDispenser dispenser;

    public

    public VendingMachine(int shelfCounter) {
        this.shelves = new Shelf[shelfCounter];
    }




    public void addProductToShelf(Product product, int shelf, int productCount) {
        shelves[shelf] = new Shelf(product, productCount);
    }



}
