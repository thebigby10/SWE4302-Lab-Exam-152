package Toppings;
public abstract class ToppingsFactory {
    
    double toppings_price;
    public double getToppings_price() {
        return toppings_price;
    }
    ToppingsFactory(double toppings_price) {
        this.toppings_price = toppings_price;
    }
}
