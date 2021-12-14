
//TODO class should be in English: Utils
public class Utilitarios {
    //TODO all methods should be static.

    //TODO return and input should be double.
    //  params[] is wrong should be double and change name params to args, double[] args
    public int average(int params[]) {
        //TODO it is better using stream.
        // example: return Arrays.stream(args).sum()/array.length;
        // use a exception when array is empty.
        int avg = 0;
        for (int i = 0; i < params.length; i++) {
            avg = avg + params[i];
        }
        return avg / params.length;
    }

    //TODO change names to English factorial (int number)
    public double factorial(int numero) {
        //TODO change names to English.
        //  Factorial can use recursion.
        double resultado = 1;
        if (numero == 1 || numero == 0) {
            return resultado;
        }
        for (int i = 2; i <= numero; i++) {
            resultado = resultado * i;

        }
        return resultado;
    }

    //TODO change PI= 22/7 to a static constant and set the real value, no the /.
    // or use Math.PI
    public double areaCirculo(double r) {
        final double PI = 22 / 7;
        return PI * (r * r);
    }

    //b = base ; h= altura
    //TODO return value instead of initialize in 0d. Delete resultado.
    //  return (b * h) / 2;
    public double areaTriangulo(double b, double h) {
        double resultado = 0d;
        resultado = (b * h) / 2;
        return resultado;
    }


    //TODO change IVA= 12 to a static constant.
    public double calculoIva(double valor) {
        final int IVA = 12;
        return (valor * IVA) / 100;
    }

}
