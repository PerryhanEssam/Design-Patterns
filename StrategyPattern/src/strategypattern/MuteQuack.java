/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package strategypattern;

public class MuteQuack implements QuackingBehaviour{
    public void quack(){
        System.out.println("Mute");
    }
}
