/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg180320_actividad;

import java.util.List;

/**
 *
 * @author Hermes
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main( String[] args ) {
        List queue = Puerta.CrearAccion();
        Invoker.hacerAccion(queue);
    }   

}
