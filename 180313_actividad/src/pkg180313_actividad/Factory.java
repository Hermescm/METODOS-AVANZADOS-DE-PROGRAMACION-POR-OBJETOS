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

public abstract class Factory {
	
public Pizza orderPizza(String nombre) {
		
		Pizza pizza = createPizza(nombre);
		pizza.preparar();
		pizza.cortar();
		pizza.caja();
		
		return pizza;
	}

	public abstract Pizza createPizza(String nombre);	
}
