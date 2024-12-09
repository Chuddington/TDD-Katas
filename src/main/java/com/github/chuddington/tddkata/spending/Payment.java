package com.github.chuddington.tddkata.spending;

/**
 * Value object that contains the basic information of a User's transaction.
 */
public class Payment {

    private final int price;

    public Payment(int price) {
        this.price = price;
    }
}
