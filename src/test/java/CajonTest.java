import drumeo_music_shop.Cajon;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class CajonTest {
    Cajon cajon;

    @Before
    public void setUp() {
        cajon = new Cajon("Black", "Wood", 120.0, 180.0);
    }

    @Test
    public void canPlay() {
        assertEquals("Cajon beats!", cajon.play());
    }

    @Test
    public void canCalculateMarkup() {
        assertEquals(60.0, cajon.calculateMarkup(), 0.01);
    }
}
