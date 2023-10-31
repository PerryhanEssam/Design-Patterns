/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package abstractfactory;

import java.util.ArrayList;

public abstract class Pizza {
    PizzaIngredientFactory pizzaIngredient;
    Dough dough;
    Sauce sauce;
    Cheese cheese;
    
    public abstract void prepare();
    
    public void cut(){
        System.out.println("cutting the pizza into diagonal slices");
    }
    
    public void bake(){
        System.out.println("Bake for 25 minutes at 350");
    }
    
    public void box(){
        System.out.println("place pizza in box");
    }
    
}
