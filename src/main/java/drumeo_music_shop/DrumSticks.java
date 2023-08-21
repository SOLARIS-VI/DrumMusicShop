package drumeo_music_shop;

import behaviours.ISell;

public class DrumSticks implements ISell {
    private InstrumentType type;
    private double buyingPrice;
    private double sellingPrice;

    public DrumSticks(String wood, double buyingPrice, double sellingPrice) {
        this.type = InstrumentType.DRUM_STICKS;
        this.buyingPrice = buyingPrice;
        this.sellingPrice = sellingPrice;
    }

    @Override
    public double calculateMarkup() {
        return sellingPrice - buyingPrice;
    }
}

