/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hdt4;

/**
 *
 * @author Gerardo
 */
public class StackFactory 
{
    
    public iStack getStack(String tipo){
        
        if(tipo.equals("VECTOR"))
        {
            return new StackVector();
        }
        else if(tipo.equals("ARRAYLIST"))
        {
            return new StackArrayList();
        }
        else if(tipo.equals("LINKEDLIST"))
        {
            return new LinkdList();
        }
        return null;
    }
}
