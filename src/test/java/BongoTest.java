import drumeo_music_shop.Bongos;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class BongoTest {
    Bongos bongos;

    @Before
    public void setUp() {
        bongos = new Bongos("Brown", "Wood", 50.0, 80.0);
    }

    @Test
    public void canPlay() {
        assertEquals("Bongo sound!", bongos.play());
    }

    @Test
    public void canCalculateMarkup() {
        assertEquals(30.0, bongos.calculateMarkup(), 0.01);
    }
}
