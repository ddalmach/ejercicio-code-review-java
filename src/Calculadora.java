/**
 * Clase que representa una calculadora con las 4 operaciones básicas de dos números
 */

//TODO mover esta clase a un package
//TODO mejorar la documentacion con javadoc
//TODO agregar manejo de exceptions
public class Calculadora {

    public int suma(int num1, int num2) {
        //metodo para crear una suma
        int resul = 0;
        resul = num1 + num2;
        return resul;
    }

    public int resta(int num1, int num2) {
        //metodo para crear la resta
        //TODO no se esta usando la variable result, se puede retornar directamente
        int resul = 0;
        resul = num1 - num2;
        return resul;
    }

    public int multipli(int num1, int num2) {
        //metodo para crear la multiplicacion
        int resul = 0;
        resul = num1 * num2;
        return resul;
    }

    public double divi(int num1, int num2) {
        //metodo para la division
        //double es para un valor con punto decimal
        //TODO validar division por cero
        double resul = 0;
        resul = num1 / num2;
        return resul;
    }


}
