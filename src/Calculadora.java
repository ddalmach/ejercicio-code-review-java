/**
 * Clase que representa una calculadora con las 4 operaciones básicas de dos números
 */
public class Calculadora {

    public int suma(int num1, int num2) {
        return num1 + num2;
    }

    public int resta(int num1, int num2) {
        return num1 - num2;
    }

    public int multipli(int num1, int num2) {
       return num1 * num2;
    }

    public double divi(int num1, int num2) {
        double resul = 0;
        if(num2 != 0){
            resul = num1 / num2;
        }        
        return resul;
    }


}
