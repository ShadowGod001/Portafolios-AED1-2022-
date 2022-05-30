/*
 * NO LICENCE 
 * Author: Ing. Nicolás Navarro Gutérrez
 */
package ucu.edu.uy.tda;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author nnavarro
 */
public class TDATest
{

    private static TArbolBB arbol;
    public TDATest()
    {
    }

    @BeforeAll
    public static void setUpClass()
    {
        arbol = new TArbolBB<>();
        TElementoAB nodo1 = new TElementoAB(1, null);
        TElementoAB nodo2 = new TElementoAB(2, null);
        TElementoAB nodo3 = new TElementoAB(3, null);
        TElementoAB nodo4 = new TElementoAB(4, null);
        TElementoAB nodo5 = new TElementoAB(5, null);
        TElementoAB nodo6 = new TElementoAB(6, null);
        TElementoAB nodo7 = new TElementoAB(7, null);
        TElementoAB nodo8 = new TElementoAB(8, null);
        arbol.insertar(nodo1);
        arbol.insertar(nodo2);
        arbol.insertar(nodo3);
        arbol.insertar(nodo4);
        arbol.insertar(nodo5);
        arbol.insertar(nodo6);
        arbol.insertar(nodo7);
        arbol.insertar(nodo8);

    }

    /**
     * 
     */
    @Test
    public void obtenerAlturaTest()
    {   
        setUpClass();
        int altura = arbol.obtenerAltura();
        int resultadoEsperado = 3;
        assert altura == resultadoEsperado;
        
       
    }

    @Test
    public void test2()
    {
       
    }

}
