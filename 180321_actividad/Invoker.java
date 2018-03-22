/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg180320_actividad_Ver2;

import java.util.List;

/**
 *
 * @author Hermes
 */
public class Invoker {
    Command lastCommand;
    Command commands[] = new Command[8];

	public void setCommand(Command c, int i){
		if(i <= 8 && i >= 1) {
			commands[i-1] = c;
		}
	}

	public void boton1(){
		if(commands[0] != null){
			commands[0].execute();
			lastCommand = commands[0];
		}
	}

	public void boton2(){
		if(commands[1] != null){
			commands[1].execute();
			lastCommand = commands[1];
		}
	}

	public void boton3(){
		if(commands[2] != null){
			commands[2].execute();
			lastCommand = commands[2];
		}
	}

	public void boton4(){
		if(commands[3] != null){
			commands[3].execute();
			lastCommand = commands[3];
		}
	}

	public void boton5(){
		if(commands[4] != null){
			commands[4].execute();
			lastCommand = commands[4];
		}
	}

	public void boton6(){
		if(commands[5] != null){
			commands[5].execute();
			lastCommand = commands[5];
		}
	}

	public void boton7(){
		if(commands[6] != null){
			commands[6].execute();
			lastCommand = commands[6];
		}
	}

	public void boton8(){
		if(commands[7] != null){
			commands[7].execute();
			lastCommand = commands[7];
		}
	}
        
        public void boton9(){
		if(commands[8] != null){
			commands[8].execute();
			lastCommand = commands[8];
		}
	}

	public void undo(){
		if(lastCommand != null){
			lastCommand.undo();
			lastCommand = null;
		}
	}
}

