/**
 * Clase que representa una calculadora con las 4 operaciones básicas de dos números
 */
public class Calculadora {

    public int suma(int num1, int num2) {
        //metodo para crear una suma
        //int resul = 0;
        //resul = num1 + num2;
        //return resul;
        return num1 + num2;
    } 
 

    public int resta(int num1, int num2) {
        //metodo para crear la resta
        //int resul = 0;
        //resul = num1 - num2;
        //return resul;
        return num1 - num2; 
    }

    public int multipli(int num1, int num2) {
        //metodo para crear la multiplicacion
        //int resul = 0;
        //resul = num1 * num2;
        //return resul;
        return num1 * num2; 
    }

    public double divi(int num1, int num2) {
        //metodo para la division
        //double es para un valor con punto decimal
        //double resul = 0;
        //resul = num1 / num2;
        //return resul;
        if (num2 == 0) {
            return 0;
        } else {
            return num1 / num2; 
        }
         
    }


}