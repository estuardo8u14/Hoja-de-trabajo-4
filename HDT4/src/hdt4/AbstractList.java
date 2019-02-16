
package hdt4;

/**
 *
 * @author Gerardo
 * @param <E>
 */
public abstract class AbstractList<E> implements iLista<E>
{
    public AbstractList(){
        
    }
    
    /**
     * @param value valor que se agregara a la lista
     */
    @Override
    abstract public void push(E value);

    /**
     * @return ultimo valor de la lista
     */
    @Override
    abstract public E pop();

    /**
     * @return ultimo valor de la lista
     */
    @Override
    abstract public E peek();
    
    /**
     * @return tamaño de la lista
     */
    @Override
    abstract public int size();

    /**
     * @return lista esta vacía o no
     */
    @Override
    public boolean empty() 
    {
        return size() == 0;
    }
}
