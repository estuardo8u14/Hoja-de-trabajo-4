import java.util.Vector;

/**
 * @author Estuardo
 * @author Gerardo
 * @param <E>
 */
public class StackVector<E> implements iStack<E> 
{
    
    private Vector<E> vector;

    /**
     * Constructor
     */
    public StackVector() {
        this.vector = new Vector<>();
        System.out.println("Vector");
    }
    
    /* (non-Javadoc)
     * @see iPila#push(java.lang.Object)
     */
    @Override
    public void push(E item) 
    {
        vector.add(item);
    }

    /* (non-Javadoc)
     * @see iPila#pop()
     */
    @Override
    public E pop() 
    {
        E res;
        res = vector.remove(size()-1);
        return res; 
    }

    /* (non-Javadoc)
     * @see iPila#peek()
     */
    @Override
    public E peek() 
    {
        E peek;
        peek = vector.get(size()-1);
        return peek;
    }

    /* (non-Javadoc)
     * @see iPila#empty()
     */
    @Override
    public boolean empty() 
    {
        return vector.isEmpty();
    }

    /* (non-Javadoc)
     * @see iPila#size()
     */
    @Override
    public int size() 
    {
        int size;
        size = vector.size();
        return size;
    }
    
}
