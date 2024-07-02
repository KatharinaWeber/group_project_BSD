package at.campus02.bsd;

/**
 * Interface that declares the methods of a typical queue
 */
public interface IQueue {
  /**
   *  Method that adds a String to the Queue if there is space
   *
   * @param obj String that will be added to the queue
   * @return true if it is added and false if the queue is full
   */
  public abstract boolean offer(String obj);

  /**
   * returns and deletes the element on index 0. If the queue is empty null is returned
   *
   * @return first element (on index 0) or null
   */


  public abstract String poll();



   /**
   * returns and deletes the element on index 0, if the queue is empty  NoSuchElementException gets thrown
   * @return element on index 0 or null
   */
  public abstract String remove();

  // 1st element without delete, otherwise null

  /**
   * returns element on index 0 but doesn't remove the element. Returns null if the queue is empty.
   *
   * @return element on index 0 or null
   */
  public abstract String peek();

  // element is to peek what remove is to poll

  /**
   * checks if there are elements left in the queue.
   * If the queue is empty, null is returned if not, the element with index 0 gets returned
   * @return element on index 0
   */
  public abstract String element();
}