package at.campus02.bsd;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

public class DrinkQueue implements IQueue{
    List<Drink> arrayList = new ArrayList<>();



    @Override
    public boolean offer(String obj) {
        return false;
    }

    @Override
    public String poll() {
        if (arrayList.size() > 0) {
            return arrayList.remove(0).getName();
        } else {
            return null;
        }
    }

    @Override
    public String remove() {
        String element = poll();
        if (element == null) {
            throw new NoSuchElementException("there's no element any more");
        }
        return element;
    }

    @Override
    public String peek() {
        if (!arrayList.isEmpty()) {
            return arrayList.get(0).getName();
        }
        else return null;
    }

    @Override
    public String element() {
        String element = peek();
        if (element == null) {
            throw new NoSuchElementException("there's no element any more");
        }
        return element;
    }

}
