/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package weatherdata;

/**
 *
 * @author Hermes
 */
public class WeatherData {

          ConcreteSubject weatherData = new ConcreteSubject();

      Observer displayA = new DisplayA();
      DisplayB displayB = new DisplayB();
      DisplayC displayC = new DisplayC();

      WeatherData.register(displayA);
      weatherData.register(displayB);
      weatherData.register(displayC);
      weatherData.measurementChanged();
      weatherData.measurementChanged();


    
}
