/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividad;
import java.util.*;

public class ConcreteSubject extends Observable{
  private float t;
  private float h;
  private float p;

  public ConcreteSubject() {


  }

  public void measurementChanged(){
	  setChanged();
    notifyObservers(this.t);

  }
}
