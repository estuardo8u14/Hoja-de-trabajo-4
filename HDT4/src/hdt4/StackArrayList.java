import java.util.ArrayList;

/**
 * @author Estuardo
 * @author Gerardo
 * @param <E>
 */
public class StackArrayList<E> implements iStack<E> 
{
    
    private ArrayList<E> arrayList;

    /**
     * Constructor
     */
    public StackArrayList() {
        this.arrayList = new ArrayList<>();
        System.out.println("Array List");
    }
    
    /**
     * @param item
     * @see iPila push(java.lang.Object)
     */

    @Override
    public void push(E item) 
    {
        arrayList.add(item);
    }

    /*
     * @see iPila pop()
     */
    @Override
    public E pop() 
    {
        E res;
        res = arrayList.remove(size()-1);
        return res;
    }

    /* 
     * @see iPila peek()
     */
    @Override
    public E peek() 
    {
        E peek;
        peek = arrayList.get(size()-1);
        return peek;
    }

    /* (non-Javadoc)
     * @see iPila#empty()
     */
    @Override
    public boolean empty() 
    {
        return arrayList.isEmpty();
    }

    /* (non-Javadoc)
     * @see iPila#size()
     */
    @Override
    public int size() 
    {
        int size;
        size = arrayList.size();
        return size;
    }
    
}
