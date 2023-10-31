/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package abstractfactory;

public class NYPizzaStore extends PizzaStore{
    public Pizza createPizza(String type){
        Pizza pizza = null;
        PizzaIngredientFactory pizzaIngredient = new NYPizzaIngredientFactory();
        
        if(type.equals("cheese")){
            pizza = new CheesePizza(pizzaIngredient);
        }
        else if(type.equals("clam")){
            pizza = new ClamPizza(pizzaIngredient);
        }
        
        return pizza;
    }
}
