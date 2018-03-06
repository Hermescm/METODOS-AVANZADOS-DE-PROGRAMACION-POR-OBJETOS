/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividad;
import java.util.*;
public class DisplayC implements Observer{

  float FinalDat;

  

  public DisplayC(ConcreteSubject c) {
	  c.addObserver(this);
  }
  @Override
  public void update(Observable o, Object arg) {
  	if(o instanceof ConcreteSubject) {
  		if(arg != null) {
  		FinalDat = (float)arg;
  		show();
  		}
  		}
  }

    public void show(){
      System.out.println(FinalDat);

    }
}
