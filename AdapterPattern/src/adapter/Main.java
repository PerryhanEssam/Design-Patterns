/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package adapter;

public class Main {

    public static void main(String[] args) {
        Duck duck = new MallardDuck();
        Turkey wildTurkey = new WildTurkey();
        
        TurkeyAdapter turkeyAdapter = new TurkeyAdapter(wildTurkey);
        
        duck.quack();
        duck.fly();
        System.out.println();
        turkeyAdapter.quack();
        turkeyAdapter.fly();
        
    }
    
}
