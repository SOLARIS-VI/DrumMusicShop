package drumeo_music_shop;

import behaviours.ISell;

public class CymbalRacks implements ISell {
    private InstrumentType type;
    private double buyingPrice;
    private double sellingPrice;

    public CymbalRacks(String silver, String metal, double buyingPrice, double sellingPrice) {
        this.type = InstrumentType.CYMBAL_RACKS;
        this.buyingPrice = buyingPrice;
        this.sellingPrice = sellingPrice;
    }

    @Override
    public double calculateMarkup() {
        return sellingPrice - buyingPrice;
    }
}

