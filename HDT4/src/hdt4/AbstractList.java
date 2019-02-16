/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hdt4;

/**
 *
 * @author Gerardo
 * @param <E>
 */
public abstract class AbstractList<E> implements iLista<E>
{
    public AbstractList(){
        
    }
    
    @Override
    abstract public void add(E value);

    @Override
    abstract public E remove();

    @Override
    abstract public E get();
    
    @Override
    abstract public int size();

    @Override
    public boolean isEmpty() 
    {
        return size() == 0;
    }
}
