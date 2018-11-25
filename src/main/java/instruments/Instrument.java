package instruments;
import behaviours.IPlay;
import behaviours.ISell;

public abstract class Instrument implements IPlay, ISell {

    private String description;
    private String brand;
    private int purchasePrice;
    private int sellingPrice;
    private InstrumentType type;

    public Instrument(String description,  String brand, int purchasePrice, int sellingPrice, InstrumentType type) {
        super();
        this.description = description;
        this.brand = brand;
        this.purchasePrice = purchasePrice;
        this.sellingPrice = sellingPrice;
        this.type = type;
    }

    public InstrumentType getType() {
        return type;
    }

    public String getDescription() {
        return description;
    }


    public String getBrand() {
        return brand;
    }

    public int getPurchasePrice() {
        return purchasePrice;
    }

    public int getSellingPrice() {
        return sellingPrice;
    }

    public int calculateMarkup() {
        return sellingPrice - purchasePrice;
    }

}
