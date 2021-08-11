/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.andres_marulanda.ejercicios_semana_1;

/**
 *
 * @author Andres Marulanda
 */
public class Operadores_Basicos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Operadores aritméticos
        byte a = 20, b = 10, c = 0;
        byte d = 20, e = 40, f = 30;
        String x = "Muchas", y = "gracias";
        String text_1 = "higo", text_2 = "Higo", text_3 = "HIGO";   
        boolean condition = true;
        
        System.out.println("a + b = "+ (a+b));
        System.out.println("a - b = "+ (a-b));
        
        System.out.println("x concatenado con y = "+(x+" "+y));
        
        System.out.println("c * d = "+ (c*d));
        System.out.println("e / d = "+ (e/d));
        System.out.println("e % f = "+ (e%f));
        
        //Operadores unarios
        System.out.println("variable condition negada = "+ !condition);
        System.out.println("variable b negada = "+ -b);
        System.out.println("variable a postincrementada = "+ a++);//primero imprime y luego incrementa la variable
        System.out.println("variable a preincrementada = "+ ++a);
        System.out.println("variable b postdecrementada ="+ b--);//primero imprime y luego decrementa la variable
        System.out.println("variable b predecrementada = "+ --b);
        
        //Operadores relacionales
        System.out.println("c == d: "+ (c==d));
        System.out.println("c != d: "+ (c!=d));
        System.out.println("c < d: "+ (c<d));
        System.out.println("c > d: "+ (c>d));
        System.out.println("c <= d: "+ (c<=d));
        System.out.println("c >= d: "+ (c>=d));
        
        //Operadores lógicos
        if ((e > f) && (a > b)){
         System.out.println(e+" mayor que "+f); 
         System.out.println(a+" mayor que "+b);
         }else{
            System.out.println("La condición es falsa");
        }
        
        if ((a >= d) || (c > b)){
         System.out.println(a+" mayor o igual que "+d); 
         System.out.println(b+" mayor que "+c);
         }else{
            System.out.println("La condición es falsa");
        }
       
        /*Comparar cadenas de caracteres
        text_1 = "higo", text_2 = "Higo", text_3 = "HIGO"*/
        System.out.println(text_1.equals(text_2));
        System.out.println(text_1.equalsIgnoreCase(text_3));
        
    }
    
}
