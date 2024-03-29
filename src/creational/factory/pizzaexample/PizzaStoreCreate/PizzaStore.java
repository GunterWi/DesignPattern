package creational.factory.pizzaexample.PizzaStoreCreate;

import creational.factory.pizzaexample.PizzaProduct.Pizza;

/**
 * @author Nitin
 */
public abstract class PizzaStore {

    public Pizza orderPizza(String type) {
        Pizza pizza = createPizza(type);
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();

        return pizza;
    }

    abstract Pizza createPizza(String type);
}
