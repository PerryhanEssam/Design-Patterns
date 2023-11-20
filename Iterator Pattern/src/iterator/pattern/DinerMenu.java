/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package iterator.pattern;
import java.util.Iterator;

public class DinerMenu implements Menu {
    MenuItem[] items;
    static final int max = 6;
    int noOfElements = 0;
    
    public DinerMenu(){
        items = new MenuItem[max];
        addItem("BLT", "Bacon with littuce", false, 2.88);
    }
    
    public void addItem(String name, String description, boolean vegeterian, double price){
        MenuItem item = new MenuItem(name, description, vegeterian, price);
        if(noOfElements >= max){
            System.out.println("list is full");
        }
        else{
            items[noOfElements] = item;
            noOfElements++;
        }
        
    }
    
    public Iterator createIterator(){
        return new DinerMenuIterator(items);
    }
}
