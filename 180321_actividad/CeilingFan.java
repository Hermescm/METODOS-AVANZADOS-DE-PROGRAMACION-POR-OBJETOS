/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg180320_actividad_Ver2;

/**
 *
 * @author Hermes
 */
public class CeilingFan {
	int estado;

	public CeilingFan(){
		this.estado = 0;
	}

	public void high(){
		estado = 3;
		System.out.println("Ventilador recio");
	}

	public void medium(){
		estado = 2;
		System.out.println("Ventilador Medio");
	}

	public void slow(){
		estado = 1;
		System.out.println("Ventilador bajo");
	}

	public void off(){
		estado = 0;
		System.out.println("Ventilador Apagado");
	}

	public int estadoActual(){
		return this.estado;
	}
}
