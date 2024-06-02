package edu.kis.vh.nursery;

import edu.kis.vh.nursery.factory.DefaultRhymersFactory;
import edu.kis.vh.nursery.factory.Rhymersfactory;

/**
* The RhymersDemo class provides a demonstration of the functionality of different rhymers.
* This class includes the main method to execute the demo and a helper method to test the rhymers.
*/
class RhymersDemo {

    private static final int COUNT_IN_LIMIT = 15;
    private static final int RHYMERS_LAST_INDEX = 3;
    private static final int UPPER_BOUND = 20;

    /**
     * The main method is the entry point of the application.
     * It creates a factory for rhymers and tests their functionality.
     *
     * @param args the command line arguments (not used)
     */
    public static void main(String[] args) {
        Rhymersfactory factory = new DefaultRhymersFactory();
        testRhymers(factory);
    }

    /**
     * Tests the rhymers by populating them with data and printing their outputs.
     * This method demonstrates the counting and output capabilities of various rhymers.
     *
     * @param factory the factory used to create rhymers
     */
    private static void testRhymers(Rhymersfactory factory) {
        DefaultCountingOutRhymer[] rhymers = {
                factory.getStandardRhymer(),
                factory.getFalseRhymer(),
                factory.getFIFORhymer(),
                factory.getHanoiRhymer()
        };

        for (int i = 1; i < COUNT_IN_LIMIT; i++) {
            for (int j = 0; j < RHYMERS_LAST_INDEX; j++) {
                rhymers[j].countIn(i);
            }
        }

        java.util.Random rn = new java.util.Random();
        for (int i = 1; i < COUNT_IN_LIMIT; i++) {
            rhymers[RHYMERS_LAST_INDEX].countIn(rn.nextInt(UPPER_BOUND));
        }

        for (int i = 0; i < rhymers.length; i++) {
            while (!rhymers[i].callCheck()) {
                System.out.print(rhymers[i].countOut() + "  ");
            }
            System.out.println();
        }

        System.out.println("total rejected is "
                + ((HanoiRhymer) rhymers[RHYMERS_LAST_INDEX]).reportRejected());
    }
}
