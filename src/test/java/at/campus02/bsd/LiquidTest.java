package at.campus02.bsd;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LiquidTest {
    private Liquid testLiquid;
    @BeforeEach
    public void setUp() {
        testLiquid = new Liquid("Vodka", 200, 37.5);
    }

    @Test
    public void testGetName() {
        assertEquals("Vodka", testLiquid.getName());
    }

    @Test
    public void testSetName() {
        testLiquid.setName("Eristoff");
        assertEquals("Eristoff", testLiquid.getName());
    }

    @Test
    public void testGetVolume() {
        assertEquals(200, testLiquid.getVolume());
    }

    @Test
    public void testSetVolume() {
        testLiquid.setVolume(100);
        assertEquals(100, testLiquid.getVolume());
    }

    @Test
    public void testGetAlcoholPercent() {
        assertEquals(37.5, testLiquid.getAlcoholPercent());
    }

    @Test
    public void testSetAlcoholPercent() {
        testLiquid.setAlcoholPercent(40);
        assertEquals(40, testLiquid.getAlcoholPercent());
    }
}
