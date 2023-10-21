/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package decoratorpattern;

public class Espresso extends Beverage{
    public Espresso(){
        this.description = "Espresso Coffee";
    }    
    
    public double cost(){
        return 1.99;
    }
}
