package ucu.edu.uy.ut4_pd4;

import ucu.edu.uy.tda.TArbolBB;
import ucu.edu.uy.tda.TElementoAB;
import ucu.edu.uy.util.ManejadorArchivosGenerico;
import ucu.edu.uy.tda.INodo;
import ucu.edu.uy.tda.Nodo;

public class Main {

    /**
     * @param args
     */
    public static void main(String[] args) {

       factorial factorial = new factorial();
       System.out.println(factorial.calcularFactorial(4));
       System.out.println(factorial.calcularFactorial(5));
       System.out.println(factorial.calcularFactorial(0));

       Sumalineal sumalineal = new Sumalineal();
       int[] a = {4,3,6,2,5};
       System.out.println(sumalineal.calcularSumaLineal(a, 5));
    }
}
