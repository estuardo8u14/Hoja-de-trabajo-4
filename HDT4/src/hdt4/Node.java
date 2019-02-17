/**
 * @author Estuardo
 * @author Gerardo
 * @param <E>
 */
public class Node<E> 
{
    protected E data;
    protected Node<E> nextElement;
    
    public Node(E a, Node<E> next)
    {
        data = a;
        nextElement = next;
    }
    
    public Node(E a)
    {
        this(a ,null);
    }
    
    public Node<E> next(){
        return nextElement;
    }
    
    public void setNext(Node<E> next)
    {
        nextElement = next;
    }
    
    public E value()
    {
        return data;
    }
    
    public void setValue(E value)
    {
        data = value;
    }  
}
