import org.junit.Test;

import Flavors.*;
import Toppings.*;
import CarryMedium.*;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;

public class Tests {
    @Test
    public void test1() {
        FlavorFactory choclateFudge = new ChoclateFudge();
        ToppingsFactory crushedOreo = new CrushedOreo();
        CarryFactory paperCup = new PaperCup();
        ArrayList<FlavorFactory> flavors = new ArrayList<FlavorFactory>();
        flavors.add(choclateFudge);
        ArrayList<ToppingsFactory> toppings = new ArrayList<ToppingsFactory>();
        toppings.add(crushedOreo);
        Icecream icecream = new Icecream(flavors, toppings, paperCup);
        double total_price = icecream.get_total_price();
        assertEquals(total_price, 6.93, 0.1);

    }
    @Test
    public void test2() {
        FlavorFactory choclateFudge = new ChoclateFudge();
        ToppingsFactory crushedOreo = new CrushedOreo();
        CarryFactory cone = new Cone();
        ArrayList<FlavorFactory> flavors = new ArrayList<FlavorFactory>();
        flavors.add(choclateFudge);
        ArrayList<ToppingsFactory> toppings = new ArrayList<ToppingsFactory>();
        toppings.add(crushedOreo);
        Icecream icecream = new Icecream(flavors, toppings, cone);
        double total_price = icecream.get_total_price();
        assertEquals(total_price, 15.9, 0.1);

    }
    @Test
    public void test3() {
        FlavorFactory choclateFudge = new ChoclateFudge();
        FlavorFactory pistachio = new PistachioDelight();
        FlavorFactory strawberry = new StrawberrySwirl();

        ToppingsFactory crushedOreo = new CrushedOreo();
        ToppingsFactory marshmellow = new Marshmallow();
        ToppingsFactory choclate = new ChocolateChips();

        CarryFactory cone = new Cone();
        
        ArrayList<FlavorFactory> flavors = new ArrayList<FlavorFactory>();
        flavors.add(choclateFudge);
        flavors.add(pistachio);
        flavors.add(strawberry);


        ArrayList<ToppingsFactory> toppings = new ArrayList<ToppingsFactory>();
        toppings.add(crushedOreo);
        toppings.add(marshmellow);
        toppings.add(choclate);
        
        Icecream icecream = new Icecream(flavors, toppings, cone);
        double total_price = icecream.get_total_price();
        assertEquals(total_price, 28.8, 0.1);

    }
    @Test
    public void test4() {

        ArrayList<FlavorFactory> flavors = new ArrayList<FlavorFactory>();
        ArrayList<ToppingsFactory> toppings = new ArrayList<ToppingsFactory>();
        
        CarryFactory cone = new Cone();

        Icecream icecream = new Icecream(flavors, toppings, cone);
        double total_price = icecream.get_total_price();
        assertEquals(total_price, 9.00, 0.1);

    }
    @Test
    public void test5() {
        ArrayList<FlavorFactory> flavors = new ArrayList<FlavorFactory>();
        ArrayList<ToppingsFactory> toppings = new ArrayList<ToppingsFactory>();
        CarryFactory paperCup = new PaperCup();
        
        Icecream icecream = new Icecream(flavors, toppings, paperCup);
        double total_price = icecream.get_total_price();
        assertEquals(total_price, 0.00, 0.1);

    }
}
