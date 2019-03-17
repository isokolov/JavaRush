package com.javarush.task.task33.task3310.strategy;

import java.io.Serializable;

public class Entry implements Serializable {

    Long key;
    String value;
    Entry next;
    int hash;

    public Entry(int hash, Long key, String value, Entry next) {
        this.hash = hash;
        this.key = key;
        this.value = value;
        this.next = next;
    }

    public Long getKey() {
        return key;
    }

    public String getValue() {
        return value;
    }

    public Entry getNext() {
        return next;
    }

    public int getHash() {
        return hash;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Entry)) return false;

        Entry entry = (Entry) o;

        if (!getKey().equals(entry.getKey())) return false;
        return getValue().equals(entry.getValue());
    }

    @Override
    public int hashCode() {
        int result = getKey().hashCode();
        result = 31 * result + getValue().hashCode();
        return result;
    }

    @Override
    public String toString() {
        return key + "=" + value;
    }
}
