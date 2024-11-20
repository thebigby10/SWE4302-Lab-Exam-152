import Flavors.*;
import Toppings.*;
import CarryMedium.*;

public class App {
    public static void main(String[] args) throws Exception {
        //
        FlavorFactory choclateFudge = new ChoclateFudge();
        ToppingsFactory crushedOreo = new CrushedOreo();
        CarryFactory paperCup = new PaperCup();
        // Icecream icecream = new Icecream(choclateFudge, crushedOreo, paperCup);
    }
}
