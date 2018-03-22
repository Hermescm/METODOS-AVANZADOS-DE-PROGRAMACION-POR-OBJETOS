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
public class FanCommand implements Command {
	CeilingFan venti;

	public FanCommand(CeilingFan f){
		this.venti = f;
	}

	public void execute(){
		if(venti.estadoActual() == 0){
			venti.slow();
		}
		else if(venti.estadoActual() == 1){
			venti.medium();
		}
		else if(venti.estadoActual() == 2){
			venti.high();
		}
		else{
			venti.off();
		}
	}

	public void undo(){
		if(venti.estadoActual() == 0){
			venti.high();
		}
		else if(venti.estadoActual() == 1){
			venti.off();
		}
		else if(venti.estadoActual() == 2){
			venti.slow();
		}
		else{
			venti.medium();
		}
	}
}