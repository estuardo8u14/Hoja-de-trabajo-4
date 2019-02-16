
package hdt4;

/**
 * @author Gerardo
 * @param <E>
 */
public interface iLista<E> 
{
    public void push(E value);
   // post: valor agregado al final de la lista
    
    public E pop();
   // pre: la lista tiene por lo menos un elemento 
   // post: elimina el ultimo elemento de la lista y lo devuelve 
   
    public E peek();
   // pre: la lista tiene por lo menos un elemento 
   // post: devuelve el ultimo elemento de la lista

   public boolean empty();
   // post: true si la lista esta vacia, false si no
   
   public int size();
   // post: devuelve el numero de elementos en la lista

}
