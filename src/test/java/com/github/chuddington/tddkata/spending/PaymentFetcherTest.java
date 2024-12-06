package com.github.chuddington.tddkata.spending;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class PaymentFetcherTest {

    private final PaymentFetcher fetcher = new PaymentFetcher();

    @Test
    void thereAreNoPaymentsWithoutAnId() {
        assertEquals(
                Payments.of(),
                fetcher.fetch(0)
        );
    }
}
