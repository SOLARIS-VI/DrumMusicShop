package drumeo_music_shop;

import behaviours.ISell;

public class Djembe extends Instrument implements ISell {
    private InstrumentType type;
    private double buyingPrice;
    private double sellingPrice;

    public Djembe(String color, String material, double buyingPrice, double sellingPrice) {
        super(color, material);
        this.type = InstrumentType.DJEMBE;
        this.buyingPrice = buyingPrice;
        this.sellingPrice = sellingPrice;
    }

    @Override
    public String play() {
        return "Djembe rhythm!";
    }

    @Override
    public double calculateMarkup() {
        return sellingPrice - buyingPrice;
    }
}

