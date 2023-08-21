package drumeo_music_shop;

import behaviours.ISell;

public class DrumKit extends Instrument implements ISell {
    private InstrumentType type;
    private double buyingPrice;
    private double sellingPrice;

    public DrumKit(String color, String material, double buyingPrice, double sellingPrice) {
        super(color, material);
        this.type = InstrumentType.DRUM_KIT;
        this.buyingPrice = buyingPrice;
        this.sellingPrice = sellingPrice;
    }

    @Override
    public String play() {
        return "Drum roll!";
    }

    @Override
    public double calculateMarkup() {
        return sellingPrice - buyingPrice;
    }
}
