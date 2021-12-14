public class Utilitarios {

    //TODO: Request debe recibir Wrapper y no primitivos
    //TODO: Response debe ser  Wrapper y no primitivos, de tipo Dobule
    public int average(int params[]) {
        //TODO: Validar si el arreglo de int tiene información. Propagar Excepcion
        //TODO: transformar / recibir una lista de Integer
        //TODO: Utilizar programación funcional y el api stream. metodo sumaryStatistics

        int avg = 0;
        for (int i = 0; i < params.length; i++) {
            avg = avg + params[i];
        }
        return avg / params.length;
    }

    //TODO: Request debe recibir Wrapper y no primitivos
    //TODO: Response debe ser  Wrapper y no primitivos, debe ser BigDecimal o BigInt no es necesario decimales (dobule).
    public double factorial(int numero) {
        //TODO: Validar si el request tiene informacion. Propagar Excepcion
        double resultado = 1;
        if (numero == 1 || numero == 0) {
            return resultado;
        }
        //TODO: Utilizar programación funcional y el api stream.
        for (int i = 2; i <= numero; i++) {
            resultado = resultado * i;

        }
        return resultado;
    }

    //TODO: Request debe recibir Wrapper y no primitivos
    //TODO: Response debe ser  Wrapper y no primitivos
    public double areaCirculo(double r) {
        //TODO para obtener el valor de PI puede utlizarse la clase java.lang.Math.PI
        //TODO: Se debe realizar validaciones en el caso que r sea null. Propagar excepciones
        final double PI = 22 / 7;
        return PI * (r * r);
    }

    //TODO: Request debe recibir Wrapper y no primitivos
    //TODO: Response debe ser  Wrapper y no primitivos
    //b = base ; h= altura
    public double areaTriangulo(double b, double h) {
        //TODO: Se debe realizar validaciones en el caso que las entradas sean null. Propagar excepciones
        //TODO: No es necesario la variable resultado
        double resultado = 0d;
        resultado = (b * h) / 2;
        return resultado;
    }

    //TODO: Request debe recibir Wrapper y no primitivos
    //TODO: Response debe ser  Wrapper y no primitivos
    public double calculoIva(double valor) {
        //TODO: Se debe realizar validaciones si valor es null. Propagar excepciones
        //TODO: El valor del IVA debe ser 0.12, para no realizar dos operaciones
        final int IVA = 12;
        return (valor * IVA) / 100;
    }


}
