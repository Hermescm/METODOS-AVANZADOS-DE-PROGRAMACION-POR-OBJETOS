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
public class LuzSexy implements Command{
    Luz luces;

	public LuzSexy(Luz l){
		this.luces = l;
	}

	public void execute(){
		luces.sexy();
	}

	public void undo(){
		luces.sexyOff();
	}
}
