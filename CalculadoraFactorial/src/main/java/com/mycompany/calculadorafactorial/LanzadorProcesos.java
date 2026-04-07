/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.calculadorafactorial;
import java.lang.ProcessBuilder;
import java.io.IOException;
/**
 * 
 *
 * @author pekit
 */
public class LanzadorProcesos {
    public static void main(String[] args){
        ProcessBuilder p1 = new ProcessBuilder("java", "-cp", "target/classes",
            "com.mycompany.calculadorafactorial.CalculadoraFactorial","5");
        ProcessBuilder p2 = new ProcessBuilder("java", "-cp", "target/classes",
            "com.mycompany.calculadorafactorial.CalculadoraFactorial","6");
        ProcessBuilder p3 = new ProcessBuilder("java", "-cp", "target/classes",
            "com.mycompany.calculadorafactorial.CalculadoraFactorial","7");
        
        p1.inheritIO();
        p2.inheritIO();
        p3.inheritIO();
        
        try{
            p1.start();
            p2.start();
            p3.start();
            
        } catch(IOException e){
            e.printStackTrace();
        }

        
    }
}
