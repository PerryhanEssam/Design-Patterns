/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package iterator.pattern;
import java.util.Iterator;

public class DinerMenuIterator implements Iterator{
    MenuItem[] items;
    int position = 0;
    
    public DinerMenuIterator(MenuItem[] items){
        this.items = items;
    }
    
    public Object next(){
        MenuItem menuItem = items[position];
        position++;
        return menuItem;
    }
    
    public boolean hasNext(){
        if(position >this.items.length || items[position] == null){
            return false;
        }
        else{
            return true;
        }
    }
    
    public void remove(){
        
    }
}
