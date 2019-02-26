package com.javarush.task.task37.task3707;

import java.io.Serializable;
import java.util.*;

public class AmigoSet<E> extends AbstractSet implements Serializable, Cloneable, Set {

    private final static Object PRESENT = new Object();
    private transient HashMap<E,Object> map;

    public AmigoSet() {
        map = new HashMap<E,Object>();
    }

    public AmigoSet(Collection<? extends E> collection) {
        int capacity = Math.max(16, (int)(collection.size()/.75f + 1));
        map = new HashMap<E,Object>(capacity);
        for (E e: collection) {
            map.put(e, PRESENT);
        }
    }


    @Override
    public boolean add(Object o) {
        return null == map.put((E)o,PRESENT);
    }

    @Override
    public Iterator iterator() {
        Iterator<E> iterator = map.keySet().iterator();

        return iterator;
    }

    @Override
    public int size() {
        return map.size();
    }

    @Override
    public boolean isEmpty() {
        return map.isEmpty();
    }

    @Override
    public boolean contains(Object o) {
        return map.containsKey(o);
    }

    @Override
    public boolean remove(Object o) {
        return null == map.remove(o);
    }

    @Override
    public void clear() {
        map.clear();
    }
}
