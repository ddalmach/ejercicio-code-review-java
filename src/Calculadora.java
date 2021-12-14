/**
 * Clase que representa una calculadora con las 4 operaciones básicas de dos números
 */
public class Calculadora {

    // los métodos deberían ser privados
    public int suma(int num1, int num2) {
        //comentario innecesario o en su defecto no descriptivo (una suma no se crea, se calcula)
        //metodo para crear una suma
        
        //no hace falta inicializar una variable
        int resul = 0;
        //basta con retornar el resultado
        resul = num1 + num2;
        return resul;
    }

    public int resta(int num1, int num2) {
        //comentario innecesario o en su defecto no descriptivo (una resta no se crea, se calcula)
        //metodo para crear la resta
        
        //no hace falta inicializar una variable
        int resul = 0;
        //basta con retornar el resultado
        resul = num1 - num2;
        return resul;
    }
//nombre del método (debería ser multiplicar)
    public int multipli(int num1, int num2) {
        //comentario innecesario o en su defecto no descriptivo (una multiplicación no se crea, se calcula)
        //metodo para crear la multiplicacion
        
        //no hace falta inicializar una variable
        int resul = 0;
        //basta con retornar el resultado
        resul = num1 * num2;
        return resul;
    }
//nombre del método (debería ser dividir)
    public double divi(int num1, int num2) {
        //comentario innecesario o en su defecto no descriptivo (una división no se crea, se calcula)
        //metodo para la division
        
        //comentario improsedente
        //double es para un valor con punto decimal
        
        //no hace falta inicializar una variable, además se debería inicializar con el punto decimal
        double resul = 0;
        //basta con retornar el resultado
        //Si num2 es 0 va a dar error, por favor validar
        resul = num1 / num2;
        return resul;
    }


}
