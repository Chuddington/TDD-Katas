package com.github.chuddington.tddkata.spending;

/**
 * Value object that contains the basic information of a User's transaction.
 */
public class Payment {

    private final int price;
    private final String description;

    public Payment(int price, String description) {
        this.price = price;
        this.description = description;
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

        return (this.price == that.price) && (this.description.equals(that.description));
    }

    @Override
    public String toString() {
        return "Payment[" +
                "description=\"" +
                this.description +
                "\"," +
                "price=" +
                this.price +
                ']';
    }
}
