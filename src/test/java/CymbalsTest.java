import drumeo_music_shop.Cymbals;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class CymbalsTest {
    Cymbals cymbals;

    @Before
    public void setUp() {
        cymbals = new Cymbals("Golden", "Bronze", 300.0, 400.0);
    }

    @Test
    public void canPlay() {
        assertEquals("Cymbal crash!", cymbals.play());
    }

    @Test
    public void canCalculateMarkup() {
        assertEquals(100.0, cymbals.calculateMarkup(), 0.01);
    }
}
