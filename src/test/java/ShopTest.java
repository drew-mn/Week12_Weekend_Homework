import org.junit.Before;
import org.junit.Test;
import behaviours.ISell;
import instruments.*;
import java.util.ArrayList;
import static org.junit.Assert.*;

public class ShopTest {

    Shop shop;
    Guitar guitar;
    Piano piano;
    ArrayList<ISell> stock;

    @Before
    public void setUp() {
        stock = new ArrayList<ISell>();
        piano = new Piano("Yamaha Grand Piano", "Yamaha",  2000, 2500, InstrumentType.PERCUSSION, 88);
        stock.add(piano);
        guitar = new Guitar("Songwriter 12 String", "Gibson",  1500, 2000, InstrumentType.STRING, 12);
        stock.add(guitar);
        shop = new Shop("Ray's Music Exchange", stock);
    }

    @Test
    public void hasName() {
        assertEquals("Ray's Music Exchange", shop.getName());
    }

    @Test
    public void canCountStock() {
        assertEquals(2, shop.stockCount());
    }

    @Test
    public void canCheckItemsInStock() {
        assertTrue(shop.checkItemsInStock(guitar));
    }

    @Test
    public void canCheckItemsNotInStock() {
        shop.removeStock(guitar);
        assertFalse(shop.checkItemsInStock(guitar));
    }

    @Test
    public void canAddStock() {
        shop.addStock(piano);
        assertEquals(3, shop.stockCount());
    }

    @Test
    public void canRemoveStock() {
        shop.removeStock(guitar);
        assertFalse(shop.checkItemsInStock(guitar));
        assertEquals(1, shop.stockCount());
    }

    @Test
    public void canCalculateProfit() {
        assertEquals(1000, shop.calculateProfit());
    }

}