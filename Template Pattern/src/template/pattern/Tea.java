/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package template.pattern;

public class Tea extends CaffeineBeverage{
    public Tea(){}
    
    @Override
    public void brew(){
        System.out.println("steeping tea");
    }
    
    @Override
    public void addCondiments(){
        System.out.println("Adding Lemon");
    }
}
