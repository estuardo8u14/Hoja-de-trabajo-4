
package hdt4;

public class LinkdList<E> implements iLista<E> 
{
    
    protected int count; // list size
    protected Node<E> head; // ref. to first element

    public LinkdList()
    // post: generates an empty list
    {
        head = null;
        count = 0;
    }
    
    @Override
    public void add(E value)
    // post: adds value to end of list
    {
        // location for new value
        Node<E> temp = new Node<>(value,null);
        if (head != null)
        {
            // pointer to possible tail
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
    public E remove()
    // pre: list is not empty
    // post: removes and returns value from beginning of list
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
    public E get()
    // pre: list is not empty
    // post: returns first value in list
    {
        return head.value();
    }
   
    @Override
    public int size()
    // post: returns number of elements in list
    {
        return count;
    }

    @Override
    public boolean isEmpty() 
    {
        return size() == 0;
    }   
}
