public class Utilitarios {

    // se debe utilizar un constructor para iniciar las variables de trabajo


    // try cath para la division no hay 
    public int average(int params[]) {
        int avg = 0;
        for (int i = 0; i < params.length; i++) {
            avg = avg + params[i];
        }
        return avg / params.length;
    }

    // un solo resultado debe obtener
    // el resultado a la primera vez es 1    
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

    //try catch no hay division
    //hay que utilizar una constantes para el resultado de la variavle PI
    public double areaCirculo(double r) {
        final double PI = 22 / 7;
        return PI * (r * r);
    }

    //b = base ; h= altura
    // se debe poner un try catch
    // resultado directo en el return
    public double areaTriangulo(double b, double h) {
        double resultado = 0d;
        resultado = (b * h) / 2;
        return resultado;
    }


    // la operacion debe realizarse director en el return y util try catch
    public double calculoIva(double valor) {
        final int IVA = 12;
        return (valor * IVA) / 100;
    }


}
