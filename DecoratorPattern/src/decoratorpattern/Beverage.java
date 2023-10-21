/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package decoratorpattern;

public abstract class Beverage {
    String description;
    
    public Beverage(){
        description = "unknown beverage";
    }
    
    public String getDescription(){
        return description;
    }
    
    public abstract double cost();
}
