package ru.sbertech.test.lesson3.homework;

import java.util.Iterator;
import java.util.List;

/**
 * Created by Daria on 21.07.2016.
 */

public class IteratorReverse implements Iterator<Object> {
    private List list;
    private int index;

    public IteratorReverse(List list) {
        this.list = list;
        index = list.size() - 1;
    }

    @Override
    public boolean hasNext() {
        return index >= 0;
    }

    @Override
    public Object next() {
        return list.get(index--);
    }

    @Override
    public void remove() {
        list.remove(index);
    }
}
