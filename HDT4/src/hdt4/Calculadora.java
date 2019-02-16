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
public class Calculadora implements iCalculadora
{
    public static boolean instanciado = false;
    
    public static Calculadora Instance()
    {
        if(! instanciado)
        {
            instanciado = true;
            return new Calculadora();
        }
        else
        {
            return null;
        }
    }
    
    /* (non-Javadoc)
     * @see iCalculadora#sumar(double, double)
     */
    public double sumar(double n1, double n2){
        double resultado;
        resultado = n1 + n2;
        return resultado;
    }
    
    /* (non-Javadoc)
     * @see iCalculadora#restar(double, double)
     */
    public double restar(double n1, double n2){
        double resultado;
        resultado = n1 - n2;
        return resultado;
    }
    
    /* (non-Javadoc)
     * @see iCalculadora#multiplicar(double, double)
     */
    public double multiplicar(double n1, double n2){
        double resultado;
        resultado = n1 * n2;
        return resultado;
    }
    
    /* (non-Javadoc)
     * @see iCalculadora#dividir(double, double)
     */
    public double dividir(double n1, double n2){
        double resultado;
        resultado = n1 / n2;
        return resultado;
    }
}
