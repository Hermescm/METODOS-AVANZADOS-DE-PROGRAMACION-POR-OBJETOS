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
import java.util.ArrayList;

public class MacroComando implements Command {
	ArrayList<Command> commands;

	public MacroComando(ArrayList<Command> c){
		this.commands = c;
	}

	public void execute(){
		for(Command c : commands){
			c.execute();
		}
	}

	public void undo(){
		for(Command c : commands){
			c.undo();
		}
	}
}
