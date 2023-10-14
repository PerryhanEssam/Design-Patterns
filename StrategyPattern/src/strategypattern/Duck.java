/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package strategypattern;

public abstract class Duck {
    protected FlyingBehaviour flying;
    protected QuackingBehaviour quacking;
    
    public Duck(){
        
    }
    
    public abstract void display();
    public abstract void quack();
    public abstract void fly();
    
    public void setFlyingBehaviour(FlyingBehaviour flying){
        this.flying = flying;
    }
    
    public void setQuackSound(QuackingBehaviour quacking){
        this.quacking = quacking;
    }
    
    public void swim(){
        System.out.println("I can swim");
    }
}
