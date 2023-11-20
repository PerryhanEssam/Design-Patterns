/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package iterator.pattern;

public class Main{

    public static void main(String[] args) {
        PancakeHouseMenu pancakeMenu = new PancakeHouseMenu();
        DinerMenu dinnerMenu = new DinerMenu();
        
        Waitress waitress = new Waitress(dinnerMenu, pancakeMenu);
        waitress.printMenu();
        
    }
    
}
