package at.campus02.bsd;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

public class DrinkQueue implements IQueue{
    List<Drink> arrayList = new ArrayList<>();
    int maxSize = 5;

    public DrinkQueue(List<Drink> arrayList) {
        this.arrayList = arrayList;
    }

    @Override
    public boolean offer(String obj) {
        if (arrayList.size() != maxSize)

            arrayList.add(new Drink(obj));
        else
            return false;

        return true;
    }

    @Override
    public String poll() {
        return null;
    }

    @Override
    public String remove() {
        String element = poll();
        if (element == null)
            throw new NoSuchElementException("there's no element any more");

        return element;
    }

    @Override
    public String peek() {
        return null;
    }

    @Override
    public String element() {
        return null;
    }
}
