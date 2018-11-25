package instruments;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class GuitarTest {

    Guitar guitar;

    @Before
    public void setUp() {
        guitar = new Guitar("Songwriter 12 String", "Gibson", 1500, 2000, InstrumentType.STRING, 12);
    }

    @Test
    public void getDescription() {
        assertEquals("Songwriter 12 String", guitar.getDescription());
    }

    @Test
    public void getBrand() {
        assertEquals("Gibson", guitar.getBrand());
    }

    @Test
    public void getPurchasePrice() {
        assertEquals(1500, guitar.getPurchasePrice());
    }

    @Test
    public void getSellingPrice() {
        assertEquals(2000, guitar.getSellingPrice());
    }

    @Test
    public void getInstrumentType() {
        assertEquals(InstrumentType.STRING, guitar.getType());
    }

    @Test
    public void play() {
        assertEquals("Guitar sound", guitar.play());
    }

    @Test
    public void canCalculateMarkup() {
        assertEquals(500, guitar.calculateMarkup());
    }

    @Test
    public void getNumberOfStrings() {
        assertEquals(12, guitar.getNumberOfStrings());
    }
}