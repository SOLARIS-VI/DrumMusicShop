package drumeo_music_shop;

import behaviours.IPlay;

public abstract class Instrument implements IPlay {
    private final String color;
    private final String material;

    public Instrument(String color, String material) {
        this.color = color;
        this.material = material;
    }

    public String getColor() {
        return color;
    }

    public String getMaterial() {
        return material;
    }


    @Override
    public abstract String play();
}

