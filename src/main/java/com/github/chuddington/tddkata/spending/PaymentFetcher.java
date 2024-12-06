package com.github.chuddington.tddkata.spending;

import java.util.ArrayList;

/**
 * Obtains {@link Payments} for use in calculation / activity monitoring.
 */
public class PaymentFetcher {
    public Payments fetch(int userId) {
        return Payments.of(new ArrayList<>());
    }
}
