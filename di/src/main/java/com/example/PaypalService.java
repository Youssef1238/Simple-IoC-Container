package com.example;

public class PaypalService implements IPaymentProcessor{
 
    
    public void ProcessPayment(float amount){
        System.out.println("Processing "+amount+" via Paypal");
    }
}
