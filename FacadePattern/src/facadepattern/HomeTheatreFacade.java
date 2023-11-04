/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package facadepattern;

public class HomeTheatreFacade {
    Screen screen;
    TheatreLights theatre;
    PopcornPopper popper;
    
    public HomeTheatreFacade(Screen screen, TheatreLights theatre, PopcornPopper popper){
        this.screen = screen;
        this.theatre = theatre;
        this.popper = popper;
    }
    
    public void watchMovie(){
        screen.up();
        theatre.on();
        popper.on();
        popper.pop();
    }
}
