
package hdt4;

/**
 *
 * @author Gerardo
 */
public class ListFactory 
{
    public iLista getStack(String tipo){
        
        if(tipo.equals("LINKEDLIST"))
        {
            return new LinkdList();
        }
        /*else if(tipo.equals("ARRAYLIST"))
        {
            return new StackArrayList();
        }*/
        return null;
    }
    
}
