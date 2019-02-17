/**
 * @author Estuardo
 * @author Gerardo
 * @param <E> tipo de datos que la clase recibe como parametro 
 */
public interface iStack<E>
{
    /**
     *
     * @param valor a ser ingresado al stack
     */
    public void push(E item);
    
    /**
     *
     * @return elimina y devuelve el ultimo elemento del stack
     */
    public E pop();
    
    /**
     *
     * @return devuelve el ultimo elemento del stack
     */
    public E peek();
    
    /**
     *
     * @return stack vacío o no
     */
    public boolean empty();
    
    /**
     *
     * @return tamaño del stack
     */
    public int size();
    
}
