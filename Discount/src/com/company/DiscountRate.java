package com.company;

public final class DiscountRate {
    Customer customer;
    double serviceDiscountPremium=0.2;
    double serviceDiscountGold=0.15;
    double serviceDiscountSilver=0.1;
    double productDiscountPremium=0.1;
    double productDiscountGold=0.1;
    double productDiscountSilver=0.1;

    public double getProductDiscountRate(String customer1) {
        customer1=customer.getName();
        return productDiscountGold;
    }
    public double getServiceDiscountRate() {
        return productDiscountGold;
    }
}
