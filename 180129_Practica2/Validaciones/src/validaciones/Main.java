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
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    
        
        Field phone = new Field();
        phone.validation = new Phone();
        phone.text = "(664)-1824665";
        Field name = new Field();
        name.validation = new Name();
        name.text = "Hermes";
        Field address = new Field();
        address.text = "Col Aeropuerto Tijuana";
        address.validation = new Address();
        Field password = new Field();
        password.text = "Password123";
        password.validation = new Password();
        Field email = new Field();
        email.text = "correo@correo.com";
        email.validation = new Email();
        
          Form form = new Form();
      
        
        form.add(phone);
        form.add(name);
        form.add(address);
        form.add(email);
        form.add(password);
        System.out.println(form.validate());
        
        
    }
    
}
