/**
 * La clase debe usar herencia. 
 * La clase principal debe tener dos atributos numero1 - numero2 y un metodo calcular.
 * Las clases hijas (Suma, Resta, Multiplicacion, Division) implementan el metodo calcular.
 * Clase que representa una calculadora con las 4 operaciones básicas de dos números
 */
public class Calculadora {

    // El nombre del metodo debe ser sumar y no es necesario crear una variable.
    // Los comentarios de metodos deben estar en la parte superior.
    public int suma(int num1, int num2) {
        //metodo para crear una suma
        int resul = 0;
        resul = num1 + num2;
        return resul;
    }

    // El nombre del metodo debe ser restar y no es necesario crear una variable.
    // Los comentarios de metodos deben estar en la parte superior.
    public int resta(int num1, int num2) {
        //metodo para crear la resta
        int resul = 0;
        resul = num1 - num2;
        return resul;
    }

    // El nombre del metodo debe ser multiplicar y no es necesario crear una variable.
    // Los comentarios de metodos deben estar en la parte superior.
    public int multipli(int num1, int num2) {
        //metodo para crear la multiplicacion
        int resul = 0;
        resul = num1 * num2;
        return resul;
    }

    // El nombre del metodo debe ser dividir.
    // Los comentarios de metodos deben estar en la parte superior.
    // Se debe validar el numero2 para que que sea > 0
    public double divi(int num1, int num2) {
        //metodo para la division
        //double es para un valor con punto decimal
        double resul = 0;
        resul = num1 / num2;
        return resul;
    }


}
