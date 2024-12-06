package com.github.chuddington.tddkata.spending;

import java.util.ArrayList;
import java.util.List;

public class PaymentFetcher {
    public Payments fetch(int userId) {
        return Payments.of(new ArrayList<>());
    }
}
