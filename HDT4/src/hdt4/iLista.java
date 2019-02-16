/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hdt4;

/**
 * @author Gerardo
 * @param <E>
 */
public interface iLista<E> 
{
    public void add(E value);
   // post: value is added to tail of list
    
    public E remove();
   // pre: list has at least one element
   // post: removes last value found in list
   
    public E get();
   // pre: list has at least one element
   // post: returns last value found in list

   public boolean isEmpty();
   // post: returns true iff list has no elements
   
   public int size();
   // post: returns number of elements in list

}
