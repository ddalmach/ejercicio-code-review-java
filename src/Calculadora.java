/**
 * Clase que representa una calculadora con las 4 operaciones básicas de dos números
 */
public class Calculadora {

    //TODO: Request debe recibir Wrapper y no primitivos
    //TODO: Response debe ser  Wrapper y no primitivos
    public int suma(int num1, int num2) {
        //metodo para crear una suma

        //TODO: Se debe realizar validaciones en el caso que uno de los operadores sea null. Propagar excepciones
        //TODO: no se requiere la variable resul.
        int resul = 0;
        resul = num1 + num2;
        return resul;
    }

    //TODO: Request debe recibir Wrapper y no primitivos
    //TODO: Response debe ser  Wrapper y no primitivos
    public int resta(int num1, int num2) {

        //TODO: Se debe realizar validaciones en el caso que uno de los operadores sea null. Propagar excepciones
        //TODO: no se requiere la variable resul.
        //metodo para crear la resta
        int resul = 0;
        resul = num1 - num2;
        return resul;
    }

    //TODO: Request debe recibir Wrapper y no primitivos
    //TODO: Response debe ser  Wrapper y no primitivos
    public int multipli(int num1, int num2) {
        //TODO: Se debe realizar validaciones en el caso que uno de los operadores sea null. Propagar excepciones
        //TODO: no se requiere la variable resul.

        //metodo para crear la multiplicacion
        int resul = 0;
        resul = num1 * num2;
        return resul;
    }

    //TODO: Request debe recibir Wrapper y no primitivos
    //TODO: Response debe ser  Wrapper y no primitivos
    public double divi(int num1, int num2) {
        //TODO: Se debe realizar validaciones en el caso que uno de los operadores sea null. Propagar excepciones
        //TODO: Se debe realizar la validacion de divisor igual a cero. Propagar excepciones
        //TODO: no se requiere la variable resul.

        //metodo para la division
        //double es para un valor con punto decimal
        double resul = 0;
        resul = num1 / num2;
        return resul;
    }


}
