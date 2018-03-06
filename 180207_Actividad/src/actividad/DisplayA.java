/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividad;

import java.util.ArrayList;
import java.util.List;
import java.util.Observable;
import java.util.Observer;

public class DisplayA implements Observer{
  float Finaldat;
 
  
  public DisplayA(ConcreteSubject c) {
	  c.addObserver(this);
  }
  public void show(){
    System.out.println(Finaldat);

  }

@Override
public void update(Observable o, Object arg) {
	if(o instanceof ConcreteSubject) {
		if(arg != null) {
		Finaldat = (float)arg;
		show();
		}
		}
}

}
