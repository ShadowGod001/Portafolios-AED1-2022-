package ucu.edu.uy.ut4_pd4;

import java.util.ArrayList;

public class Sumalineal {

    public Sumalineal(){}

    int calcularSumaLineal (int[] a, int n) {
        if (n == 1) {
            n= a[0];
        }else{
            n=  calcularSumaLineal(a, n-1) + a[n-1];
        }
        return n;
    }
}
