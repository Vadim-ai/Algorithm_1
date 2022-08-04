package org.example;

import org.example.exceptions.IndexLimitException;
import org.example.exceptions.NullParamException;

import java.util.Arrays;
import java.util.List;

public class StringListImpl implements StringList {


    private String[] stingList;
    private int size;

    public StringListImpl() {
        this.stingList = new String[10];
    }

    public StringListImpl(int initSize) {
        this.stingList = new String[initSize];
    }


    @Override
    public String add(String item) {

        if (item == null) {
            throw new NullParamException();
        }
        for (int i = 0; i < stingList.length; i++) {
            if (stingList[i] == null) {
                stingList[i] = item;
                break;
            }
        }
        return item;
    }

    @Override
    public String add(int index, String item) {

        String[] stingListCopy = new String[stingList.length];

        if (index <= -1 || item == null) {
            throw new NullParamException();
        }
        if (index >= stingList.length) {
            throw new IndexLimitException();
        }
        for (int i = 0; i < stringlist.length; i++) {

        }

        return item;
    }


    @Override
    public String set(int index, String item) {
        if (index <= -1 || item == null) {
            throw new NullParamException();
        }
        if (index >= stingList.length) {
            throw new IndexLimitException();
        }
        stingList[index] = item;

        return item;
    }

    @Override
    public String remove(String item) {
        return null;
    }

    @Override
    public String remove(int index) {

        return null;
    }

    @Override
    public boolean contains(String item) {
        return indexOf(item) != -1;
    }

    @Override
    public int indexOf(String item) {
        for (int i = 0; i < size ; i++) {
            if (stingList[i].equals(item)) {
                return i;
            }
        }
        return -1;
    }
    @Override
    public int lastIndexOf(String item) {
        for (int i = size - 1; i >= 0 ; i--) {
            if (stingList[i].equals(item)) {
                return i;
            }
        }
        return -1;
    }

    @Override
    public String get(int index) {
        for (int i = 0; i < stingList.length ; i++) {
            if (i == index) {
                return stingList[index];
            }
        }
        return null;
    }

    @Override
    public boolean equals(StringList otherList) {
        for (int i = 0; i < stingList.length; i++) {
            for (int j = 0; j < stingList.length; j++) {
                    stingList[i] = stingList[j];
                    return true;
                }
            }
        return false;
    }

    @Override
    public int size() {
        return stingList.length; // или size
    }

    @Override
    public boolean isEmpty() {
        if (stingList.length == 0) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public void clear() {
    size = 0;
    }

    @Override
    public String[] toArray() {
        return Arrays.copyOf(stingList, size);
    }
}