/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package decoratorpattern;

public class Decaf extends Beverage{
    
    public Decaf(){
        this.description = "Decaf Coffee";
    }    
    
    public double cost(){
        return 1.05;
    }
}
