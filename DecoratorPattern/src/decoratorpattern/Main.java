/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package decoratorpattern;

public class Main {

    public static void main(String[] args) {
        Beverage Espresso = new Mocha(new Milk(new Espresso()));
        System.out.println(Espresso.getDescription());
        System.out.println(Espresso.cost());
    }
    
}
