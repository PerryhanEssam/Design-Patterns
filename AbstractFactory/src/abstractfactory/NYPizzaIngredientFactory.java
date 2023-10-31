/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package abstractfactory;

public class NYPizzaIngredientFactory implements PizzaIngredientFactory{
    
    public Sauce createSauce(){
        return new MarinarinSauce();
    }
    
    public  Cheese createCheese(){
        return new ReggianoCheese();
    }
    
    public Dough createDough(){
        return new ThinCrustDough();
    }
}
