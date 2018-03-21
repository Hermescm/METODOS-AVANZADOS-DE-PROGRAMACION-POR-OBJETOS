/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg180320_actividad;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Hermes
 */
public class Luz {
    public static List CrearAccion() {
        List<Command> queue = new ArrayList<>();
        queue.add(new Prender());
        return queue;
    }
}
