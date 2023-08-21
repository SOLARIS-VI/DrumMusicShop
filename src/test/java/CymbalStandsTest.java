import drumeo_music_shop.CymbalStands;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class CymbalStandsTest {
    CymbalStands cymbalStands;

    @Before
    public void setUp() {
        cymbalStands = new CymbalStands("Silver", "Metal", 40.0, 60.0);
    }

    @Test
    public void canCalculateMarkup() {
        assertEquals(20.0, cymbalStands.calculateMarkup(), 0.01);
    }
}
