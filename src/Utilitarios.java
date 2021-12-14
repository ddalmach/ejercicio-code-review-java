public class Utilitarios {
    //  int[] params
    //es necesario especificar el nombre completo del método y las variables, no abreviaciones 
    //que solo la persona que programa entiende

    public int average(int params[]) {
        int avg = 0;
        for (int i = 0; i < params.length; i++) {
            avg = avg + params[i];
        }
        return avg / params.length;
    }

    //podríamos hacer el metodo de factorial de la siguiente manera:
    //public int factorial (double numero) {
    //  if (numero==0)
    //    return 1;
    //  else
    //    return numero * factorial(numero-1);
    //}

    public double factorial(int numero) {
        double resultado = 1;
        if (numero == 1 || numero == 0) {
            return resultado;
        }
        for (int i = 2; i <= numero; i++) {
            resultado = resultado * i;

        }
        return resultado;
    }


    //importar una librería de Math y usar la variable indicada para PI
    public double areaCirculo(double r) {
        final double PI = 22 / 7;
        return PI * (r * r);
    }

    //b = base ; h= altura
    public double areaTriangulo(double b, double h) {
        //borrar la d
        double resultado = 0d;
        resultado = (b * h) / 2;
        return resultado;
    }

    public double calculoIva(double valor) {
        //no es necesario crear la variable IVA
        //return valor * 0.12
        final int IVA = 12;
        return (valor * IVA) / 100;
    }


}
