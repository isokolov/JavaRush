package com.javarush.task.task37.task3707;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
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
    public AmigoSet<E> clone() throws CloneNotSupportedException {
        try {
            AmigoSet<E> copy = (AmigoSet<E>) super.clone();
            copy.map = (HashMap<E, Object>) map.clone();
            return copy;
        } catch (Exception e) {
            throw new InternalError(e);
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

    private void writeObject(ObjectOutputStream out) {
        try {
            out.defaultWriteObject();
            out.writeInt(HashMapReflectionHelper.callHiddenMethod(map, "capacity"));
            out.writeFloat(HashMapReflectionHelper.callHiddenMethod(map, "loadFactor"));
            out.writeInt(size());
            for (E e : map.keySet()) {
                out.writeObject(e);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void readObject(ObjectInputStream in) {
        try {
            in.defaultReadObject();
            int capacity = in.readInt();
            float loadFactor = in.readFloat();
            map = new HashMap<>(capacity, loadFactor);
            int size = in.readInt();
            for (int i = 0; i < size; i++) {
                @SuppressWarnings("unchecked")
                E e = (E) in.readObject();
                map.put(e, PRESENT);
            }
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
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
