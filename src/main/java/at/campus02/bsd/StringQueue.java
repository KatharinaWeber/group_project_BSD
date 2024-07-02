package at.campus02.bsd;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

/**
 * Class that implements IQueue that stores Strings in a Queue Datastructure
 */
public class StringQueue implements IQueue {
  /**
   * List that saves Strings
   */
  private List<String> elements = new ArrayList<String>();
  /**
   * Declares the maxSize for the Queue
   */
  private int maxSize = 5;

  /**
   * Constructor of the Class String queue
   *
   * @param maxsize sets the maximum size of the queue
   */
  public StringQueue(int maxsize) {
    maxSize = maxsize;
  }

  /**
   * Method that adds a String to the Queue if there is space
   *
   * @param obj String that will be added to the queue
   * @return true if it is added and false if the queue is full
   */
  @Override
  public boolean offer(String obj) {
    if (elements.size() != maxSize)
      elements.add(obj);
    else
      return false;

    return true;
  }

  /**
   * Method that removes the element on Index 0 from the queue and returns it
   *
   * @return removed element
   */
  @Override
  public String poll() {
    String element = peek();

    if (elements.size() > 0) {
      elements.remove(0);
    }

    return element;
  }

  /**
   * removes element with index 0 and tells you if there are still elements left in the queue
   *
   * @return removed element
   */
  @Override
  public String remove() {
    String element = poll();
    if (element == null)
      throw new NoSuchElementException("there's no element any more");

    return element;
  }

  /**
   * if the queue isn't empty it returns the element with index 0 but it doesn't remove it
   *
   * @return the element with index 0
   */
  @Override
  public String peek() {
    String element;
    if (elements.size() > 0)
      element = elements.get(0);
    else
      element = null;

    return element;
  }

  /**
   * checks if there are elements left in the queue.
   *
   * If the queue is empty, null is returned if not, the element with index 0 gets returned
   *
   * @return element on index 0
   */
  @Override
  public String element() {
    String element = peek();
    if (element == null)
      throw new NoSuchElementException("there's no element any more");

    return element;
  }

}