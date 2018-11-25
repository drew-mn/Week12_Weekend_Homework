import behaviours.ISell;
import java.util.ArrayList;

public class Shop {

    public String name;
    private ArrayList<ISell> stock;

    public Shop(String name, ArrayList<ISell> stock) {
        this.name = name;
        this.stock = stock;
    }

    public String getName() {
        return name;
    }

    public int stockCount() {
        return this.stock.size();
    }

    public boolean checkItemsInStock(ISell item){
        return (this.stock.contains(item));
    }

    public void addStock(ISell item) {
        this.stock.add(item);
    }

    public void removeStock(ISell item){
        ISell foundItem = null;
        for (ISell iSell : this.stock){
            if (iSell == item){
                foundItem = item;
            }
        } this.stock.remove(foundItem);
    }

    public int calculateProfit(){
        int total = 0;
        for (ISell item : this.stock) {
            total += item.calculateMarkup();
        }
        return total;
    }
}