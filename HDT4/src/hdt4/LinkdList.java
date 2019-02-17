
package hdt4;

/**
 * @author Estuardo
 * @author Gerardo
 * @param <E>
 */
public class LinkdList<E> implements iLista<E> 
{
    
    protected int count; // tamaño de la lista
    protected Node<E> head; // referencia al primer elemento

    public LinkdList()
    // post: genera una lista vacía
    {
        System.out.println("Linked List");
        head = null;
        count = 0;
    }
    
    @Override
    public void push(E value)
    // post: agrega el valor al final de la lista 
    {
        // lugar del nuevo valor
        Node<E> temp = new Node<>(value,null);
        if (head != null)
        {
            // pointer hacia el ultimo nodo
            Node<E> finger = head;
        while (finger.next() != null)
        {
            finger = finger.next();
        }
		 
        finger.setNext(temp);
        } else head = temp;
	  
            count++;  
    }
    
    @Override
    public E pop()
    // pre: lista no esta vacía 
    // post: elimina y devuelve el ultimo elemento de la lista
    {
        Node<E> finger = head;
        Node<E> previous = null;
        
        while(finger.next() != null)
        {
            previous = finger;
            finger = finger.next();
        }
        
        if(previous == null)
        {
            head = null;
        }
        else
        {
            previous.setNext(null);
        }
        count--;
        return finger.value();
    }
    
    @Override
    public E peek()
    // pre: lista no esta vacía
    // post: devuelve el último elemento de la lista
    {
        return head.value();
    }
   
    @Override
    public int size()
    // post: devuelve el numero de elementos
    {
        return count;
    }

    @Override
    public boolean empty() 
    {
        return size() == 0;
    }   
}
