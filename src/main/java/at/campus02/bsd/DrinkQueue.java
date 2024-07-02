package at.campus02.bsd;


import java.util.List;
import java.util.NoSuchElementException;


/**
 * Class DrinkQueue that should store Drinks in Datastructure Queue
 */
public class DrinkQueue {

    /**
     * List of Drinks
     */
    List<Drink> elements;
    /**
     * Maximum Size of the Queue
     */
    int maxSize = 5;


    /**
     * Constructor with a list filled with Drink as a Parameter
     *
     * @param elements List which has Drink Objects in it
     */
    public DrinkQueue(List<Drink> elements) {
        this.elements = elements;
    }

    /**
     * Method offer that checks if the queue is already full. If not it adds the Drink thats given as a parameter to the Queue.
     *
     * @param obj Drink that needs to be added to the Queue
     * @return false if the Queue is full and true if the object has been added
     */
    public boolean offer(Drink obj) {
        if (elements.size() != maxSize)
            elements.add(obj);
        else
            return false;

        return true;
    }

    /**
     * Method that returns the Drink on Index 0 and removes it if there is no Element on Index 0 null gets returned
     *
     * @return the Element on Index 0 or null if there isn't an element on Index 0
     */
    public Drink poll() {
        Drink element = peek();
        if (elements.size()>0){
            elements.remove(0);
        }
        return element;
    }

    /**
     * removes element with index 0 and tells you if there are still elements left in the queue
     *
     * @return removed element
     */
    public Drink remove() {
        Drink element = poll();
        if (element == null)
            throw new NoSuchElementException("there's no element any more");

        return element;
    }

    /**
     * if the queue isn't empty it returns the element with index 0 but it doesn't remove it
     *
     * @return the element with index 0
     */
    public Drink peek() {
        if (elements.isEmpty()) {
            return null;
        }
        else return elements.get(0);

    }

    /**
     * checks if there are elements left in the queue.
     * If the queue is empty, null is returned if not, the element with index 0 gets returned
     *
     * @return element on index 0
     */
    public Drink element() {
        Drink element = peek();
        if (element == null) {
            throw new NoSuchElementException("there's no element any more");
        }
        else return element;
    }


}

