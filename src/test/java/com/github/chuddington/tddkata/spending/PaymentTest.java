package com.github.chuddington.tddkata.spending;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PaymentTest {
    public static Payment defaultPayment = new Payment(100);

    @Test
    void paymentDiffersByPrice() {
        assertNotEquals(
                defaultPayment,
                new Payment(
                        1000
                )
        );
    }
}