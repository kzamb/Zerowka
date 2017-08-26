package pl.sages.trzecidzien.vendingmachine;

public enum Coin {
    FIVE_ZL(500),
    TWO_ZL(200),
    ONE_ZL(100),
    FIFTY_GR(50),
    TWENTY_GR(20),
    TEN_GR(10);

    private int value;

    Coin(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}
