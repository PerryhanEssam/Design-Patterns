/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package commandpattern;

public class StreoOnWithCDCommand implements Command{
    Streo streo;
    
    public StreoOnWithCDCommand(Streo streo){
        this.streo = streo;
    }
    
    public void execute(){
        streo.on();
        streo.setCD();
        streo.setVolume(11);
    }
    
    public void undo(){
        streo.off();
    }
}
