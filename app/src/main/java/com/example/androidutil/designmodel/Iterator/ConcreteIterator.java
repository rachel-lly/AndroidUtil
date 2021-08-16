package com.example.androidutil.designmodel.Iterator;

import java.util.ArrayList;
import java.util.Iterator;


class ConcreteIterator<T> implements Iterator<T> {

    private ArrayList<T> list;
    private int cursor = 0;

    public ConcreteIterator(ArrayList<T> list) {
        this.list = list;
    }

    @Override
    public boolean hasNext() {
        return cursor != list.size();
    }

    @Override
    public T next() {
        T t = null;
        if(this.hasNext()){
            t = this.list.get(cursor++);
        }
        return t;
    }

    @Override
    public void remove() {

    }

}
