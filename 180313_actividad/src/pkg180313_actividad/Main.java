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
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		PizzeriaOxxo factory = new PizzeriaOxxo();
                PizzeriaJavaLava factory2 = new PizzeriaJavaLava();

		factory.orderPizza("Pepperoni");
                factory.orderPizza("Hawaiana");
                factory2.orderPizza("Chorizo");
	
	}
	

}

