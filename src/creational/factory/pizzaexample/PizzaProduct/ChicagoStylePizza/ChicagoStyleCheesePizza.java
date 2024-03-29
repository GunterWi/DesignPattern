package creational.factory.pizzaexample.PizzaProduct.ChicagoStylePizza;


import creational.factory.pizzaexample.PizzaProduct.Pizza;

/**
 * @author Nitin
 */
public class ChicagoStyleCheesePizza extends Pizza {

    public ChicagoStyleCheesePizza() {
        name = "Chicago style cheese Pizza";
        dough = "Thick crust";
        sauce = "Plum tomato sauce";
        toppings.add("cheese");
    }
}