//TODO si es una clase utilitaria se podria definir los metodos como staticos para no instaciar la clase
public class Utilitarios {
    public int average(int params[]) {
        int avg = 0;
        //TODO se pudiese sustituir por una expresion lamda
        for (int i = 0; i < params.length; i++) {
            avg = avg + params[i];
        }
        return avg / params.length;
    }

    public double factorial(int numero) {
        double resultado = 1;
        //TODO factorial por lo general es una funcion de naturaleza recursiva
        if (numero == 1 || numero == 0) {
            return resultado;
        }
        for (int i = 2; i <= numero; i++) {
            resultado = resultado * i;

        }
        return resultado;
    }

    public double areaCirculo(double r) {
        final double PI = 22 / 7;
        return PI * (r * r);
    }

    //b = base ; h= altura
    public double areaTriangulo(double b, double h) {
        double resultado = 0d;
        resultado = (b * h) / 2;
        return resultado;
    }

    public double calculoIva(double valor) {
        //TODO definir IVA como una constante fuera del scope de la funcion
        final int IVA = 12;
        return (valor * IVA) / 100;
    }


}
