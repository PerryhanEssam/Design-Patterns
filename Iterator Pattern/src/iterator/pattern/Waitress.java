/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package iterator.pattern;

import java.util.Iterator;

public class Waitress {
    Menu dinnerMenu;
    Menu breakfastMenu;
    
    public Waitress(Menu dinnerMenu, Menu breakfastMenu){
        this.breakfastMenu = breakfastMenu;
        this.dinnerMenu = dinnerMenu;
    }
    
    public void printMenu(){
        Iterator pancakeMenuIterator = breakfastMenu.createIterator();
        Iterator dinnerMenuIterator = dinnerMenu.createIterator();
        printMenu(pancakeMenuIterator);
        System.out.println();
        printMenu(dinnerMenuIterator);
    }
    
    private void printMenu(Iterator iterator){
        while(iterator.hasNext()){
            MenuItem item = (MenuItem)iterator.next();
            System.out.print(item.getName()+ " ");
            System.out.print(item.getVegeterian());
        }
    }
}
