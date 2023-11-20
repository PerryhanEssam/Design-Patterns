/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package composite.pattern;

import java.util.ArrayList;
import java.util.Iterator;

public class Menu extends MenuComponent{
    String name;
    String description;
    ArrayList<MenuComponent> items = new ArrayList<>();
    
    public Menu(String name, String description){
        this.name = name;
        this.description = description;
    }
    
    public void add(MenuComponent component){
        items.add(component);
    }
    
    public void remove(MenuComponent component){
        items.remove(component);
    }

    public MenuComponent getChild(int i){
        return (MenuComponent)items.get(i);
    }
    
    public String getName(){
        return name;
    }
    
    public String getDescription(){
        return description;
    }
    
    public void print(){
        System.out.print(name + " " + description + "\n");
        Iterator iterator = items.iterator();
        
        while(iterator.hasNext()){
            MenuComponent item = (MenuComponent)iterator.next();
            item.print();
        }
    }
}
