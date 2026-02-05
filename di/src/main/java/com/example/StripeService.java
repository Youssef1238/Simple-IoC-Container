package com.example;

public class StripeService implements IPaymentProcessor {

    public void ProcessPayment(float amount){
        System.out.println("Processing "+amount+" via Stripe");
    }
}
