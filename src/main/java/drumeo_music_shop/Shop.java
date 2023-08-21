package drumeo_music_shop;

import behaviours.ISell;

import java.util.ArrayList;

public class Shop {
    private final ArrayList<ISell> stock;

    public Shop() {
        this.stock = new ArrayList<>();
    }

    public ArrayList<ISell> getStock() {
        return stock;
    }

    public void addStock(ISell item) {
        stock.add(item);
    }

    public void removeStock(ISell item) {
        stock.remove(item);
    }

    public double totalPotentialProfit() {
        double total = 0;
        for (ISell item : stock) {
            total += item.calculateMarkup();
        }
        return total;
    }
}

