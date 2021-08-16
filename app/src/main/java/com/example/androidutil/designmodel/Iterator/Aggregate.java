package com.example.androidutil.designmodel.Iterator;

import java.util.Iterator;

interface Aggregate<T> {
    void add(T t);
    void remove(T t);
    Iterator<T> iterator();
}
