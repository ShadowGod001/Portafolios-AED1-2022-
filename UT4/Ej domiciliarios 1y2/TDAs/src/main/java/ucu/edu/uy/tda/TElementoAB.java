package ucu.edu.uy.tda;

public class TElementoAB<T> implements IElementoAB<T>
{

    private final Comparable etiqueta;
    private IElementoAB hijoIzq;
    private IElementoAB hijoDer;
    private T datos;

    /**
     * @param unaEtiqueta
     * @param unosDatos
     */
    public TElementoAB(Comparable unaEtiqueta, T unosDatos)
    {
        etiqueta = unaEtiqueta;
        datos = unosDatos;
    }

    @Override
    public IElementoAB<T> getHijoIzq()
    {
        return hijoIzq;
    }

    @Override
    public IElementoAB<T> getHijoDer()
    {
        return hijoDer;
    }

    /**
     * @param unElemento
     * @return
     */
    @Override
    public boolean insertar(IElementoAB<T> unElemento)
    {
        if (unElemento.getEtiqueta().compareTo(etiqueta) < 0)
        {
            if (hijoIzq != null)
            {
                return getHijoIzq().insertar(unElemento);
            }
            else
            {
                hijoIzq = unElemento;
                return true;
            }
        }
        else if (unElemento.getEtiqueta().compareTo(etiqueta) > 0)
        {
            if (hijoDer != null)
            {
                return getHijoDer().insertar(unElemento);
            }
            else
            {
                hijoDer = unElemento;
                return true;
            }
        }
        else
        {
            // ya existe un elemento con la misma etiqueta.-
            return false;
        }
    }

    /**
     * @param unaEtiqueta
     * @return
     */
    @Override
    public IElementoAB<T> buscar(Comparable unaEtiqueta)
    {

        if (unaEtiqueta.equals(etiqueta))
        {
            return this;
        }
        else if (unaEtiqueta.compareTo(etiqueta) < 0)
        {
            if (hijoIzq != null)
            {
                return getHijoIzq().buscar(unaEtiqueta);
            }
            else
            {
                return null;
            }
        }
        else if (hijoDer != null)
        {
            return getHijoDer().buscar(unaEtiqueta);
        }
        else
        {
            return null;
        }
    }

    @Override
    public void inOrden(Lista<T> unaLista)
    {
        if (hijoIzq != null)
        {
            hijoIzq.inOrden(unaLista);
        }
        Nodo<T> unNodo = new Nodo<>(this.getEtiqueta(), this.getDatos());
        unaLista.insertar(unNodo);
        if (hijoDer != null)
        {
            hijoDer.inOrden(unaLista);
        }
    }

    /**
     * @return recorrida en preOrden del subArbol que cuelga del elemento actual
     */
    @Override
    public String preOrden()
    {
        StringBuilder tempStr = new StringBuilder();
        tempStr.append(imprimir());
        if (hijoIzq != null)
        {
            tempStr.append(TArbolBB.SEPARADOR_ELEMENTOS_IMPRESOS);
            tempStr.append(getHijoIzq().preOrden());
        }
        if (hijoDer != null)
        {
            tempStr.append(TArbolBB.SEPARADOR_ELEMENTOS_IMPRESOS);
            tempStr.append(getHijoDer().preOrden());
        }
        return tempStr.toString();
    }

    /**
     * @return recorrida en postOrden del subArbol que cuelga del elemento
     * actual
     */
    @Override
    public String postOrden()
    {
        StringBuilder tempStr = new StringBuilder();
        if (hijoIzq != null)
        {
            tempStr.append(getHijoIzq().postOrden());
            tempStr.append(TArbolBB.SEPARADOR_ELEMENTOS_IMPRESOS);
        }
        if (hijoDer != null)
        {
            tempStr.append(getHijoDer().postOrden());
            tempStr.append(TArbolBB.SEPARADOR_ELEMENTOS_IMPRESOS);
        }
        tempStr.append(imprimir());
        return tempStr.toString();
    }

