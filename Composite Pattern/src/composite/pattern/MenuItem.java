/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package composite.pattern;

public class MenuItem extends MenuComponent{
    String name;
    String description;
    boolean vegeterian;
    double price;
    
    public MenuItem(String name, String description, boolean vegeterian, double price){
        this.name = name;
        this.description = description;
        this.vegeterian = vegeterian;
        this.price = price;
    }
    
    public String getName(){
        return name;
    }
    
    public String getDescription(){
        return description;
    } 
    
    public double getPrice(){
        return price;
    }
    
    public boolean getVegeterian(){
        return vegeterian;
    }
    
    public void print(){
        System.out.print(name + " " + description + " " + vegeterian + " " + price + "\n");
    }
}
