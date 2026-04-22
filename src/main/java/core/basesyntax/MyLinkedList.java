package core.basesyntax;

import java.util.List;

public class MyLinkedList<T> implements MyLinkedListInterface<T> {
    private int size;

    @Override
    public void add(T value) {

        size++;
    }

    @Override
    public void add(T value, int index) {
        size++;
    }

    @Override
    public void addAll(List<T> list) {
        size += list.size();
    }

    @Override
    public T get(int index) {
        return null;
    }

    @Override
    public T set(T value, int index) {
        return null;
    }

    @Override
    public T remove(int index) {

        size--;
        return null;
    }

    @Override
    public boolean remove(T object) {

        size--;
        return false;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }
}
