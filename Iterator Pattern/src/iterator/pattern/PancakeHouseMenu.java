/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package iterator.pattern;

import java.util.ArrayList;

public class PancakeHouseMenu implements Menu{
    ArrayList<MenuItem> items;
    
    public PancakeHouseMenu(){
        items = new ArrayList<MenuItem>();
        addItem("Bluberry pancakes", "pancake made with fresh berries", true, 3.59);
    }
    
    public void addItem(String name, String description, boolean vegeterian, double price){
        MenuItem item = new MenuItem(name, description, vegeterian, price);
        this.items.add(item);
    }
    
    public java.util.Iterator createIterator(){
        return items.iterator();
    }
}
