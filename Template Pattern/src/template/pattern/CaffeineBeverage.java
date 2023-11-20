/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package template.pattern;

public abstract class CaffeineBeverage{
    
    public CaffeineBeverage(){}
    
    public void prepareBeverage(){
        boilWater();
        brew();
        pourInCup();
        addCondiments();
    }
    
    public abstract void addCondiments();
    public abstract void brew();
    
    public void boilWater(){
        System.out.println("Boiling water");
    }
    
    public void pourInCup(){
        System.out.println("pouring into cup");
    }
}
