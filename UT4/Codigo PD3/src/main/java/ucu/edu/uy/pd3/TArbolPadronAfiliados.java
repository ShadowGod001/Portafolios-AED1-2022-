package src.main.java.ucu.edu.uy.pd3;
import src.main.java.ucu.edu.uy.tda.*;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Bernardo Rychtenberg
 */
public class TArbolPadronAfiliados extends TArbolBB<Afiliado> implements IArbolPadronAfiliados {

    @Override
    public TArbolBB<Afiliado> cargarDesdeLista(Lista<Afiliado> listaAfiliados) {
        // Acá se debe implementar el método 1 del parcial. 
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    @Override
    public TArbolBB<Consulta> obtenerConsultasDelDia(String fecha) {
        TArbolBB<Consulta> toReturn = new TArbolBB<Consulta>();
        Lista<Afiliado> listaAfiliados = this.inorden();
        Nodo<Afiliado> auxAfiliado = listaAfiliados.getPrimero();
        while (auxAfiliado != null) {
            Nodo<Consulta> nodoConsulta = auxAfiliado.getDato().getConsultaPendiente().getPrimero();
            while (nodoConsulta != null) {
                if (nodoConsulta.getDato().getFecha().equals(fecha) && nodoConsulta.getDato().getResultado()==0) {
                    TElementoAB<Consulta> consultaInsertar = new TElementoAB<Consulta>(nodoConsulta.getDato().getCedula() + nodoConsulta.getDato().getFecha() + nodoConsulta.getDato().getEspecialidad() , nodoConsulta.getDato());
                    toReturn.insertar(consultaInsertar);
                }
                nodoConsulta = nodoConsulta.getSiguiente();
            }
            auxAfiliado = auxAfiliado.getSiguiente();


        }
        return toReturn;
    }

    //sólo sirve para un árbol de consultas
    @Override
    public Integer cantidadConsultasdelDia(){
        /* Lista<Consulta> listaConsulta = this.inorden();
        Nodo<Consulta> nodoConsulta = listaConsulta.getPrimero();
        int cantidad = 0;
        while (nodoConsulta != null) {
            cantidad += 1;
        }
        nodoConsulta = nodoConsulta.getSiguiente();
        return cantidad; */
        return this.inorden().cantElementos();
    }

} 
    

