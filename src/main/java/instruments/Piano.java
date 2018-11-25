package instruments;

public class Piano extends Instrument {

    private int numberOfKeys;

    public Piano(String description, String brand, int purchasePrice, int sellingPrice, InstrumentType type, int numberOfKeys) {
        super(description, brand, purchasePrice, sellingPrice, type);
        this.numberOfKeys = numberOfKeys;

    }


    public String play() {
        return "Piano sound";
    }

    public int getNumberOfKeys() {
        return numberOfKeys;
    }

}