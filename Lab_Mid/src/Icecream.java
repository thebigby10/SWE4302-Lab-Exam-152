import java.util.ArrayList;

import Flavors.FlavorFactory;
import Toppings.ToppingsFactory;
import CarryMedium.CarryFactory;

public class Icecream {
    ArrayList<FlavorFactory> flavors;
    ArrayList<ToppingsFactory> toppings;
    CarryFactory carry;
    
    double tax = 0.8;

    public void setTax(int tax) {
        this.tax = tax;
    }

    public Icecream(ArrayList<FlavorFactory> flavors, ArrayList<ToppingsFactory> toppings, CarryFactory carry) {
        this.flavors = flavors;
        this.toppings = toppings;
        this.carry = carry;
    }

    public double get_total_price() {
        double total_price = 0.0;
        for (FlavorFactory flavor : flavors) {
            total_price += flavor.getFlavors_price();
        }
        for (ToppingsFactory topping : toppings) {
            total_price += topping.getToppings_price();
        }
        total_price += carry.getCarry_price();
        //tax calculation
        total_price+=total_price*0.8;
        return total_price;
    }
}
