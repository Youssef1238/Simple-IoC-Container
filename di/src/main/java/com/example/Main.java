package com.example;

public class Main {
    public static void main(String[] args) {
        
        

        Container cont = new Container();
        new Configuration().Configure(cont);



        OrderService os = cont.resolve("order");
        os.checkout(100);
    }
    
}