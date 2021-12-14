public class Utilitarios {
    /*
    * todo moce the array designators [] -> int[] params
    *
    * todo use java libraries to perform this type of operations for example
    *  Arrays.stream(params).average();
    * */
    public int average(int params[]) {
        int avg = 0;

        //todo replace with enhanced 'for'
        for (int i = 0; i < params.length; i++) {
            avg = avg + params[i];
        }
        return avg / params.length;
    }

    public double factorial(int numero) {
        double resultado = 1;

        /*
        * todo unnecessary condition -> for init 2 -> pass return resultado
        *
        * todo use java libraries to perfom this type operations for example using lambdas
        *  return LongStream.rangeClosed(1, n).reduce(1, (long x, long y) -> x * y);
        * */
        if (numero == 1 || numero == 0) {
            return resultado;
        }
        for (int i = 2; i <= numero; i++) {
            resultado = resultado * i;

        }
        return resultado;
    }

    public double areaCirculo(double r) {
        /*
        * todo cast one of the operands od this division operation to double -> 22d / 7
        *
        * todo value PI is constant => 3.14..... using -> Math.PI
        *
        * todo // using libraries java -> return Math.PI * Math.pow(r, 2);
        * */
        final double PI = 22 / 7;
        return PI * (r * r);
    }

    //b = base ; h= altura
    public double areaTriangulo(double b, double h) {
        //todo remove this useless assignment to local variable resultado -> return (b * h) / 2;
        double resultado = 0d;
        resultado = (b * h) / 2;
        return resultado;
    }

    /*
    * IVA constante
    * */
    public double calculoIva(double valor) {
        final int IVA = 12;
        return (valor * IVA) / 100;
    }


}
