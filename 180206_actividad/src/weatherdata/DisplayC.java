
import weatherdata.Observer;

public class DisplayC implements Observer{
  float datoFinal;
  public void update(float a, float b, float c){
    datoFinal = a + b + c;
    show();

  }

  public void show(){
    System.out.println(datoFinal);

  }

}
