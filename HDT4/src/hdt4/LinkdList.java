
package hdt4;

import java.util.LinkedList;
import java.util.List;;


public class LinkdList<E> implements iStack<E> 
{
    
    private List<E> list;

    /**
     * Constructor
     */
    public LinkdList() {
        this.list = new LinkedList<>();
    }
    
    /*
     * @see iPila push(java.lang.Object)
     */
    @Override
    public void push(E item) 
    {
        list.add(item);
    }

    /*
     * @see iPila pop()
     */
    @Override
    public E pop() 
    {
        E res;
        res = list.remove(size()-1);
        return res;
    }

    /* 
     * @see iPila peek()
     */
    @Override
    public E peek() 
    {
        E peek;
        peek = list.get(size()-1);
        return peek;
    }

    /* (non-Javadoc)
     * @see iPila#empty()
     */
    @Override
    public boolean empty() 
    {
        return list.isEmpty();
    }

    /* (non-Javadoc)
     * @see iPila#size()
     */
    @Override
    public int size() 
    {
        int size;
        size = list.size();
        return size;
    }
    
}
