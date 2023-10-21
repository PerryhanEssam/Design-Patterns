/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package decoratorpattern;

public class DarkRoast extends Beverage{
    public DarkRoast(){
        this.description = "Dark Roast Coffee";
    }    
    
    public double cost(){
        return 0.99;
    }
}
