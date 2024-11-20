import Flavors.*;
import Toppings.*;

import java.util.ArrayList;

import CarryMedium.*;

public class App {
    public static void main(String[] args) throws Exception {
        //
        FlavorFactory choclateFudge = new ChoclateFudge();
        ToppingsFactory crushedOreo = new CrushedOreo();
        CarryFactory paperCup = new PaperCup();
        ArrayList<FlavorFactory> flavors = new ArrayList<FlavorFactory>();
        flavors.add(choclateFudge);
        ArrayList<ToppingsFactory> toppings = new ArrayList<ToppingsFactory>();
        toppings.add(crushedOreo);
        Icecream icecream = new Icecream(flavors, toppings, paperCup);
        System.out.println(icecream.get_total_price());
    }
}
