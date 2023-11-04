/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package commandpattern;

public class LightOffCommand implements Command{
    Light light;
    
    public LightOffCommand(Light light){
        this.light = light;
    }
    
    public void execute(){
        light.off();
    }
    
    public void undo(){
        light.on();
    }
}
