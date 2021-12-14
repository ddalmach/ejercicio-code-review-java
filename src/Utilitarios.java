public class Utilitarios {
    public int average(int params[]) {
        // TODO se debe validar primero que params sea distinto de vacio para poder hacer alguna logica
        int avg = 0;
        for (int i = 0; i < params.length; i++) {
            avg = avg + params[i];
        }
        return avg / params.length;
    }

    public double factorial(int numero) {
        // TODO se podria poner una condicion inicial de numero > 0
        double resultado = 1;
        if (numero == 1 || numero == 0) {
            return resultado;
        }
        for (int i = 2; i <= numero; i++) {
            resultado = resultado * i;

        }
        return resultado;
    }

    public double areaCirculo(double r) {
        // TODO el valor de PI no aporta con nada al metodo
        final double PI = 22 / 7;
        return PI * (r * r);
    }

    //b = base ; h= altura
    public double areaTriangulo(double b, double h) {
        // TODO la variable resultado es innecesaria se podría retornar directamente
        double resultado = 0d;
        resultado = (b * h) / 2;
        return resultado;
    }

    public double calculoIva(double valor) {
        // TODO El valor del IVA debería ser parametrizado fuera del metodo debido a que algun momento podría cambiar
        final int IVA = 12;
        return (valor * IVA) / 100;
    }


}
