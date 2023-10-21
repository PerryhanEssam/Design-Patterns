/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package decoratorpattern;

/**
 *
 * @author w
 */
public class HouseBlend extends Beverage{
    public HouseBlend(){
        this.description = "House Blend Coffee";
    }    
    
    public double cost(){
        return 0.89;
    }
}
