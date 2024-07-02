package at.campus02.bsd;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

public class DrinkQueue {
    List<Drink> elements;
    int maxSize = 5;

    public DrinkQueue(List<Drink> elements) {
        this.elements = elements;
    }

    public boolean offer(Drink obj) {
        if (elements.size() != maxSize)
            elements.add(obj);
        else
            return false;

        return true;
    }

    public Drink poll() {
        Drink element = peek();
        if (elements.size()>0){
            elements.remove(0);
        }
        return element;
    }


    public Drink remove() {
        Drink element = poll();
        if (element == null)
            throw new NoSuchElementException("there's no element any more");

        return element;
    }

    public Drink peek() {
        if (elements.isEmpty()) {
            return null;
        }
        else return elements.get(0);

    }

    public Drink element() {
        Drink element = peek();
        if (element == null) {
            throw new NoSuchElementException("there's no element any more");
        }
        else return element;
    }
}

