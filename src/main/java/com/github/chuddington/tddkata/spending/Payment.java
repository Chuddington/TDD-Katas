package com.github.chuddington.tddkata.spending;

/**
 * Value object that contains the basic information of a User's transaction.
 */
public class Payment {

    private final int price;

    public Payment(int price) {
        this.price = price;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }

        if (object == null || this.getClass() != object.getClass()) {
            return false;
        }

        Payment that = (Payment) object;

        return this.price == that.price;
    }

    @Override
    public String toString() {
        return "Payment[" +
                "price=" +
                this.price +
                ']';
    }
}
