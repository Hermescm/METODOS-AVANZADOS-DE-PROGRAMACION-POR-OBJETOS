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
public class Password implements Validation{

    @Override
    public boolean validate(String input) {
        if(input.length() > 5 && input.contains("123")){
            return true;
        }else{
            return false;
        }
    }
    
}
