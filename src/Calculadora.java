/**
 * Clase que representa una calculadora con las 4 operaciones básicas de dos números
 */
public class Calculadora {

    public int sumar(int num1, int num2) {
        return num1 + num2;
    }

    public int restar(int num1, int num2) {
        return num1 - num2;
    }

    public int multiplicar(int num1, int num2) {
        return num1 * num2;
    }

    public double dividir(int num1, int num2) {
        //double es para un valor con punto decimal
        return num1 * 1.0 / num2;
    }


}
