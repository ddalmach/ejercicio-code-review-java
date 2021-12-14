public class Utilitarios {
    public int average(int params[]) {
        int avg = 0;
        for (int i = 0; i < params.length; i++) {
            avg = avg + params[i];
        }
        //Si la lista es vacía daría una excepción, validar por favor
        return avg / params.length;
    }

    public double factorial(int numero) {
        //se debería inicializar el double con un decimal
        double resultado = 1;
        if (numero == 1 || numero == 0) {
            return resultado;
        }
        for (int i = 2; i <= numero; i++) {
            resultado = resultado * i;

        }
        return resultado;
    }

    //El nombre del parámetro radius o radio sería más entendible
    public double areaCirculo(double r) {
        //De preferencia utiliza la constante de la librería Math "Math.PI"
        final double PI = 22 / 7;
        //De preferencia podrías utilizar Math.sqrt
        return PI * (r * r);
    }

    //Comentario innecesario, los parámetros deberían tener esos nombres
    //b = base ; h= altura
    public double areaTriangulo(double b, double h) {
        //Inicialización Innecesaria
        double resultado = 0d;
        //Se podría directamente retornar el resultado
        resultado = (b * h) / 2;
        return resultado;
    }

    public double calculoIva(double valor) {
        //La constante no se utiliza en ningún otro lugar así que es innecesario que se declare como tal
        final int IVA = 12;
        return (valor * IVA) / 100;
    }


}