    @Override
    public Comparable getEtiqueta()
    {
        return etiqueta;
    }

    /**
     * @return
     */
    public String imprimir()
    {
        return (etiqueta.toString());
    }

    @Override
    public T getDatos()
    {
        return datos;
    }

    public void setDatos(T datos)
    {
        this.datos = datos;
    }

    @Override
    public void setHijoIzq(IElementoAB<T> elemento)
    {
        this.hijoIzq = elemento;

    }

    @Override
    public void setHijoDer(IElementoAB<T> elemento)
    {
        this.hijoDer = elemento;
    }

    @Override
    public IElementoAB<T> eliminar(Comparable unaEtiqueta)
    {
        if (unaEtiqueta.compareTo(this.getEtiqueta()) < 0)
        {
            if (this.hijoIzq != null)
            {
                this.hijoIzq = hijoIzq.eliminar(unaEtiqueta);
            }
            return this;
        }

        if (unaEtiqueta.compareTo(this.getEtiqueta()) > 0)
        {
            if (this.hijoDer != null)
            {
                this.hijoDer = hijoDer.eliminar(unaEtiqueta);

            }
            return this;
        }

        return quitaElNodo();
    }

    private IElementoAB<T> quitaElNodo()
    {
        if (hijoIzq == null)
        {    // solo tiene un hijo o es hoja
            return hijoDer;
        }

        if (hijoDer == null)
        { // solo tiene un hijo o es hoja
            return hijoIzq;
        }
// tiene los dos hijos, buscamos el lexicograficamente anterior
        IElementoAB<T> elHijo = hijoIzq;
        IElementoAB<T> elPadre = this;

        while (elHijo.getHijoDer() != null)
        {
            elPadre = elHijo;
            elHijo = elHijo.getHijoDer();
        }

        if (elPadre != this)
        {
            elPadre.setHijoDer(elHijo.getHijoIzq());
            elHijo.setHijoIzq(hijoIzq);
        }

        elHijo.setHijoDer(hijoDer);
        setHijoIzq(null);  // para que no queden referencias y ayudar al collector
        setHijoDer(null);
        return elHijo;
    }

    @Override
    public int altura()
    {
        int altIzq = -1;
        int altDer = -1;
        if (this.hijoIzq != null)
        {
            altIzq = this.hijoIzq.altura();
        }

        if (this.hijoDer != null)
        {
            altDer = this.hijoDer.altura();
        }

        return Math.max(altDer, altIzq) + 1;

    }

    @Override
    public int tamanio()
    {
        int tamSubArboles = 0;
        if (this.hijoIzq != null)
        {
            tamSubArboles += this.hijoIzq.tamanio();
        }

        if (this.hijoDer != null)
        {
            tamSubArboles += this.hijoDer.tamanio();
        }
        return tamSubArboles + 1;
    }

    @Override
    public int obtenerTamanio() {
        if(this.esHoja()){
            return 1;
        }
        else if(this.getHijoDer() != null && this.getHijoIzq() != null){
            return 1 + this.getHijoDer().obtenerTamanio() + this.getHijoIzq().obtenerTamanio();
        }
        else if(this.getHijoIzq() != null){
            return 1 + this.getHijoIzq().obtenerTamanio();
        }
        else{
            return 1 + this.getHijoDer().obtenerTamanio();
        }
    }

    @Override
    public int nivel(Comparable etiqueta, int nivel)
    {
        if (this.etiqueta.compareTo(etiqueta) == 0)
        {
            return nivel;
        }
        if (etiqueta.compareTo(this.etiqueta) < 0 && this.hijoIzq != null)
        {
            return this.hijoIzq.nivel(etiqueta, nivel + 1);
        }

        if (etiqueta.compareTo(this.etiqueta) > 0 && this.hijoDer != null)
        {
            return this.hijoDer.nivel(etiqueta, nivel + 1);
        }

        return -1;
    }

    @Override
    public boolean esHoja(){
        return (this.getHijoIzq() == null && this.getHijoDer() == null);
    }

