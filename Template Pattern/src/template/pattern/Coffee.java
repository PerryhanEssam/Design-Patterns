/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package template.pattern;

public class Coffee extends CaffeineBeverage{
    public Coffee(){}
    
    @Override
    public void brew(){
        System.out.println("Drepping coffee into filter");
    }
    
    @Override
    public void addCondiments(){
        System.out.println("Adding sugar and milk");
    }
}
