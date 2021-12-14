import java.util.stream.LongStream;

public class Utilitarios {

    public int calcularPromedio(int... params) {
        int avg = 0;
        for (int param : params) {
            avg = avg + param;
        }
        return avg / params.length;
    }

    public double calcularFactorial(int numero) {
        return LongStream.rangeClosed(1, numero).reduce(1, (long x, long y) -> x * y);
    }

    public double calcularAreaCirculo(double r) {
        final double PI = 22.0 / 7.0;
        return PI * (r * r);
    }

    public double calcularAriangulo(double base, double altura) {
        return (base * altura) / 2.0;
    }

    public double calcularIva(double valor) {
        final int IVA = 12;
        return (valor * IVA) / 100;
    }


}
