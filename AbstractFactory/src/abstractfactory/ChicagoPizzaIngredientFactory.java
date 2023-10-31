/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package abstractfactory;

public class ChicagoPizzaIngredientFactory {
    public Sauce createSauce(){
        return new PlumTomatoSauce();
    }
    
    public  Cheese createCheese(){
        return new MozarellaCheese();
    }
    
    public Dough createDough(){
        return new ThickCrustDough();
    }

}
