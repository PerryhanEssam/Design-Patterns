/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package observerpattern;

public class Main {

    public static void main(String[] args) {
        WeatherData weatherdata = new WeatherData();
        CurrentCondition currentCondition = new CurrentCondition(weatherdata);
        weatherdata.setWeather(20.0f, 30.0f, 40.0f);
        weatherdata.setWeather(50.0f, 60.0f, 80.0f);
    }
    
}
