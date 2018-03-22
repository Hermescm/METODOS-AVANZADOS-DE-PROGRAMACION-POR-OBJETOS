/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg180320_actividad_Ver2;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Hermes
 */
public class Main{
	public static void main(String args[]){
		Invoker i = new Invoker();
		CeilingFan f = new CeilingFan();
		Puerta g = new Puerta();
                Luz l = new Luz();

				

		
		ArrayList<Command> comandito = new ArrayList<Command>();
		comandito.add(new FanCommand(f));
		comandito.add(new LuzSexy(l));
		comandito.add(new LuzVirgen(l));

		i.setCommand(new MacroComando(comandito),1);

		i.boton1();
		i.undo();
	}
} 