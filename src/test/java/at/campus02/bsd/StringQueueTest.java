package at.campus02.bsd;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.NoSuchElementException;

import static org.junit.jupiter.api.Assertions.*;
/**
 * Class to Test StringQueue Class
 */
public class StringQueueTest {

    private StringQueue queue;
    /**
     * Sets up a new StringQueue with a capacity of 5 before each test.
     */
    @BeforeEach
    public void setUp() {
        queue = new StringQueue(5);
    }
    /**
     * Tests that offer() correctly adds elements to the queue until it is full.
     */
    @Test
    public void testOffer() {
        assertTrue(queue.offer("One"));
        assertTrue(queue.offer("Two"));
        assertTrue(queue.offer("Three"));
        assertTrue(queue.offer("Four"));
        assertTrue(queue.offer("Five"));
        assertFalse(queue.offer("Six"));
    }
    /**
     * Tests that poll() retrieves and removes elements from the queue in order, returning null when empty.
     */
    @Test
    public void testPoll() {
        queue.offer("One");
        queue.offer("Two");

        assertEquals("One", queue.poll());
        assertEquals("Two", queue.poll());
        assertNull(queue.poll());
    }
    /**
     * Tests that remove() retrieves and removes elements from the queue, throwing an exception when empty.
     */
    @Test
    public void testRemove() {
        queue.offer("One");
        queue.offer("Two");

        assertEquals("One", queue.remove());
        assertEquals("Two", queue.remove());
        assertThrows(NoSuchElementException.class, () -> queue.remove());
    }
    /**
     * Tests that peek() retrieves but does not remove the head of the queue, returning null when empty.
     */
    @Test
    public void testPeek() {
        queue.offer("One");
        queue.offer("Two");

        assertEquals("One", queue.peek());
        assertEquals("One", queue.peek());
        queue.poll();
        assertEquals("Two", queue.peek());
        queue.poll();
        assertNull(queue.peek());
    }

    /**
     * Tests that element() retrieves but does not remove the head of the queue, throwing an exception when empty.
     */
    @Test
    public void testElement() {
        queue.offer("One");
        queue.offer("Two");

        assertEquals("One", queue.element());
        assertEquals("One", queue.element());

        queue.poll();
        assertEquals("Two", queue.element());
        queue.poll();
        assertThrows(NoSuchElementException.class, () -> queue.element());
    }
}
