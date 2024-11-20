package CarryMedium;

public abstract class CarryFactory {
    double carry_price;
    public double getCarry_price() {
        return carry_price;
    }
    CarryFactory(double carry_price) {
        this.carry_price = carry_price;
    }
}
