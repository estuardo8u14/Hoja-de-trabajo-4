package hdt4;

/**
 * @author Gerardo
 * @author Estuardo
 * @param <E>
 */
public class CircularList<E> extends AbstractList<E>{

    protected Node<E> tail;
    protected int count;

    public CircularList()
    // pre: constructs a new circular list
    {
        tail = null;
        count = 0;
    }
    
    @Override
    public int size() 
    {
        return count;
    }
    
    public void addFirst(E value) 
    {
        Node<E> temp = new Node<E>(value);
        if (tail == null) { // first value added
            tail = temp;
            tail.setNext(tail);
        } else { // element exists in list
            temp.setNext(tail.next());
            tail.setNext(temp);
        }
        count++;
    }
    
    public void push(E value)
    {
        addFirst(value);
        tail = tail.next();
    }

    @Override
    public E pop() 
    {
        Node<E> finger = tail;
        while (finger.next() != tail) {
            finger = finger.next();
        }
        // finger now points to second-to-last value
        Node<E> temp = tail;
        if (finger == tail)
        {
            tail = null;
        } else {
            finger.setNext(tail.next());
            tail = finger;
        }
        count--;
        return temp.value();
    }

    @Override
    public E peek() 
    {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean empty() 
    {
        return count == 0;
    }

}
