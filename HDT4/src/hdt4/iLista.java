
package hdt4;

/**
 * @author Estuardo
 * @author Gerardo
 * @param <E>
 */
public interface iLista<E> extends iStack<E>
{
    @Override
    public void push(E value);
   // post: valor agregado al final de la lista
    
    @Override
    public E pop();
   // pre: la lista tiene por lo menos un elemento 
   // post: elimina el ultimo elemento de la lista y lo devuelve 
   
    @Override
    public E peek();
   // pre: la lista tiene por lo menos un elemento 
   // post: devuelve el ultimo elemento de la lista

    @Override
    public boolean empty();
   // post: true si la lista esta vacia, false si no
   
    @Override
    public int size();
   // post: devuelve el numero de elementos en la lista

}
