package drumeo_music_shop;

import behaviours.ISell;

public class Cajon extends Instrument implements ISell {
    private InstrumentType type;
    private double buyingPrice;
    private double sellingPrice;

    public Cajon(String color, String material, double buyingPrice, double sellingPrice) {
        super(color, material);
        this.type = InstrumentType.CAJON;
        this.buyingPrice = buyingPrice;
        this.sellingPrice = sellingPrice;
    }

    @Override
    public String play() {
        return "Cajon beats!";
    }

    @Override
    public double calculateMarkup() {
        return sellingPrice - buyingPrice;
    }
}

