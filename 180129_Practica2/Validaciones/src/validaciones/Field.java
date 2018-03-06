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
public class Field {
    Validation validation;
    String text;
    
    public boolean validate(){
        return this.validation.validate(this.text);
    }
}
