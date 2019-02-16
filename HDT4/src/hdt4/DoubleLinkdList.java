
package hdt4;

/**
 *
 * @author Gerardo
 * @param <E>
 */
public class DoubleLinkdList<E> extends AbstractList<E>
{
    protected int length;
    protected DoubleNode<E> head;
    protected DoubleNode<E> tail;

    public DoubleLinkdList()
    // post: construye una lista vacía
    {
        System.out.println("Double Linked List");
        this.head = null;
        this.tail = null;
        this.length = 0;
    }

    @Override
    public void push(E value)
    // pre: value no es nulo
    // post: agrega un nuevo valor a la cola
    {
        DoubleNode<E> newNode = new DoubleNode(value);
        if(empty())
        {
            head = newNode;
        } else{
            tail.next = newNode;
        }
        newNode.previous = tail;
        tail = newNode;
        length++;
    }


    @Override
    public E pop()
    // pre: lista no está vacía 
    // post: elimina y devuelve el último valor de la lista
    {   
        DoubleNode<E> temp = tail;
        if(head == tail)
        {
            head = null;
        } else{
            tail.previous.next = null;
        }
        tail = tail.previous;
        temp.previous = null;
        length--;
        return temp.data;
    }
    
    @Override
    public E peek()
    // pre: lista no esta vacía
    // post: devuelve el último elemento de la lista
    {
        DoubleNode<E> temp = head;
        return temp.data;
    }
   
    @Override
    public int size()
    // post: devuelve el numero de elementos
    {
        return length;
    }

    @Override
    public boolean empty() 
    {
        return size() == 0;
    } 
    
    public void displayForw()
    {
        if(head == null){
            return;
        }
        
        DoubleNode<E> temp = head;
        while(temp != null)
        {
            System.out.print(temp.data + " --> ");
            temp = temp.next;
        }
        System.out.println("null");
        
    }
}