    @Override
    public int obtenerAltura() {
        if (this.esHoja()) {
            return 1;
        }
        if (this.getHijoIzq()!=null && this.getHijoDer() == null) {
            return 1 + this.getHijoIzq().obtenerAltura();
        }
        if (this.getHijoDer()!=null && this.getHijoIzq() == null) {
            return 1 + this.getHijoDer().obtenerAltura();
        }
        return 1 + Math.max(this.getHijoIzq().obtenerAltura(), this.getHijoDer().obtenerAltura());
    }

    @Override
    public int obtenerCantidadHojas() {
        if(this.esHoja()){
            return 1;
        }
        Integer hojasIzquierdo = 0;
        Integer hojasDerecho = 0;
        if(this.getHijoIzq() != null){
            hojasIzquierdo = this.getHijoIzq().obtenerCantidadHojas();
        }
        if(this.getHijoDer() != null){
            hojasDerecho = this.getHijoDer().obtenerCantidadHojas();
        }
        return hojasIzquierdo + hojasDerecho;
    }
    

    @Override
    public int completos() {
        if (this.getHijoIzq() == null && this.getHijoDer() == null) {
            return 0;
        }
        int cantidadIzquierda = 0;
        
        int cantidadDerecha = 0;
        
        if (this.getHijoIzq() != null) {
            cantidadIzquierda = this.getHijoIzq().completos();
        }

        if (this.getHijoDer() != null) {
            cantidadDerecha = this.getHijoDer().completos();
        }

        if (this.getHijoIzq() != null && this.getHijoDer() != null) {
            return cantidadIzquierda + cantidadDerecha + 1;
        } else {
            return cantidadIzquierda + cantidadDerecha;
        }
    }   
        
        @Override
        public int enNivel(int nivel) {
        if (nivel == 0) {
            return 1;
        }
        int cont1 = 0;
        int cont2 = 0;

        if (this.getHijoIzq() != null) {
            cont1 = this.getHijoIzq().enNivel(nivel-1);
        }
        if (this.getHijoDer() != null) {
            cont2 = this.getHijoDer().enNivel(nivel-1);
        }
        return cont1+cont2;
        
        }

        @Override
        public TElementoAB<T> obtenerMenorElemento() {
        
        if (this.getHijoIzq() == null) {
            return this;
        }
        return this.getHijoIzq().obtenerMenorElemento();
        }

        @Override
        public TElementoAB<T> obtenerMayorElemento() {
        
        if (this.getHijoDer() == null) {
            return this;
        }
        return this.getHijoDer().obtenerMayorElemento();
        }

      
        @Override
        public boolean esABB() {

        if (hijoIzq == null && hijoDer == null) {
            return true;
        } else if (hijoIzq == null && hijoDer != null) {
            return (this.getEtiqueta().compareTo(hijoDer.getEtiqueta()) < 0) == hijoDer.esABB();
        } else if (hijoIzq != null && hijoDer == null) {
            return (this.getEtiqueta().compareTo(hijoIzq.getEtiqueta()) > 0) == hijoIzq.esABB();
        } else {
            return ((this.getEtiqueta().compareTo(hijoDer.getEtiqueta()) < 0) == hijoDer.esABB()) == ((this.getEtiqueta().compareTo(hijoIzq.getEtiqueta()) > 0) == hijoIzq.esABB());
        }


        }

        @Override
        public TElementoAB<T> anterior(Comparable clave) {

        if (clave.compareTo(this.etiqueta) < 0) {
            if (this.hijoIzq != null) {
                if (this.hijoIzq.getEtiqueta().equals(clave)) {
                    return this;
                } else {
                    return this.hijoIzq.anterior(clave);
                }
            }
        } else {
            if (this.hijoDer != null) {
                if (this.hijoDer.getEtiqueta().equals(clave)) {
                    return this;
                } else {
                    return this.hijoDer.anterior(clave);
                }
            }
        }
        return null;
        }

}
