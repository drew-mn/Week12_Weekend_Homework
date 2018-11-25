package instruments;

public class Guitar extends Instrument {

    private int numberOfStrings;

    public Guitar(String description, String brand, int purchasePrice, int sellingPrice, InstrumentType type, int numberOfStrings) {
        super(description, brand, purchasePrice, sellingPrice, type);
        this.numberOfStrings = numberOfStrings;

    }


    public String play() {
        return "Guitar sound";
    }

    public int getNumberOfStrings() {
        return numberOfStrings;
    }
}