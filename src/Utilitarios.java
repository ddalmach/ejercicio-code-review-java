public class Utilitarios {
    public int average(int params[]) {
        int avg = 0;
        for (int i = 0; i < params.length; i++) {
            //TODO usar sobrecarga +=
            avg = avg + params[i];
        }
        //TODO divicion por cero.
        return avg / params.length;
    }

    public double factorial(int numero) {
        double resultado = 1;
        if (numero == 1 || numero == 0) {
            return resultado;
        }
        for (int i = 2; i <= numero; i++) {
            //TODO usar sobrecarga  resultado *= i
            resultado = resultado * i;

        }
        return resultado;
    }

    public double areaCirculo(double r) {
        //TODO valor constante, separar declaracion en contate estatica
        final double PI = 22 / 7;
        return PI * (r * r);
    }

    //b = base ; h= altura
    public double areaTriangulo(double b, double h) {
        //TODO vairable extra, se puede retornar directamente el resultado.
        double resultado = 0d;
        resultado = (b * h) / 2;
        return resultado;
    }

    public double calculoIva(double valor) {
        //TODO valor contante, separar en variable estatica
        final int IVA = 12;
        //TODO se recomienda formula  iva * valor, donde el valor del iva sea una variable constante = 12/100
        return (valor * IVA) / 100;
    }


}
