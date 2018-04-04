import java.util.Enumeration;
import java.util.*;

public class Cliente {

    public static void main(String[] args) {
    	
    	Vector<Object> vector = new Vector<Object>();
		vector.add(new Object());

        Enumeration<Object> i = vector.elements();
  

        Adaptor eIterator = new Adaptor(i); 
        eIterator.hasNext();
        eIterator.next();
        eIterator.remove();
      
    }
    
}

