package com.javarush.task.task17.task1713;

import java.util.*;

/* 
Общий список
*/

public class Solution implements List<Long> {
    private ArrayList<Long> original = new ArrayList<Long>();

    public static void main(String[] args) {

    }

    @Override
    public synchronized int size() {
        //return 0;
        return original.size();
    }

    @Override
    public synchronized boolean isEmpty() {
        //return false;
        return original.isEmpty();
    }

    @Override
    public synchronized boolean contains(Object o) {
        //return false;
        return original.contains(o);
    }

    @Override
    public synchronized Iterator iterator() {
        //return null;
        return original.iterator();
    }

    @Override
    public synchronized Object[] toArray() {
        return original.toArray();
    }
    /*public Object[] toArray() {
        return new Object[0];
    }*/

    @Override
    public synchronized boolean add(Long o) {
        //return false;
        return original.add(o);
    }

    @Override
    public synchronized boolean remove(Object o) {
        //return false;
        return original.remove(o);
    }

    @Override
    public synchronized boolean addAll(Collection c) {
        //return false;
        return original.addAll(c);
    }

    @Override
    public synchronized boolean addAll(int index, Collection c) {
        //return false;
        return original.addAll(index, c);
    }

    @Override
    public synchronized void clear() {
        original.clear();
    }

    @Override
    public synchronized Long /*Object*/ get(int index) {
        //return null;
        return original.get(index);
    }

    @Override
    public synchronized Long /*Object*/ set(int index, /*Object*/ Long element) {
        //return null;
        return original.set(index, element);
    }

    @Override
    public synchronized void add(int index, /*Object*/ Long element) {
        original.add(index, element);
    }

    @Override
    public synchronized /*Object*/Long remove(int index) {
        //return null;
        return original.remove(index);
    }

    @Override
    public synchronized int indexOf(Object o) {
        //return 0;
        return original.indexOf(o);
    }

    @Override
    public synchronized int lastIndexOf(Object o) {
        //return 0;
        return original.lastIndexOf(o);
    }

    @Override
    public synchronized ListIterator listIterator() {
        //return null;
        return original.listIterator();
    }

    @Override
    public synchronized ListIterator listIterator(int index) {
        //return null;
        return original.listIterator(index);
    }

    @Override
    public synchronized List subList(int fromIndex, int toIndex) {
        return original.subList(fromIndex, toIndex);
        //return null;
    }

    @Override
    public synchronized boolean retainAll(Collection c) {
        //return false;
        return original.retainAll(c);
    }

    @Override
    public synchronized boolean removeAll(Collection c) {
        //return false;
        return original.removeAll(c);
    }

    @Override
    public synchronized boolean containsAll(Collection c) {
        //return false;
        return original.containsAll(c);
    }

    @Override
    public synchronized Object[] toArray(Object[] a) {
        //return new Object[0];
        return original.toArray(a);
    }
}
