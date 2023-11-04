/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package facadepattern;

public class FacadePattern {

    public static void main(String[] args) {
        Screen screen = new Screen();
        TheatreLights theatre = new TheatreLights();
        PopcornPopper popper = new PopcornPopper();
        HomeTheatreFacade homeTheatre = new HomeTheatreFacade(screen, theatre, popper);
        homeTheatre.watchMovie();
    }
    
}
