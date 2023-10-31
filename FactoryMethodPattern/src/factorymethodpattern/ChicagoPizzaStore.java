/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package factorymethodpattern;

public class ChicagoPizzaStore extends PizzaStore{
    public ChicagoPizzaStore(){
        
    }
    
    @Override
    public Pizza createPizza(String type){
        if(type.equals("cheese")){
            return new ChicagoStyleCheesePizza();
        }
        else if(type.equals("pepproni")){
            return new ChicagoStylePepproniPizza();
        }
        else{
            return null;
        }
    }
}
