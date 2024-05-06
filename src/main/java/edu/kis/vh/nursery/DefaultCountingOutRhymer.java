package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {
    private static final int UNMODIFIED_TOTAL = -1;
    private static final int FULL_TOTAL = 11;
    private static final int NUMBERS_SIZE = 12;

    private int[] numbers = new int[NUMBERS_SIZE];

    public int total = UNMODIFIED_TOTAL;


    public void countIn(int in) {
        if (!isFull())
            numbers[++total] = in;
    }

    public boolean callCheck() {
        return total == UNMODIFIED_TOTAL;
    }

    public boolean isFull() {
        return total == FULL_TOTAL;
    }

    protected int peekaboo() {
        if (callCheck())
            return -1;
        return numbers[total];
    }

    public int countOut() {
        if (callCheck())
            return -1;
        return numbers[total--];
    }

}
