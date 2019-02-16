
package hdt4;

/**
 *
 * @author Gerardo
 * @param <E>
 */
public class DoubleNode<E>
{
    protected E data;
    protected DoubleNode<E> next;
    protected DoubleNode<E> previous;
    
    public DoubleNode(E v)
    {
        data = v;
    } 
}
