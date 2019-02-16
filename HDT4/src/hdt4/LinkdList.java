
package hdt4;

import java.util.LinkedList;
import java.util.List;;


public class LinkdList<E> implements iLista<E> 
{
    
    private List<E> list;

    /**
     * Constructor
     */
    public LinkdList() {
        this.list = new LinkedList<>();
    }
    
    /**
     * @param value = valor a ser agregado
     */
    @Override
    public void add(E value)
    {
        
    }
   // post: value is added to tail of list
    
    /**
     * @return valor removido de la ultima posicion
     */
    @Override
    public E remove()
    {
        return null;
    }
   // pre: list has at least one element
   // post: removes last value found in list
   
    /**
     * @return ultimo elemento de la lista
     */
    @Override
    public E get()
    {
        return null;
    }
   // pre: list has at least one element
   // post: returns last value found in list

    /**
     * @return true o false, vacia o no
     */
    @Override
   public boolean isEmpty()
   {
       return true;
   }
   // post: returns true iff list has no elements
   
    /**
     * @return tamaño de la lista
     */
    @Override
   public int size()
   {
       return 0;
   }
   // post: returns number of elements in list
    
}
