package MusicShop.Instruments;

public class Drum extends Instrument {

    private int setSize;

    public Drum(String material, String colour, String type, int price, int sellPrice, int setSize) {
        super(material, colour, type, price, sellPrice);
        this.setSize = setSize;
    }

    public int getSetSize() {
        return setSize;
    }
}