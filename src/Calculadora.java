/**
 * Clase que representa una calculadora con las 4 operaciones básicas de dos números
 */
public class Calculadora {

    //podríamos mandar 3 parámetros en un solo método, 
    //diferenciar con un tercer parámetro el tipo de operación

    //no es necesario declarar las variables con int, ahorraríamos memoria usando byte

    //es necesario especificar el nombre completo del método y las variables, no abreviaciones 
    //que solo la persona que programa entiende



    public int suma(int num1, int num2) {
        //metodo para crear una suma
        int resul = 0;
        resul = num1 + num2;
        return resul;
    }

    public int resta(int num1, int num2) {
        //metodo para crear la resta
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
        double resul = 0;
        resul = num1 / num2;
        return resul;
    }


}
