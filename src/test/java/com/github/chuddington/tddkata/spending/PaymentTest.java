package com.github.chuddington.tddkata.spending;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * TODO:
 * - Add category enum with static factory method that converts a string (API prep)
 * - Build a PaymentFetcher that internally uses timestamps
 *   - Test to return a subset of elements (e.g. missing an entry that's 3 months old)
 * - Create a Payments object method that provides a new Payments object containing the at risk categories
 * - Sum all 'price' properties for a given Payments object
 * - Compose email address using an implementation of some Formatter functional interface
 */
class PaymentTest {
    private static final int defaultPrice = 100;
    private static final String defaultDescription = "Unit test Payment";

    private static final Payment defaultPaymentCopy = new Payment(defaultPrice, defaultDescription);
    private static final Payment thirdTransitiveCopy = new Payment(defaultPrice, defaultDescription);
    public static final Payment defaultPayment = new Payment(defaultPrice, defaultDescription);

    public static final Payment highCostPayment = new Payment(1000, defaultDescription);
    public static final Payment describedPayment = new Payment(defaultPrice, "Some other description");

    /**
     * Verifies that the overwritten {@link Payment#equals(Object)} implementation ensures that the contract is
     * reflexive. As in {@code x == x}.
     */
    @Test
    void reflexiveEquality() {
        assertEquals(
                defaultPayment,
                defaultPayment
        );
    }

    /**
     * Verifies that the overwritten {@link Payment#equals(Object)} implementation ensures that the equality contract
     * is symmetric. As in {@code (a == b) == (b == a) }.
     */
    @Test
    void symmetricEquality() {
        assertEquals(
                defaultPaymentCopy,
                defaultPayment
        );
        assertEquals(
                defaultPayment,
                defaultPaymentCopy
        );
    }

    /**
     * Verifies that the overwritten {@link Payment#equals(Object)} equality contract is transitive.
     * As in {@code (a == b) && (b == c). Therefore (a == c)}.
     */
    @Test
    void transitiveEquality() {
        assertEquals(defaultPayment, defaultPaymentCopy);
        assertEquals(defaultPaymentCopy, thirdTransitiveCopy);
        assertEquals(defaultPayment, thirdTransitiveCopy);
    }

    @Test
    void paymentDiffersByPrice() {
        assertNotEquals(
                highCostPayment,
                defaultPayment
        );
    }

    @Test
    void paymentDiffersByDescription() {
        assertNotEquals(
                describedPayment,
                defaultPayment
        );
    }
}