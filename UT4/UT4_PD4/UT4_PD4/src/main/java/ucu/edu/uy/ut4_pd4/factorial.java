package ucu.edu.uy.ut4_pd4;

public class factorial {

    public factorial(){}
    
    int calcularFactorial (int n) {
        if (n==0) {
            n = 1;
        }else{
            n= n*calcularFactorial(n-1);
        }
        return n;
    }
}
