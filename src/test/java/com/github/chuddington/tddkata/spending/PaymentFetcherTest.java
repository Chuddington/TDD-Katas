package com.github.chuddington.tddkata.spending;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

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
