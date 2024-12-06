package com.github.chuddington.tddkata.spending;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/**
 * Object for containing a collection of {@link Payment} objects for a given User.
 */
public class Payments {
    private final List<Payment> payments;

    private Payments(
            List<Payment> payments
    ) {
        this.payments = payments;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }

        if (object == null || this.getClass() != object.getClass()) {
            return false;
        }

        Payments that = (Payments) object;

        return this.payments.equals(that.payments);
    }

    /**
     * Static factory method for creating a {@link Payments} object.
     * @param payments The variable length argument of individual {@link Payment} objects to wrap around.
     * @return A new instance of {@link Payments} containing all the provided {@code payments} parameters.
     */
    public static Payments of(Payment ...payments) {
        return new Payments(
                Arrays.stream(payments).toList()
        );
    }

    public static Payments of(Iterable<Payment> payments) {
        List<Payment> result = new ArrayList<>();
        payments.iterator().forEachRemaining(result::add);
        return new Payments(result);
    }
}
