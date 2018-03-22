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
public class Cerrar implements Command {
    Puerta garage;

	public Cerrar(Puerta g){
		this.garage = g;
	}

	public void execute(){
		garage.cerrar();
	}

	public void undo(){
		garage.abrir();
	}
}
