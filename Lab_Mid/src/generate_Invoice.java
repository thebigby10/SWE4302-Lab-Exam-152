import java.util.ArrayList;

import Flavors.*;
import Toppings.*;
import CarryMedium.*;

import java.io.File;
import java.io.IOException; 

public class generate_Invoice {
    ArrayList<Icecream> icecreams;

    public void setIcecreams(ArrayList<Icecream> icecreams) {
        this.icecreams = icecreams;
    }

    public void generate_Invoice(){

      File invoiceFile = new File("Invoice.txt");
      if(invoiceFile.createNewFile()){
        System.out.println("Invoice File Created");
      }
      ArrayList<FlavorFactory> flavors = ;
      ArrayList<ToppingsFactory> toppings;
      CarryFactory carry;

      String invoidString = "";
      invoiceString+="Ice Cream Shop Invoice\n";
      for (Icecream icecream : icecreams) {
          invoidString += icecream.get_name() + "\n";
          invoidString += icecream.get_price() + "\n";
          invoidString += icecream.get_total_price() + "\n";
      }
      System.out.println("Invoice Generated");
      return;
    }
}