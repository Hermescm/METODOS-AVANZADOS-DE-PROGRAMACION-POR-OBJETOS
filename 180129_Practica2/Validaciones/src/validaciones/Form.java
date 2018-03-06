package validaciones;


import java.util.ArrayList;

/**
 *
 * @author Hermes
 */
public class Form {
    
    ArrayList<Field> inputs;
    
    public Form(){
    
            inputs = new ArrayList<Field>();
    }
    
    public void add(Field tf){
    
        inputs.add(tf);
    
    
    }
    
    public boolean validate(){
        
        for(int i = 0; i < inputs.size();i++){
            if(!inputs.get(i).validate()){
                return false;
            }
        
        }
        return true;
    }
    
}
