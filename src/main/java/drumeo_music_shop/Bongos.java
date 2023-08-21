package drumeo_music_shop;

import behaviours.ISell;

public class Bongos extends Instrument implements ISell {
    private InstrumentType type;
    private double buyingPrice;
    private double sellingPrice;

    public Bongos(String color, String material, double buyingPrice, double sellingPrice) {
        super(color, material);
        this.type = InstrumentType.BONGOS;
        this.buyingPrice = buyingPrice;
        this.sellingPrice = sellingPrice;
    }

    @Override
    public String play() {
        return "Bongo sound!";
    }

    @Override
    public double calculateMarkup() {
        return sellingPrice - buyingPrice;
    }
}
