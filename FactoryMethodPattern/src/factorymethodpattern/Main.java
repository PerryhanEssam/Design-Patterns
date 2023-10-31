/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package factorymethodpattern;

public class Main {

    public static void main(String[] args) {
        PizzaStore pizzastore = new NYPizzaStore();
        Pizza pizza = pizzastore.order("cheese");
        
        System.out.println(pizza.getName());
        
        pizzastore = new ChicagoPizzaStore();
        pizza = pizzastore.order("cheese");
        System.out.print(pizza.getName());
        
    }
    
}
