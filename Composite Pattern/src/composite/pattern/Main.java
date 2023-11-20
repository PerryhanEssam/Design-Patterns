/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package composite.pattern;

public class Main {

    public static void main(String[] args) {
        MenuComponent pancakeMenu = new Menu("Pancake Menu", "Breakfast");
        MenuComponent dinnerMenu = new Menu("Dinner Menu", "Lunch");
        MenuComponent allMenus = new Menu("All menus", "All menus combined");
        
        allMenus.add(dinnerMenu);
        allMenus.add(pancakeMenu);
        
        dinnerMenu.add(new MenuItem("apple pie", "apple pie with klasky", true, 2.99));
        
        Waitress waitress  = new Waitress(allMenus);
        waitress.printMenus();
                
    }
    
}
