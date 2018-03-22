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
public class Abrir implements Command {
    Puerta garage;

	public Abrir(Puerta g){
		this.garage = g;
	}

    @Override
	public void execute(){
		garage.abrir();
	}

    @Override
	public void undo(){
		garage.cerrar();
	}
}
