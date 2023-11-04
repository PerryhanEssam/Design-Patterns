/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package adapter;

public class TurkeyAdapter implements Duck{
      Turkey turkey;
      
      public TurkeyAdapter(Turkey turkey){
          this.turkey = turkey;
      }
      
      public void quack(){
          turkey.globble();
      }
      
      public void fly(){
          turkey.fly();
      }
}
