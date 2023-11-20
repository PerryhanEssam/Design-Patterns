/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package composite.pattern;

public abstract class MenuComponent {
    public void add(MenuComponent component){
        throw new UnsupportedOperationException();
    }
    
    public void remove(MenuComponent component){
        throw new UnsupportedOperationException();
    }
    
    public MenuComponent getChild(int i){
        throw new UnsupportedOperationException();
    }
    
    public String getName(){
        throw new UnsupportedOperationException();
    }
    
    public String getDescription(){
        throw new UnsupportedOperationException();
    } 
    
    public double getPrice(){
        throw new UnsupportedOperationException();
    }
    
    public boolean getVegeterian(){
        throw new UnsupportedOperationException();
    }
    
    public void print(){
        throw new UnsupportedOperationException();
    }
}
