/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.andres_marulanda.ejercicios_semana_1;

import java.util.Scanner;
/**
 *
 * @author Andres Marulanda
 */
public class Sentencias_Control_Flujo {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        float nota;
        float nota_final;
        byte notas;
        byte num;
        byte num_mes;
        byte num_dias = 0;
        int base;
        int potencia;
        
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese la nota (separada por ,): ");
        nota = leer.nextFloat();
        
        //Sentencia if para mostrar el resultado de un examen
        if (nota >= 3.5){
            System.out.println("Aprobado");
        }else{
            System.out.println("No aprobado");
        }
        
        System.out.println("\nIngrese un número entre 1 y 5: ");
        num = leer.nextByte();
        
        //Sentencia if else if para imprimir un mensaje según el número ingresado
        if (num == 1){
            System.out.println("El número es 1");
        }else if (num == 2){
            System.out.println("El número es 2");
        }else if (num == 3){
            System.out.println("El número es 3");
        }else if (num == 4){
            System.out.println("El número es 4");
        }else if (num == 5){
            System.out.println("El número es 5");
        }else{
            System.out.println("Número erroneo");
        }
        
        //Sentencia case para determinar el número de dias de un mes
        System.out.println("\nIngrese el número del mes: ");
        num_mes = leer.nextByte();
        
        switch (num_mes) {
            case 2:
                num_dias = 28;
                break;
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                num_dias = 31;
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                num_dias = 30;
                break;
            default:
                System.out.println("Número invalido");
                break;
        }
        System.out.println(" El mes número "+num_mes+" tiene "+num_dias+" Días. ");
        
        //Sentencia while para calcular la nota definitiva de una materia
        System.out.println("\nIngrese el número de retos: ");
        notas = leer.nextByte();
        
        int i = 0;
        float acumulado = 0f;
        while (i < notas){
            System.out.println("\nIngrese la nota obtenida: ");
            acumulado += leer.nextFloat();
            i += 1;
        }
        nota_final = acumulado / notas;
        System.out.println("La nota final es: "+ nota_final);
       
        //Sentencia for para controlar y calcular el valor de una potencia
        System.out.println("\nIngresa la base: ");
        base = leer.nextInt();
        
        System.out.println("Ingresa la potencia: ");
	potencia = leer.nextInt();
        
        int resultado = 1;
	if (potencia < 0 || potencia > 10){
	    System.out.println("Potencia no valida");
        }else{
            for (i=0; i<potencia; i++){
	    resultado *= base;
            }
            System.out.println("El resultado es: " + resultado);
        }
        
        //Sentencia for para generar la tabla de multiplicar de un número
        System.out.println("\nIngrese el número: ");
        base = leer.nextInt();
        
        for(i =1; i<11; i++){
            System.out.println(base+" * "+i+" = "+ (base*i));
        }
    }
        
}
