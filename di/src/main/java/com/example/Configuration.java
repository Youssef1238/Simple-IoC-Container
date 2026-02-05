package com.example;

public class Configuration {

    private IFunc<StripeService> stripeFunc = () -> new StripeService();
    private IFunc<PaypalService> paypalFunc = () -> new PaypalService();
    private IContextualFunc<OrderService> orderFunc = (Container c) -> new OrderService(c.resolve("payment"));

    public void Configure(Container cont){
/*         cont.register("payment", stripeFunc); */
        cont.register("payment", paypalFunc);
        cont.register("order", orderFunc);
    }
    
}
