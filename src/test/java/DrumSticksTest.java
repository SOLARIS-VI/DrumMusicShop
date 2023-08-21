import drumeo_music_shop.DrumSticks;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class DrumSticksTest {
    DrumSticks drumSticks;

    @Before
    public void setUp() {
        drumSticks = new DrumSticks("Wood", 10.0, 15.0);
    }

    @Test
    public void canCalculateMarkup() {
        assertEquals(5.0, drumSticks.calculateMarkup(), 0.01);
    }
}
