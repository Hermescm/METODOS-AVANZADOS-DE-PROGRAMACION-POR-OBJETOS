import java.util.*;

public class ConcreteSubject implements Subject{
  private float temp;
  private float hum;
  private float press;
  private List<Observer> observers = new ArrayList<Observer>();

  public void register(Observer o){
    observers.add(o);
  }
  public void remove(Observer o){
    observers.add(o);
  }
  public void notify(){

    for(Observer item: observers){
      item.update(this.temp,this.hum,this.press);
    }

  }
  public void measurementChanged(){
    Random random = new Random();
    this.temp = random.nextFloat();
    this.hum = random.nextFloat();
    this.press = random.nextFloat();
    notify();
  }
}
