package ucu.edu.uy.tda;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author nnavarro
 */
public class esABBTest
{

    private static TArbolBB arbol;
    private static TElementoAB nodo1;
    private static TElementoAB nodo2; 
    private static TElementoAB nodo3;
    private static TElementoAB nodo4;
    private static TElementoAB nodo5;
    private static TElementoAB nodo6;
    private static TElementoAB nodo7;
    private static TElementoAB nodo8; 
    public esABBTest()
    {
    }

    @BeforeAll
    public static void setUpClass()
    {
        arbol = new TArbolBB<>();
        nodo1 = new TElementoAB(1, null);
        nodo2 = new TElementoAB(2, null);
        nodo3 = new TElementoAB(3, null);
        nodo4 = new TElementoAB(4, null);
        nodo5 = new TElementoAB(5, null);
        nodo6 = new TElementoAB(6, null);
        nodo7 = new TElementoAB(7, null);
        nodo8 = new TElementoAB(8, null);
        

    }

    /**
     * 
     */
    @Test
    public void esABBTestVacio()
    {   
        setUpClass();
        assert arbol.esABB() == true;
       
    }

    @Test
    public void obtenerNivelTestDerecha()
    {
        setUpClass();
        arbol.insertar(nodo1);
        arbol.insertar(nodo2);
        arbol.insertar(nodo3);
        arbol.insertar(nodo4);
        arbol.insertar(nodo5);
        arbol.insertar(nodo6);
        arbol.insertar(nodo7);
        arbol.insertar(nodo8);
        assert arbol.esABB() == true;
        
    }

    @Test
    public void obtenerNivelTestIzquierda()
    {
        setUpClass();
        arbol.insertar(nodo8);
        arbol.insertar(nodo7);
        arbol.insertar(nodo6);
        arbol.insertar(nodo5);
        arbol.insertar(nodo4);
        arbol.insertar(nodo3);
        arbol.insertar(nodo2);
        arbol.insertar(nodo1);
        
        assert arbol.esABB() == true;
        
    }

    @Test
    public void obtenerNivelTestBalanceado()
    {
        setUpClass();
        
        arbol.insertar(nodo4);
        arbol.insertar(nodo2);
        arbol.insertar(nodo3);
        arbol.insertar(nodo1);
        arbol.insertar(nodo6);
        arbol.insertar(nodo5);
        arbol.insertar(nodo7);
        
        assert arbol.esABB() == true;
        
    }

}