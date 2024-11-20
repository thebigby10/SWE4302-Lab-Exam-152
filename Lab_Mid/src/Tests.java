import org.junit.Test;

import Flavors.*;
import Toppings.*;
import CarryMedium.*;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;

public class Tests {
    @SuppressWarnings("deprecation")
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
}
