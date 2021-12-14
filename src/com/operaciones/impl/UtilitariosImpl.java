package com.operaciones.impl;
public class UtilitariosImpl {
  //double para el promedio
    public int average(int params[]) {
        int avg = 0;
        for (int i = 0; i < params.length; i++) {
           // avg = avg + params[i];
            avg+=Integer.valueOf(params[i]);
        }
        return avg / params.length;
    }
    class FactorialFunction2{  
       int fact(int n){    
       if (n == 0)    
         return 1;    
       else    
         return(n * fact(n-1));    
      }   
    public double factorial(int numero) {
      
      int i,fact=1;  
      int number=4;//It is the number to calculate factorial    
      fact = fact(number);   
      
      
//        double resultado = 1;
//        if (numero == 1 || numero == 0) {
//            return resultado;
//        }
//        for (int i = 2; i <= numero; i++) {
//            resultado = resultado * i;
//
//        }
//        return resultado;
      
      
      
      
    }

     //long dependiendo 
    public double areaCirculo(double r) {
      double PI=3.1416;
        //final double PI = 22 / 7;
        
        return PI * (r * r);
    }

    //b = base ; h= altura
    public double areaTriangulo(double b, double h) {
        double resultado = 0d;
        resultado = (b * h) / 2;
        return resultado;
    }

    public double calculoIva(double valor) {
        final int IVA = 12;
        return (valor * IVA) / 100;
    }


}
