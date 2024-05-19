package edu.kis.vh.nursery.list;

public class Node {

    protected int value;
    protected Node prev, next;

    protected Node(int i) {
        value = i;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
}
