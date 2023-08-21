package drumeo_music_shop;

import behaviours.ISell;

public class Cymbals extends Instrument implements ISell {
    private InstrumentType type;
    private double buyingPrice;
    private double sellingPrice;

    public Cymbals(String color, String material, double buyingPrice, double sellingPrice) {
        super(color, material);
        this.type = InstrumentType.CYMBALS;
        this.buyingPrice = buyingPrice;
        this.sellingPrice = sellingPrice;
    }

    @Override
    public String play() {
        return "Cymbal crash!";
    }

    @Override
    public double calculateMarkup() {
        return sellingPrice - buyingPrice;
    }
}

