/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package commandpattern;

public class Main{

    public static void main(String[] args) {
        RemoteControl remote = new RemoteControl();
        Light light = new Light();
        Streo streo = new Streo();
        
        LightOnCommand lightOn = new LightOnCommand(light);
        LightOffCommand lightOff = new LightOffCommand(light);
        
        StreoOnWithCDCommand streoOn = new StreoOnWithCDCommand(streo);
        StreoOffCommand streoOff = new StreoOffCommand(streo);
        
        remote.setCommand(1, lightOn, lightOff);
        remote.setCommand(2, streoOn, streoOff);
        
        remote.onButtonPressed(1);
        remote.offButtonPressed(1);
        
        remote.onButtonPressed(2);
        remote.offButtonPressed(2);
        
    }
    
}
