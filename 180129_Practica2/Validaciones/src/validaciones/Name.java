/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package validaciones;

/**
 *
 * @author Hermes
 */
public class Name implements Validation{

    @Override
    public boolean validate(String input) {
        if(input.matches("[a-zA-Z]+")){
            return true;
        }else{
            return false;
        }
    }
    
    
}