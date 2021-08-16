package com.example.androidutil.designmodel.Iterator;

import java.util.ArrayList;
import java.util.Iterator;

class ConcreteAggregate<T> implements Aggregate<T> {

    private ArrayList<T> list = new ArrayList<>();

    @Override
    public void add(T t) {
        list.add(t);
    }

    @Override
    public void remove(T t) {
        list.remove(t);
    }

    @Override
    public Iterator<T> iterator() {
        return new ConcreteIterator<T>(list);
    }
}
