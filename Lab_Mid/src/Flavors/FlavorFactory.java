package Flavors;
public abstract class FlavorFactory {
    double price_perscoop;

    public double getFlavors_price() {
        return price_perscoop;
    }

    public FlavorFactory(double price_perscoop) {
        this.price_perscoop = price_perscoop;
    }
    
}
