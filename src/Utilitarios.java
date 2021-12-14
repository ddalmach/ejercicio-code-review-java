// Una clse utilitaria, debe ser declarada como final y debe tener un constructor privado.
// Todos sus metodos deben ser estaticos.
// Todo el contenido de la clase debe estar en ingles y no plural.
public class Utilitarios {
    
    // El nombres del parametro debe ser desciptivo.
    public int average(int params[]) {
        // Los nombres de la variables deben ser mas descriptivos.
        int avg = 0;
        for (int i = 0; i < params.length; i++) {
            avg = avg + params[i];
        }
        return avg / params.length;
    }

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

    // El valor PI debe estar en una clase Constants.
    // El nombre del metodo debe ser calcularAreaCirculo.
    // Los nombres de los parametros debe ser desciptivos. Ejm: radio.
    public double areaCirculo(double r) {
        final double PI = 22 / 7;
        return PI * (r * r);
    }

    // El nombre del metodo debe ser calcularAreaTriangulo.
    // Los nombres de los parametros debe ser desciptivos. Ejm: base, altura.
    // No es necesario crear una variable, se bede retornar el reultado directamente.
    //b = base ; h= altura
    public double areaTriangulo(double b, double h) {
        double resultado = 0d;
        resultado = (b * h) / 2;
        return resultado;
    }

    // El nombre del metodo debe ser calcularIva.
    // El nombre del parametro debe tener un nombre descirptivo. Ejm: base
    // El valor IVA debe estar en una clase Constants.
    // No es necesario crear una variable, se bede retornar el reultado directamente.
    public double calculoIva(double valor) {
        final int IVA = 12;
        return (valor * IVA) / 100;
    }


}
