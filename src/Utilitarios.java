public class Utilitarios {

    public int promedio(int... params) {
        int avg = 0;
        for (int param : params) {
            avg = avg + param;
        }
        return avg / params.length;
    }

    public double factorial(int numero) {
        if (numero == 1 || numero == 0) {
            return 1;
        }
        return numero*factorial(numero - 1);
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
