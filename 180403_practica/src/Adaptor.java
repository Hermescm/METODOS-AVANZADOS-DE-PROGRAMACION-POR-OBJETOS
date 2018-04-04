import java.util.Enumeration;
import java.util.*;

public class Adaptor implements Iterator  {
    Enumeration enumerar;
    
    public Adaptor(Enumeration n)
    {
    this.enumerar=n;
    }
   
    @Override
    public boolean hasNext() {
    return  enumerar.hasMoreElements();
        
    }

    @Override
    public Object next() {
      return  enumerar.nextElement();
   }

    @Override
    public void remove() 
    {
        try {

        } catch (Exception name) {
                
        }
      
      
    }
    
}