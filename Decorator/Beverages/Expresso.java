package Decorator.Beverages;

import Decorator.Beverage;

public class Expresso extends Beverage {

    public Expresso() {
        description = "Expresso";
    }

    public double cost() {
        return 1.99;
    }
}
