package com.github.chuddington.tddkata.spending;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PaymentFetcherTest {
    @Test
    void thereAreNoPaymentsWithoutAnId() {
        PaymentFetcher fetcher = new PaymentFetcher();
        assertEquals(
                new ArrayList<>(),
                fetcher.fetch(0)
        );
    }
}
