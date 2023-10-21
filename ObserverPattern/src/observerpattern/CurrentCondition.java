/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package observerpattern;

public class CurrentCondition implements Observer, Display{
    public float temp;
    public float humidity;
    public float pressure;
    public Subject subject;
    
    public CurrentCondition(Subject subject){
        this.subject = (Subject)subject;
        this.subject.registerObserver(this);
    }
    
    public void update(float temp, float humidity, float pressure){
        this.temp = temp;
        this.humidity = humidity;
        this.pressure = pressure;
        display();
    }
    
    public void display(){
        System.out.printf("tempreture is %f, humidity is %f and pressure is %f\n", temp, humidity, pressure);
    }
}


