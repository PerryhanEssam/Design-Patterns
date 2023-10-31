/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package abstractfactory;

public class CheesePizza extends Pizza{
    public CheesePizza(PizzaIngredientFactory pizzaIngredient){
        this.pizzaIngredient = pizzaIngredient;
    }
    
    public void prepare(){
        this.cheese = pizzaIngredient.createCheese();
        this.dough = pizzaIngredient.createDough();
        this.sauce = pizzaIngredient.createSauce();
    }
}
