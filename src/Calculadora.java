/**
 * Clase que representa una calculadora con las 4 operaciones básicas de dos números
 */
// TODO falta deficion de paquetes.
public class Calculadora {

    public int suma(int num1, int num2) {
        //metodo para crear una suma
        //TODO code smell, variable extra se puede retornar directamente
        int resul = 0;
        resul = num1 + num2;
        return resul;
    }

    public int resta(int num1, int num2) {
        //metodo para crear la resta
        //TODO code smell, variable extra se puede retornar directamente
        int resul = 0;
        resul = num1 - num2;
        return resul;
    }

    public int multipli(int num1, int num2) {
        //metodo para crear la multiplicacion
        //TODO code smell, variable extra se puede retornar directamente
        int resul = 0;
        resul = num1 * num2;
        return resul;
    }

    public double divi(int num1, int num2) {
        //metodo para la division
        //double es para un valor con punto decimal
        //TODO no se valida divicion por cero.
        double resul = 0;
        resul = num1 / num2;
        return resul;
    }


}
