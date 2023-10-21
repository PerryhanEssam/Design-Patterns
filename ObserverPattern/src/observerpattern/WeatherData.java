/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package observerpattern;

import java.util.ArrayList;

public class WeatherData implements Subject{
    public float temp;
    public float humidity;
    public float pressure;
    public ArrayList<Observer> observers;
    
    public WeatherData(){
        observers = new ArrayList<>();
    }
    
    public void registerObserver(Observer observer){
        observers.add(observer);
    }
    
    public void removeObserver(Observer observer){
        int pos = observers.indexOf(observer);
        if(pos >= 0){
            observers.remove(observer);
        }
    }
    
    public void notifyObserver(){
        for(int i = 0;i < observers.size();i++){
            Observer observer = observers.get(i);
            observer.update(temp, humidity, pressure);
        }
    }
    
    public float getTemp(){
        return temp;
    }
    
    public float getHumidity(){
        return humidity;
    }
    
    public float getPressure(){
        return pressure;
    }
    
    public void measurmentChanged(){
        notifyObserver();
    }
    
    public void setWeather(float temp, float humidity, float pressure){
        this.temp = temp;
        this.humidity = humidity;
        this.pressure = pressure;
        measurmentChanged();
    }
}
