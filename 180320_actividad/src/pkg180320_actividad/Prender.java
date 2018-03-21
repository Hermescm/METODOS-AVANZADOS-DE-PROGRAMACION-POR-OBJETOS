/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg180320_actividad;

/**
 *
 * @author Hermes
 */
public class Prender implements Command{
    public void execute() {
        System.out.println("Prende Luz");
    }
//    public void undo() {
//        System.out.println("Prende Luz");
//    }
}
