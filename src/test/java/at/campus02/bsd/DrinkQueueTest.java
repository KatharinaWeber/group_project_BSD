package at.campus02.bsd;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

import static org.junit.jupiter.api.Assertions.*;
/**
 * Class to Test DrinkQueue Class
 */
public class DrinkQueueTest {
    /**
     * Declaring a DrinkQueue, two simpleDrinks and a Cocktail
     */
    private DrinkQueue drinkQueue;
    private SimpleDrink simpleDrink1;
    private SimpleDrink simpleDrink2;
    private Cocktail cocktail;

    /**
     * Sets up a new Drink before every test
     */
    @BeforeEach
    public void setUp() {
        List<Drink> drinks = new ArrayList<>();

        Liquid liquid1 = new Liquid("Cola", 0.5, 0);
        Liquid liquid2 = new Liquid("Fanta", 0.5, 0);

        simpleDrink1 = new SimpleDrink("Cola", liquid1);
        simpleDrink2 = new SimpleDrink("Fanta", liquid2);

        List<Liquid> ingredients = new ArrayList<>();
        ingredients.add(new Liquid("Tequila", 0.3, 40));
        ingredients.add(new Liquid("Orange Juice", 0.6, 0));
        cocktail = new Cocktail("Tequila Sunrise", ingredients);

        drinks.add(simpleDrink1);
        drinkQueue = new DrinkQueue(drinks);
    }
    /**
     * Test if Offering a Drink when the queue is not full works
     */
    @Test
    public void testOfferWhenQueueNotFull() {
        assertTrue(drinkQueue.offer(simpleDrink2));
        assertEquals(2, drinkQueue.elements.size());
    }
    /**
     * Test if Offering a Drink when the queue is full works
     */
    @Test
    public void testOfferWhenQueueFull() {
        drinkQueue.offer(simpleDrink2);
        drinkQueue.offer(new SimpleDrink("Water", new Liquid("Water", 0.5, 0)));
        drinkQueue.offer(new SimpleDrink("Pepsi", new Liquid("Pepsi", 0.5, 0)));
        drinkQueue.offer(new SimpleDrink("Sprite", new Liquid("Sprite", 0.5, 0)));

        assertFalse(drinkQueue.offer(cocktail));
        assertEquals(5, drinkQueue.elements.size());
    }
    /**
     * Test if polling a Drink when the queue is not empty works
     */
    @Test
    public void testPollWhenQueueNotEmpty() {
        assertEquals(simpleDrink1, drinkQueue.poll());
        assertEquals(0, drinkQueue.elements.size());
    }
    /**
     * Test if polling a Drink when the queue is empty works
     */
    @Test
    public void testPollWhenQueueEmpty() {
        drinkQueue.poll();
        assertNull(drinkQueue.poll());
    }
    /**
     * Test if removing a Drink when the queue is not empty works
     */
    @Test
    public void testRemoveWhenQueueNotEmpty() {
        assertEquals(simpleDrink1, drinkQueue.remove());
        assertEquals(0, drinkQueue.elements.size());
    }
    /**
     * Test if removing a Drink when the queue is empty works
     */
    @Test
    public void testRemoveWhenQueueEmpty() {
        drinkQueue.poll();
        assertThrows(NoSuchElementException.class, () -> drinkQueue.remove());
    }
    /**
     * Test if peeking at the first element when the queue is not empty works
     */
    @Test
    public void testPeekWhenQueueNotEmpty() {
        assertEquals(simpleDrink1, drinkQueue.peek());
        assertEquals(1, drinkQueue.elements.size());
    }
    /**
     * Test if peeking at the first element when the queue is empty works
     */
    @Test
    public void testPeekWhenQueueEmpty() {
        drinkQueue.poll();
        assertNull(drinkQueue.peek());
    }
    /**
     * Verifies that the element() method retrieves the head of the queue without removing it and maintains the queue size.
     */
    @Test
    public void testElementWhenQueueNotEmpty() {
        assertEquals(simpleDrink1, drinkQueue.element());
        assertEquals(1, drinkQueue.elements.size());
    }
    /**
     * Ensures that element() throws NoSuchElementException when called on an empty queue.
     */
    @Test
    public void testElementWhenQueueEmpty() {
        drinkQueue.poll();
        assertThrows(NoSuchElementException.class, () -> drinkQueue.element());
    }

}
