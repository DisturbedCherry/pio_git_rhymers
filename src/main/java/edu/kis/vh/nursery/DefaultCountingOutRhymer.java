package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {
    private static final int UNMODIFIED_TOTAL = -1;
    private static final int FULL_TOTAL = 11;
    private static final int NUMBERS_SIZE = 12;

    private final int[] numbers = new int[NUMBERS_SIZE];

    private int total = UNMODIFIED_TOTAL;


    protected void countIn(int in) {
        if (!isFull())
            numbers[++total] = in;
    }

    protected boolean callCheck() {
        return total == UNMODIFIED_TOTAL;
    }

    private boolean isFull() {
        return total == FULL_TOTAL;
    }

    protected int peekaboo() {
        if (callCheck())
            return -1;
        return numbers[total];
    }

    protected int countOut() {
        if (callCheck())
            return -1;
        return numbers[total--];
    }

}
