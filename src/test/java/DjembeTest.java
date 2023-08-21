import drumeo_music_shop.Djembe;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class DjembeTest {
    Djembe djembe;

    @Before
    public void setUp() {
        djembe = new Djembe("Red", "Leather", 100.0, 150.0);
    }

    @Test
    public void canPlay() {
        assertEquals("Djembe rhythm!", djembe.play());
    }

    @Test
    public void canCalculateMarkup() {
        assertEquals(50.0, djembe.calculateMarkup(), 0.01);
    }
}
