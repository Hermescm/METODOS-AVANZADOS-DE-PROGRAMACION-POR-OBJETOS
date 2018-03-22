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
public class Apagar implements Command{
    Luz lights;

	public Apagar(Luz l){
		this.lights = l;
	}

	public void execute(){
		lights.apagadas();
	}

	public void undo(){
		lights.encendidas();
	}
}
