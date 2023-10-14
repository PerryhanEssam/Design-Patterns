/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package strategypattern;

public class RubberDuck extends Duck{
    public RubberDuck(){
       flying = new FlyNoWay();
       quacking = new Quack();
    }
    
    public void display(){
        System.out.println("I am a Rubber Duck");
    }
    
    public void fly(){
        flying.fly();
    }
    
    public void quack(){
        quacking.quack();
    }
}
