package com.github.chuddington.tddkata.spending;

import java.util.ArrayList;
import java.util.Map;

/**
 * Obtains {@link Payments} for use in calculation / activity monitoring.
 */
public class PaymentFetcher {

    private final Map<Integer, Payments> backingData;

    public PaymentFetcher(Map<Integer, Payments> backingData) {
        this.backingData = backingData;
    }

    public Payments fetch(int userId) {
        return this.backingData.getOrDefault(userId, Payments.of());
    }
}
