/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package decoratorpattern;

public abstract class CondimentDecorator extends Beverage{
    protected Beverage flavor;
    
    public CondimentDecorator(Beverage flavor){
        this.flavor = flavor;
    }
    
}
