/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg180313_actividad;

/**
 *
 * @author Hermes
 */
public class PizzeriaJavaLava extends Factory {

	
	public Pizza createPizza(String nombre) {
		
		Pizza pizza = new Chorizo();
		
		switch(nombre) {
		
			case "Chorizo":
				pizza = new Chorizo();
				break;
		
		}
		
		return pizza;
	}

}