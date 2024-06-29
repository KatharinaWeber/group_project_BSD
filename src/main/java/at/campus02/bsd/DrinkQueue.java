package at.campus02.bsd;

import java.util.ArrayList;
import java.util.List;

public class DrinkQueue implements IQueue{
    List<Drink> arrayList = new ArrayList<>();


    @Override
    public boolean offer(String obj) {
        return false;
    }

    @Override
    public String poll() {
        return null;
    }

    @Override
    public String remove() {
        return null;
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
