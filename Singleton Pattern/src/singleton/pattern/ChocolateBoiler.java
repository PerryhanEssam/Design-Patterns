/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package singleton.pattern;

public class ChocolateBoiler {
    boolean boiled;
    boolean empty;
    private static ChocolateBoiler instance;
    
    private ChocolateBoiler(){
        this.empty = true;
        this.boiled = false;
    } 
    
    public static synchronized ChocolateBoiler getInstance(){
        if(instance == null){
            instance = new ChocolateBoiler();
        }
        return instance;
    }
    
    public void fill(){
        if(isEmpty()){
            empty = false;
            boiled = false;
        }
    }
    
    public void drain(){
        if(!isEmpty() && isBoiled()){
            empty = true;
        }
    }
    
    public void boil(){
        if(!isEmpty() && !isBoiled()){
            boiled = true;
        }
    }
    
    public boolean isEmpty(){
        return empty;
    }
    
    public boolean isBoiled(){
        return boiled;
    }
}
