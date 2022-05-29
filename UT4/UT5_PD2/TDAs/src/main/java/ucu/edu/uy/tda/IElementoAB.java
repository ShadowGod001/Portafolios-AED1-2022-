package ucu.edu.uy.tda;

public interface IElementoAB<T> {

    /**
     * Obtiene el valor de la etiqueta del nodo.
     *
     * @return Etiqueta del nodo.
     */
    public Comparable getEtiqueta();

    /**
     * Obtiene el hijo izquierdo del nodo.
     *
     * @return Hijo Izquierdo del nodo.
     */
    public IElementoAB<T> getHijoIzq();

    /**
     * Obtiene el hijo derecho del nodo.
     *
     * @return Hijo derecho del nodo.
     */
    public IElementoAB<T> getHijoDer();

    /**
     * Asigna el hijo izquierdo del nodo.
     *
     * @param elemento
     */
    public void setHijoIzq(IElementoAB<T> elemento);

    /**
     * Asigna el hijo derecho del nodo.
     *
     * @param elemento
     */
    public void setHijoDer(IElementoAB<T> elemento);

    /**
     * Busca un elemento dentro del arbol con la etiqueta indicada.
     *
     * @param unaEtiqueta del nodo a buscar
     * @return Elemento encontrado. En caso de no encontrarlo, retorna nulo.
     */
    public IElementoAB<T> buscar(Comparable unaEtiqueta);

 

    /**
     * Inserta un elemento dentro del arbol.
     *
     * @param elemento Elemento a insertar.
     * @return Exito de la operaci�n.
     */
    public boolean insertar(IElementoAB<T> elemento);

    /**
     * Imprime en preorden el arbol separado por guiones.
     *
     * @return String conteniendo el PreOrden
     */
    public String preOrden();

    /**
     * Retorna en inorden los elementos del arbol.
     *
     * @param unaLista
     */
    public void inOrden(Lista<T> unaLista);

    public String innOrden();

    /**
     * Imprime en postorden el arbol separado por guiones.
     *
     * @return String conteniendo el PostOrden
     */
    public String postOrden();

    /**
     * Retorna los datos contenidos en el elemento.
     *
     * @return
     */
    public T getDatos();
	
	 /**
     * Elimina un elemento dada una etiqueta.
     * @param unaEtiqueta
     * @return 
     */
    public IElementoAB eliminar(Comparable unaEtiqueta);
    
    /**
     * Devuelve la altura del árbol. Se toma que la raíz es altura cero (0).
     * Si el árbol es vacío, se retorna -1.
     * @return
     */
    public int altura();
    
    /**
     * Devuelve la cantidad de nodos totales del árbol.
     * @return
     */
    public int tamanio();

    /**
     * Devuelve la cantidad de nodos totales del árbol.
     * @return
     */
    public int obtenerTamanio();
    
    /**
     * Dada una etiqueta devuelve el nivel en el que se encuentra el elemento,
     * de lo contrario devuelve -1.
     * @param etiqueta
     * @param nivel
     * @return
     */
    public int nivel(Comparable etiqueta, int nivel);

    /**
     * Devuelve true si es hoja.
     * @return
     */
    public boolean esHoja();

    /**
     * Devuelve la altura del árbol. Se toma que la raíz es altura cero (0).
     * Si el árbol es vacío, se retorna -1.
     * @return
     */
    public int obtenerAltura();

    /**
     * Devuelve la la cantidad de hojas del árbol
     * @return
     */
    public int obtenerCantidadHojas();

    /**
     * Devuelve la cantidad de nodos completos (ambos hijos no nulos)
     * @param etiqueta
     * @return 
     */
    public int completos();

    /**
     * Devuelve la cantidad de nodos de un cierto nivel
     * @param etiqueta
     * @return 
     */
    public int enNivel(int nivel);

    /**
     * @return el menor elemento
     */
    public TElementoAB<T> obtenerMenorElemento();

    /**
     * @return el mayor elemento
     */
    public TElementoAB<T> obtenerMayorElemento();

    public boolean esABB();

    public TElementoAB<T> anterior(Comparable clave);

}
