public class Utilitarios {
    
    public int obtenerPromedio(int params[]) {
        int avg = 0;
        for (int i = 0; i < params.length; i++) {
            avg = avg + params[i];
        }
        return avg / params.length;
    }

    public double obtenerFactorial(int numero) {
        double resultado = 1;
        if (numero == 1 || numero == 0) {
            return resultado;
        }
        for (int i = 2; i <= numero; i++) {
            resultado = resultado * i;
        }
        return resultado;
    }

    public double obtenerAreaCirculo(double rario) {
        final double PI = 22 / 7;
        return PI * (radio * radio);
    }

    public double obtenerAreaTriangulo(double base, double altura) {
        double resultado = 0d;
        resultado = (base * altura) / 2;
        return resultado;
    }

    public double calcularIva(double valor) {
        return (valor * 12) / 100;
    }

}
