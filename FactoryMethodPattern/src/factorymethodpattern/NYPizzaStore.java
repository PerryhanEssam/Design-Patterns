/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package factorymethodpattern;

public class NYPizzaStore extends PizzaStore{
    public NYPizzaStore(){
        
    }
    
    @Override
    public Pizza createPizza(String type){
        if(type.equals("cheese")){
            return new NYStyleCheesePizza();
        }
        else if(type.equals("pepproni")){
            return new NYStylePepproniPizza();
        }
        else{
            return null;
        }
    }
}
