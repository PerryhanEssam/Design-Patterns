/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package decoratorpattern;

public class Mocha extends CondimentDecorator{

    public Mocha(Beverage flavor){
        super(flavor);
        this.description = "with Mocha";
    }
    
    public String getDescription(){
        return flavor.getDescription() + " " + description;
    }
    
    public double cost(){
        return flavor.cost() + 0.20;
    }
}
