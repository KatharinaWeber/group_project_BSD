package at.campus02.bsd;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.assertEquals;
/**
 * Class to Test Liquid Class
 */
public class LiquidTest {
    private Liquid testLiquid;
    /**
     * Test if creating a liquid works
     */
    @BeforeEach
    public void setUp() {
        testLiquid = new Liquid("Vodka", 200, 37.5);
    }
    /**
     * Test if getting the name of a liquid works
     */
    @Test
    public void testGetName() {
        assertEquals("Vodka", testLiquid.getName());
    }
    /**
     * Test if setting the name of a liquid works
     */
    @Test
    public void testSetName() {
        testLiquid.setName("Eristoff");
        assertEquals("Eristoff", testLiquid.getName());
    }
    /**
     * Test if getting the volume of a liquid works
     */
    @Test
    public void testGetVolume() {
        assertEquals(200, testLiquid.getVolume());
    }
    /**
     * Test if setting the volume of a liquid works
     */
    @Test
    public void testSetVolume() {
        testLiquid.setVolume(100);
        assertEquals(100, testLiquid.getVolume());
    }
    /**
     * Test if getting the alcohol percentage of a liquid works
     */
    @Test
    public void testGetAlcoholPercent() {
        assertEquals(37.5, testLiquid.getAlcoholPercent());
    }
    /**
     * Test if setting the alcohol percentage of a liquid works
     */
    @Test
    public void testSetAlcoholPercent() {
        testLiquid.setAlcoholPercent(40);
        assertEquals(40, testLiquid.getAlcoholPercent());
    }
}
