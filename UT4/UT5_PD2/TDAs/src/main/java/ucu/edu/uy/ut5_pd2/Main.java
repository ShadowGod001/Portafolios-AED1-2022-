package ucu.edu.uy.ut5_pd2;
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
        //UT5_PD2
        //EJ 2
        String[] claves = ManejadorArchivosGenerico.leerArchivo("claves3.txt"); //Como no encontré el archivo "claves_PRUEBA.txt" use claves3.txt
        TArbolBB arbol = new TArbolBB<>();
        for(int i=0; i<claves.length; i++){
            try {
            Comparable etiqueta = claves[i];
            TElementoAB nodo = new TElementoAB(etiqueta, null);
            arbol.insertar(nodo);
                
            } catch (Exception e) {
                //TODO: handle exception
            }
        }
      
        String inOrden = arbol.innOrden();
        String preOrden = arbol.postOrden();
        String postOrden = arbol.preOrden();


        String[] Lineas_salida = new String[3]; //Si sale Exception in thread "main" java.lang.NullPointerException: Cannot invoke "String.length()" because "<parameter1>" is null es un error que tiene que ver con la cantidad de elementos del array
        Lineas_salida[0] = "InOrden: " + inOrden;
        Lineas_salida[1] = "PreOrden: "+ preOrden;
        Lineas_salida[2] = "PostOrden: "+ postOrden;
        ManejadorArchivosGenerico archivo = new ManejadorArchivosGenerico();
        archivo.escribirArchivo("salida.txt",Lineas_salida);

        //Ej 3

        String[] claves2 = ManejadorArchivosGenerico.leerArchivo("claves1.txt"); //Como no encontré el archivo "claves.txt" use claves1.txt
        TArbolBB arbol2 = new TArbolBB<>();
        for(int i=0; i<claves2.length; i++){
            try {
            Comparable etiqueta = claves2[i];
            TElementoAB nodo = new TElementoAB(etiqueta, null);
            arbol2.insertar(nodo);
                
            } catch (Exception e) {
                //TODO: handle exception
            }
        }

        System.out.println("Existe la clave 10635?: " + (arbol2.buscar("10635")!=null));
        System.out.println("Existe la clave 4567?: " + (arbol2.buscar("4567")!=null));
        System.out.println("Existe la clave 12?: " + (arbol2.buscar("12")!=null));
        System.out.println("Existe la clave 8978?: " + (arbol2.buscar("8978")!=null));

        System.out.println("");

        System.out.println(arbol2.preOrden());

    }
        

        //Hay tests para cada método

    
}
