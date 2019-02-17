
package hdt4;

/**
 * @author Estuardo
 * @author Gerardo
 * @param <E> tipo de datos que la clase recibe como parametro 
 */
public interface iStack<E>
{
    
    public void push(E item);
    
    public E pop();
    
    public E peek();
    
    public boolean empty();
    
    public int size();
    
}