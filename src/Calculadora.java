/**
 * Clase que representa una calculadora con las 4 operaciones básicas de dos números
 */

//TODO class name should be in english. ex: Calculator.
public class Calculadora {

    //TODO suma should be in English. ex: add
    // All operation should be in double NOT int.
    // method should be static.
    public int suma(int num1, int num2) {
        //metodo para crear una suma
        //TODO send return num1 + num2.
        int resul = 0;
        resul = num1 + num2;
        return resul;
    }

    //TODO suma should be in English. ex: subtraction
    // All operation should be in double NOT int.
    // method should be static.
    public int resta(int num1, int num2) {
        //metodo para crear la resta
        //TODO send return num1 - num2.
        int resul = 0;
        resul = num1 - num2;
        return resul;
    }

    //TODO suma should be in English. ex: multiplication
    // All operation should be in double NOT int.
    // method should be static.
    public int multipli(int num1, int num2) {
        //metodo para crear la multiplicacion
        //TODO send return num1 * num2.
        int resul = 0;
        resul = num1 * num2;
        return resul;
    }

    //TODO suma should be in English. ex: division
    // All operation should be in double NOT int.
    // method should be static.
    public double divi(int num1, int num2) {
        //metodo para la division
        //double es para un valor con punto decimal
        //TODO send return num1 / num2.
        double resul = 0;
        //TODO inputs should be double.
        resul = num1 / num2;

        //TODO create exception when num2 is 0.
        // ArithmeticException
        return resul;
    }


}
