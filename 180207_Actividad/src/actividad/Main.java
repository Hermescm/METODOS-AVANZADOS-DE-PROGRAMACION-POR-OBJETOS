package actividad;
import java.util.*;

public class Main{


  public static void main(String args[]){
      ConcreteSubject weatherData = new ConcreteSubject();

      DisplayA displayA = new DisplayA(weatherData);
      DisplayB displayB = new DisplayB(weatherData);
      DisplayC displayC = new DisplayC(weatherData);

      weatherData.measurementChanged();
      weatherData.measurementChanged();




  }
}
