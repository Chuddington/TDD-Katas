package com.github.chuddington.tddkata.spending;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PaymentTest {
    private static final Payment defaultPaymentCopy = new Payment(100);
    private static final Payment thirdTransitiveCopy = new Payment(100);

    public static final Payment defaultPayment = new Payment(100);
    public static final Payment highCostPayment = new Payment(1000);

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
}