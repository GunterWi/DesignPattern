package creational.factory.pizzaexample.PizzaProduct.NYStylePizza;


import creational.factory.pizzaexample.PizzaProduct.Pizza;

/**
 * @author nitin
 */
public class NYStyleClamPizza extends Pizza {

    public NYStyleClamPizza() {
        name = "NY style Clam Pizza";
        dough = "Thin crust";
        sauce = "White garlic sauce";
        toppings.add("Clams");
        toppings.add("Grated parmesan cheese");
    }
}
