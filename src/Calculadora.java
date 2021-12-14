/**
 * Clase que representa una calculadora con las 4 operaciones básicas de dos números
 */
public class Calculadora {

    public int suma(int num1, int num2) {
        //TODO se deberia retornar directamente num1 + num2
        //metodo para crear una suma
        int resul = 0;
        resul = num1 + num2;
        return resul;
    }

    public int resta(int num1, int num2) {
        //TODO se deberia retornar directamente num1 - num2
        //metodo para crear la resta
        int resul = 0;
        resul = num1 - num2;
        return resul;
    }

    public int multipli(int num1, int num2) {
        //TODO se deberia retornar directamente num1 * num2
        //metodo para crear la multiplicacion
        int resul = 0;
        resul = num1 * num2;
        return resul;
    }

    public double divi(int num1, int num2) {
        // TODO se debería primero validar el parámetro num2
        // TODO debería estar sujeto a una excepcion
        //metodo para la division
        //double es para un valor con punto decimal
        double resul = 0;
        resul = num1 / num2;
        return resul;
    }


}
