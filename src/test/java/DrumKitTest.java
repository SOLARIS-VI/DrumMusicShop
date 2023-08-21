import drumeo_music_shop.DrumKit;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class DrumKitTest {
    DrumKit drumKit;

    @Before
    public void setUp() {
        drumKit = new DrumKit("Silver", "Metal", 500.0, 700.0);
    }

    @Test
    public void canPlay() {
        assertEquals("Drum roll!", drumKit.play());
    }

    @Test
    public void canCalculateMarkup() {
        assertEquals(200.0, drumKit.calculateMarkup(), 0.01);
    }
}
