/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package factorymethodpattern;

public abstract class PizzaStore {
    public PizzaStore(){
        
    }
    
    public abstract Pizza createPizza(String type);
    
    public Pizza order(String type){
        Pizza pizza = createPizza(type);
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;
    }
   
}
