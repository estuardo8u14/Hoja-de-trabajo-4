
package hdt4;

/**
 *
 * @author Gerardo
 */
public class StackFactory 
{
    
    public iStack getStack(String tipo){
        
        if(tipo.equals("VECTOR"))
        {
            return new StackVector();
        }
        else if(tipo.equals("ARRAYLIST"))
        {
            return new StackArrayList();
        }
        else if(tipo.equals("LINKEDLIST"))
        {
            return new LinkdList();
        }
        else if(tipo.equals("DOUBLELINKEDLIST"))
        {
            return new DoubleLinkdList();
        }
        else if(tipo.equals("CIRCULARLIST"))
        {
            return new CircularList();
        }
        return null;
    }
}
