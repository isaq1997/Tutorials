package com.company;

public class PremiumSong extends  Song{
   private double subscription_fee;

    public PremiumSong(String title, String genre, double subscription_fee) {
        super(title, genre);
        this.subscription_fee = subscription_fee;
    }

    public double getSubscription_fee() {
        return subscription_fee;
    }

    public void setSubscription_fee(double subscription_fee) {
        this.subscription_fee = subscription_fee;
    }
}
