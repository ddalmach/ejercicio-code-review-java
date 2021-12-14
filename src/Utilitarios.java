import java.util.stream.LongStream;

public class Utilitarios {

    public int promedio(int... params) {
        int avg = 0;
        for (int param : params) {
            avg = avg + param;
        }
        return avg / params.length;
    }

    public double factorial(int numero) {
        return LongStream.rangeClosed(1, numero).reduce(1, (long x, long y) -> x * y);
    }

    public double areaCirculo(double r) {
        final double PI = 22.0 / 7.0;
        return PI * (r * r);
    }

    //b = base ; h= altura
    public double areaTriangulo(double b, double h) {
        double resultado = 0d;
        resultado = (b * h) / 2;
        return resultado;
    }

    public double calculoIva(double valor) {
        final int IVA = 12;
        return (valor * IVA) / 100;
    }


}
