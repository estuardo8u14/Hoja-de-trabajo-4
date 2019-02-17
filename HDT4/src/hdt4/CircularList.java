/**
 * @author Gerardo
 * @author Estuardo
 * @param <E>
 */
public class CircularList<E> extends AbstractList<E>{

    protected Node<E> tail;
    protected int count;

    public CircularList()
    // pre: crea una nueva lista circular
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
        Node<E> temp = new Node<>(value);
        if (tail == null) { // se agrega el primer valor 
            tail = temp;
            tail.setNext(tail);
        } else { // elemento existe en la lista
            temp.setNext(tail.next());
            tail.setNext(temp);
        }
        count++;
    }
    
    @Override
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
        // se tiene al penultimo valor
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
        return tail.value();
    }

    @Override
    public boolean empty() 
    {
        return count == 0;
    }

}
