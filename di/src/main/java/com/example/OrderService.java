package com.example;

public class OrderService {

    private IPaymentProcessor paymentProcessor;

    public OrderService(IPaymentProcessor paymentProcessor){
        this.paymentProcessor = paymentProcessor;
    }
    
    public void checkout(float amount){
        
        this.paymentProcessor.ProcessPayment(amount);
    }
}
