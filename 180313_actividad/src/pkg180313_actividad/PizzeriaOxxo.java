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

public class PizzeriaOxxo extends Factory {

	
	public Pizza createPizza(String nombre) {
		
		Pizza pizza = new Pepperoni();
		
		switch(nombre) {
		
			case "Pepperoni":
				pizza = new Pepperoni();
				break;
		

			case "Hawaiana":
				pizza = new Hawaiana();
				break;
		
		}
		
		return pizza;
	}

}
