package pl.sages.trzecidzien.vendingmachine;

import java.util.*;

public class CoinDispenser {

    private Map<Coin, Integer> coinCounter = new EnumMap<>(Coin.class);
    private List<Coin> buffer = new ArrayList<>(); // bufor zawiera monety wrzucone do automatu przed rozliczeniem
    private Money bufferCurrentSum = new Money(0);


    public CoinDispenser() {

        for(Coin c: Coin.values()) {
            coinCounter.put(c,0);
        }
    }

    public void insert(Coin coin) {
        buffer.add(coin);
        bufferCurrentSum=bufferCurrentSum.add(coin);

    }

    public Money currentSum() {
     return bufferCurrentSum;
    }

    public List<Coin> returnInsertedMoney() {
        List<Coin> result = buffer;
        buffer = new ArrayList<>();
        bufferCurrentSum=new Money(0);
        return result;
    }

    public boolean canGiveChange(Money money) {
    return bufferCurrentSum.equals(money);

    }

    public List<Coin> giveChange(Money money) {
        return Collections.emptyList();
    }

    public static void main(String[] args) {

    }


}
