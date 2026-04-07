/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.calculadorafactorial;

/**
 *
 * @author pekit
 */
public class CalculadoraFactorial {
    
    public static long factorial(int n){
        long resultado = 1; 
        for(int i = 1; i <=n ; i++){
            resultado *= i;
        }
        return resultado;
   }

    public static void main(String[] args) {
        if(args.length == 0|| args[0].isEmpty()){
            System.out.println("Error: debes introducir un número");
            return;
        }
        int numero = Integer.parseInt(args[0]);
        long resultado = factorial(numero);
        System.out.println("Factorial de "+numero+" = "+ resultado);
    }
}
