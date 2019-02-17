
package hdt4;

/**
 * @author Estuardo
 * @author Gerardo
 */
public class ListFactory 
{
    public iLista getStack(String tipo){
        
        if(tipo.equals("LINKEDLIST"))
        {
            return new LinkdList();
        }
        else if(tipo.equals("DOUBLELINKEDLIST"))
        {
            return null;
        }
        else if(tipo.equals("CIRCULARLIST"))
        {
            return null;
        }
        return null;
    }
    
}
