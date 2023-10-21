/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package decoratorpattern;

public class Milk extends CondimentDecorator{
    
    public Milk(Beverage flavor){
        super(flavor);
        this.description = "with Milk";
    }
    
    public String getDescription(){
        return flavor.getDescription() + " " + description;
    }
    
    public double cost(){
        return flavor.cost() + 0.10;
    }
}
