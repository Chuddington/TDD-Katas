package com.github.chuddington.tddkata.spending;

import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class PaymentFetcherTest {

    private final Payments emptyPayments = Payments.of();
    private final Map<Integer, Payments> backingData = Map.ofEntries(
            Map.entry(1, Payments.of(new Payment()))
    );
    private final PaymentFetcher fetcher = new PaymentFetcher(backingData);

    @Test
    void obtainsEmptyPaymentsWithAnInvalidId() {
        assertEquals(
                emptyPayments,
                fetcher.fetch(0)
        );
        assertEquals(
                emptyPayments,
                fetcher.fetch(Integer.MIN_VALUE)
        );
        assertEquals(
                emptyPayments,
                fetcher.fetch(Integer.MAX_VALUE)
        );
    }

    @Test
    void obtainsPaymentsDataViaTheConstructor() {
        assertNotEquals(
                fetcher.fetch(0),
                fetcher.fetch(1)
        );
    }
}
