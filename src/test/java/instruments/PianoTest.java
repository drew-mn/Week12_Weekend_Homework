package instruments;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PianoTest {

    Piano piano;

    @Before
    public void setUp() {
        piano = new Piano("Yamaha Grand Piano", "Yamaha", 4000, 4775, InstrumentType.PERCUSSION, 88);
    }

    @Test
    public void getDescription() {
        assertEquals("Yamaha Grand Piano", piano.getDescription());
    }

    @Test
    public void getBrand() {
        assertEquals("Yamaha", piano.getBrand());
    }

    @Test
    public void getPurchasePrice() {
        assertEquals(4000, piano.getPurchasePrice());
    }

    @Test
    public void getSellingPrice() {
        assertEquals(4775, piano.getSellingPrice());
    }

    @Test
    public void getInstrumentType() {
        assertEquals(InstrumentType.PERCUSSION, piano.getType());
    }


    @Test
    public void play() {
        assertEquals("Piano sound", piano.play());
    }

    @Test
    public void canCalculateMarkup() {
        assertEquals(775, piano.calculateMarkup());
    }

    @Test
    public void getNumberOfKeys() {
        assertEquals(88, piano.getNumberOfKeys());
    }
}