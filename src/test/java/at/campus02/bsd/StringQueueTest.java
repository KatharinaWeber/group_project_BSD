package at.campus02.bsd;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.NoSuchElementException;

import static org.junit.jupiter.api.Assertions.*;

public class StringQueueTest {

    private StringQueue queue;

    @BeforeEach
    public void setUp() {
        queue = new StringQueue(5);
    }

    @Test
    public void testOffer() {
        assertTrue(queue.offer("One"));
        assertTrue(queue.offer("Two"));
        assertTrue(queue.offer("Three"));
        assertTrue(queue.offer("Four"));
        assertTrue(queue.offer("Five"));
        assertFalse(queue.offer("Six"));
    }

    @Test
    public void testPoll() {
        queue.offer("One");
        queue.offer("Two");

        assertEquals("One", queue.poll());
        assertEquals("Two", queue.poll());
        assertNull(queue.poll());
    }

    @Test
    public void testRemove() {
        queue.offer("One");
        queue.offer("Two");

        assertEquals("One", queue.remove());
        assertEquals("Two", queue.remove());
        assertThrows(NoSuchElementException.class, () -> queue.remove());
    }

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
