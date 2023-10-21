/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package decoratorpattern;

/**
 *
 * @author w
 */
public class Soy extends CondimentDecorator{
    public Soy(Beverage flavor){
        super(flavor);
        this.description = "with Soy";
    }
    
    public String getDescription(){
        return flavor.getDescription() + " " + description; 
    }
    
    public double cost(){
        return flavor.cost() + 0.15;
    }
}
