/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package commandpattern;

public class RemoteControl {
    Command[] onCommands;
    Command[] offCommands;
    Command current;
    
    public RemoteControl(){
        onCommands = new Command[7];
        offCommands = new Command[7];
        Command noCommand = new NoCommand();
        current = noCommand;
        
        for(int i = 0;i < 7;i++){
            onCommands[i] = noCommand;
            offCommands[i] = noCommand;
        }
    }
    
    public void setCommand(int slot, Command onCommand, Command offCommand){
        this.onCommands[slot] = onCommand;
        this.offCommands[slot] = offCommand;
    } 
    
    public void onButtonPressed(int slot){
        this.onCommands[slot].execute();
        current = onCommands[slot];
    }
    
    public void offButtonPressed(int slot){
        this.offCommands[slot].execute();
        current = offCommands[slot];
    }
    
    public void undo(){
        current.undo();
    }
}
