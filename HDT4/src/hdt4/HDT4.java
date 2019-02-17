
package hdt4;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author Estuardo
 * @author Gerardo
 */
public class HDT4 
{
    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws IOException 
    {   
        Scanner scan = new Scanner(System.in);
        System.out.println("Se realizara el calculo de una expresion postfix");
        System.out.println("Usted decidira que tipo de implementacion utilizar");
        
        int x = 0;
        String tipo = null;
        
        try
        {
            while(x >= 4 || x <= 0)
            {
                System.out.println("");
                System.out.println("PRESIONA 1 utilizar la implementacion de Vectores");
                System.out.println("PRESIONA 2 utilizar la implementacion de ArrayLists");
                System.out.println("PRESIONA 3 utilizar la implementacion de Listas");
                System.out.println("");
                x = scan.nextInt();
            }
        } catch(InputMismatchException e){
            System.out.println("Ingrese solamente numeros por favor");
            System.exit(0);
        }
        
        switch(x)
        {
            case 1:
                tipo = "VECTOR";
                break;
            case 2:
                tipo = "ARRAYLIST";
                break;
            case 3:
                int y = 0;
                
                System.out.println("Elija la implementacion de listas que desea");
                try{
                    while(y >= 4 || y <= 0)
                    {
                        System.out.println("");
                        System.out.println("PRESIONA 1 utilizar la implementacion de Listas Simples");
                        System.out.println("PRESIONA 2 utilizar la implementacion de Listas Dobles");
                        System.out.println("PRESIONA 3 utilizar la implementacion de Listas Circulares");
                        System.out.println("");
                        y = scan.nextInt();
                    }
                } catch(InputMismatchException e){
                    System.out.println("Ingrese solamente numeros por favor");
                    System.out.close();
                } 
                
                switch(y)
                {
                    case 1:
                        tipo = "LINKEDLIST";
                        break;
                    case 2: 
                        tipo = "DOUBLELINKEDLIST";
                        break;
                    case 3:
                        tipo = "CIRCULARLIST";
                        break;
                }
                break;
        }
        
        iCalculadora calculadora = Calculadora.Instance();
        StackFactory stackFactory = new StackFactory();
        iStack pila = stackFactory.getStack(tipo);
        
        ArrayList<String> array = new ArrayList<>();
        
        Scanner read = new Scanner(new File("datos.txt"));
        read.useDelimiter(" ");
        String data;
        
        while(read.hasNext())
        {
            data = read.next();
            array.add(data);
        }
        
        for(int i = 0; i < array.size(); i++)
        {
            pila.push(array.get(array.size()-i-1));
        }
        
        try
        {
            while(!pila.empty())
            {
                double a, b;
                double c = 0;
                String d, e;
                a = Double.parseDouble(pila.pop().toString());
                b = Double.parseDouble(pila.pop().toString());
                d = pila.pop().toString();
                
                switch (d) {
                    case "+":
                        c = calculadora.sumar(a, b);
                        break;
                    case "-":
                        c = calculadora.restar(a, b);
                        break;
                    case "*":
                        c = calculadora.multiplicar(a, b);
                        break;
                    case "/":
                        c = calculadora.dividir(a, b);
                        break;
                    default:
                        throw new IllegalArgumentException();
                }
            
                e = String.valueOf(c);
            
                if(pila.size() > 0)
                {
                    pila.push(e);
                }
                
                if(pila.size() == 0)
                {
                    System.out.println("");
                    System.out.println("El resultado final de las operaciones del archivo de texto es: " + e);
                    System.out.println("");
                }
            }
        }
        catch(NumberFormatException e){
            System.out.println("");
            System.out.println("Hay dos simbolos juntos o dos numeros juntos (ademas de los primeros dos) en el archivo de texto ingresado");
            System.out.println("Por favor corregir para que el programa pueda realizar los calculos deseados");
            System.out.println("");
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("");
            System.out.println("El archivo de texto utilizado para el programa no termina en un simbolo de operacion");
            System.out.println("Por favor corregir para que el programa pueda realizar los calculos deseados");
            System.out.println("");
        }
        catch(IllegalArgumentException e)
        {
            System.out.println("");
            System.out.println("El archivo de texto incluye simbolos que no corresponden a operaciones matematicas");
            System.out.println("Por favor corregir para que el programa pueda realizar los calculos deseados");
            System.out.println("");
        }
    }

    
}
