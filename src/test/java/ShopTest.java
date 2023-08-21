import drumeo_music_shop.Bongos;
import drumeo_music_shop.Cajon;
import drumeo_music_shop.Djembe;
import drumeo_music_shop.DrumKit;
import drumeo_music_shop.DrumSticks;
import drumeo_music_shop.Cymbals;
import drumeo_music_shop.CymbalRacks;
import drumeo_music_shop.CymbalStands;

import drumeo_music_shop.Shop;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class ShopTest {
    Shop shop;
    Bongos bongos;
    Djembe djembe;
    Cajon cajon;
    DrumSticks drumSticks;
    Cymbals cymbals;
    CymbalStands cymbalStands;
    CymbalRacks cymbalRacks;
    DrumKit drumKit;

    @Before
    public void setUp() {
        shop = new Shop();
        bongos = new Bongos("Brown", "Wood", 50.0, 80.0);
        djembe = new Djembe("Red", "Leather", 100.0, 150.0);
        cajon = new Cajon("Black", "Wood", 120.0, 180.0);
        drumSticks = new DrumSticks("Wood", 5.0, 10.0);
        cymbals = new Cymbals("Bronze", "Metal", 200.0, 250.0);
        cymbalStands = new CymbalStands("Silver", "Metal", 50.0, 80.0);
        cymbalRacks = new CymbalRacks("Silver", "Metal", 150.0, 200.0);
        drumKit = new DrumKit("Blue", "Metal", 500.0, 650.0);
    }

    @Test
    public void canAddStock() {
        shop.addStock(bongos);
        shop.addStock(drumSticks);
        shop.addStock(cymbals);
        assertEquals(3, shop.getStock().size());
    }

    @Test
    public void canRemoveStock() {
        shop.addStock(bongos);
        shop.addStock(djembe);
        shop.addStock(drumKit);
        shop.removeStock(bongos);
        assertEquals(2, shop.getStock().size());
    }

    @Test
    public void canCalculateTotalPotentialProfit() {
        shop.addStock(bongos);       // 30.0 markup
        shop.addStock(djembe);      // 50.0 markup
        shop.addStock(cajon);       // 60.0 markup
        shop.addStock(drumSticks);  // 5.0 markup
        shop.addStock(cymbals);     // 50.0 markup
        shop.addStock(cymbalStands);// 30.0 markup
        shop.addStock(cymbalRacks); // 50.0 markup
        shop.addStock(drumKit);     // 150.0 markup
        assertEquals(425.0, shop.totalPotentialProfit(), 0.01);
    }
}