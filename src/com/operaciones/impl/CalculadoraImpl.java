package com.operaciones.impl;
import com.operaciones.Calculadora;
/**
 * Clase que representa una calculadora con las 4 operaciones básicas de dos números
 */
//Separar clases es importante para evitar el bajo acoplamiento
public class CalculadoraImpl implements Calculadora{

    public int suma(int num1, int num2) {
        //metodo para crear una suma
//        int resul = 0;
//        resul = num1 + num2;
        return num1 + num2;
    }

    public int resta(int num1, int num2) {
        //metodo para crear la resta
//        int resul = 0;
//        resul = num1 - num2;        
//        return resul;
        return num1 - num2;
    }

    public int multipli(int num1, int num2) {
        //metodo para crear la multiplicacion
//        int resul = 0;
//        resul = num1 * num2;
//        return resul;
      return num1 * num2;
    }

    public double divi(int num1, int num2) {
        //metodo para la division
        //double es para un valor con punto decimal
      //Manejar la division para 0 para evitar errores de execusion
      if (num2==0) {
        return 0;
      }
//        double resul = 0;          
//        resul = num1 / num2;
//        return resul;
        return num1 / num2;
    }


}
