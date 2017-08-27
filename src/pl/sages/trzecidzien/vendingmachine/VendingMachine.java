package pl.sages.trzecidzien.vendingmachine;

public class VendingMachine {

    private Shelf[] shelves;
    private CoinDispenser dispenser;



    public VendingMachine(int shelfCounter) {

        this.shelves = new Shelf[shelfCounter];
    }




    public void addProductToShelf(Product product, int shelf, int productCount) {
        shelves[shelf] = new Shelf(product, productCount);
    }

    public void setShelf(int shelfNumber, Shelf shelf) {

    }

    public void cancel() {

    }
    public void insertCoin(Coin coin) {




    }
}
