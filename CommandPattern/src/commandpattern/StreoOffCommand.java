/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package commandpattern;

public class StreoOffCommand implements Command{
    Streo streo;
    
    public StreoOffCommand(Streo streo){
        this.streo = streo;
    }
    
    public void execute(){
        streo.off();
    } 
    
    public void undo(){
        streo.on();
        streo.setCD();
        streo.setVolume(11);
    }
}
