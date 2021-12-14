/**
 * Clase que representa una calculadora con las 4 operaciones básicas de dos números
 */
// Se puede usar herencia
public class Calculadora {
        // tipos de dattos de ntrada y salida double
    public int suma(int num1, int num2) {
        //metodo para crear una suma
        int resul = 0;
        resul = num1 + num2;
        return resul;
    }
// tipos de dattos de ntrada y salida double
    public int resta(int num1, int num2) {
        //metodo para crear la resta
        int resul = 0;
        resul = num1 - num2;
        return resul;
    }
// tipos de dattos de ntrada y salida double
    public int multipli(int num1, int num2) {
        //metodo para crear la multiplicacion
        int resul = 0;
        resul = num1 * num2;
        return resul;
    }
// tipos de dattos de ntrada y salida double
    // try catch para capturar error divison para cero
    public double divi(int num1, int num2) {
        //metodo para la division
        //double es para un valor con punto decimal
        double resul = 0;
        resul = num1 / num2;
        return resul;
    }


}
