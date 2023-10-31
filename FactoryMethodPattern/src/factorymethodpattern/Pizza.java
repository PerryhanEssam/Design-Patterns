/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package factorymethodpattern;

import java.util.ArrayList;

public abstract class Pizza {
    String name;
    String dough;
    String sauce;
    ArrayList<String> topping = new ArrayList<>();
    
    public void prepare(){
        System.out.println("prepare pizza " + name);
        System.out.println("Tossing dough....." + dough);
        System.out.println("Adding Sauce....." + sauce);
        System.out.println("Adding toppings....");
        
        for(int i = 0;i < topping.size();i++){
            System.out.println(topping.get(i));
        }
    }
    
    public void cut(){
        System.out.println("cutting the pizza into diagonal slices");
    }
    
    public void bake(){
        System.out.println("Bake for 25 minutes at 350");
    }
    
    public void box(){
        System.out.println("place pizza in box");
    }
    
    public String getName(){
        return name;
    }
}
