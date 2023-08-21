import drumeo_music_shop.CymbalRacks;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class CymbalRacksTest {
    CymbalRacks cymbalRacks;

    @Before
    public void setUp() {
        cymbalRacks = new CymbalRacks("Silver", "Metal", 100.0, 150.0);
    }

    @Test
    public void canCalculateMarkup() {
        assertEquals(50.0, cymbalRacks.calculateMarkup(), 0.01);
    }
}
