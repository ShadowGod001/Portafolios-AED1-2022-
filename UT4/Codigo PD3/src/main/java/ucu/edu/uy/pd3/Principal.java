/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package src.main.java.ucu.edu.uy.pd3;
import src.main.java.ucu.edu.uy.tda.*;
import src.main.java.ucu.edu.uy.pd3.*;
import src.main.java.ucu.edu.uy.util.ManejadorArchivosGenerico;

/**
 *
 * @author Bernardo Rychtenberg
 */
public class Principal {
    
    public static void main(String[] args){
        
        // 1) Instanciar y cargar los afiliados a un árbol de afiliados desde padron.txt. 

        String[] padronPruebas = ManejadorArchivosGenerico.leerArchivo("padron.txt");

        TArbolPadronAfiliados arbolAfiliados = new TArbolPadronAfiliados();

        for (int i = 0; i < padronPruebas.length; i++) {
            String[] detalleDeAfiliado = padronPruebas[i].split(",");
            if (detalleDeAfiliado.length == 3) {
                int cedula= Integer.parseInt(detalleDeAfiliado[0]);
                String nombre = detalleDeAfiliado[1];
                String apellido = detalleDeAfiliado[2];

                Afiliado afiliado = new Afiliado(cedula, nombre, apellido);
                TElementoAB<Afiliado> nodoAfiliadoAB = new TElementoAB<Afiliado>(cedula,afiliado);
                arbolAfiliados.insertar(nodoAfiliadoAB);
                
            }

        }

        System.out.println(arbolAfiliados.inOrden());

        // 2) Instanciar y cargar las consultas a partir de los archivos historicos.txt y agendadas.txt

        String[] consultasHistoricas = ManejadorArchivosGenerico.leerArchivo("historicas.txt");

        for (int i = 0; i < consultasHistoricas.length; i++) {
            String[] detalleDeConsulta = consultasHistoricas[i].split(",");
            if (detalleDeConsulta.length == 5) {
                int etiqueta = Integer.parseInt(detalleDeConsulta[0]);
                String fecha = detalleDeConsulta[1];
                String especialidad = detalleDeConsulta[2];
                int ciMedico = Integer.parseInt(detalleDeConsulta[3]);
                int resultado = Integer.parseInt(detalleDeConsulta[4]);

                Consulta consulta = new Consulta(fecha, especialidad, ciMedico, resultado);
                arbolAfiliados.buscar(etiqueta).getDatos().cargarConsultaHistorica(consulta);
                
            }

        }

        String[] consultasPendientes = ManejadorArchivosGenerico.leerArchivo("agendadas.txt");

        for (int i = 0; i < consultasPendientes.length; i++) {
            String[] detalleDeConsulta = consultasPendientes[i].split(",");
            if (detalleDeConsulta.length == 5) {
                int etiqueta = Integer.parseInt(detalleDeConsulta[0]);
                String fecha = detalleDeConsulta[1];
                String especialidad = detalleDeConsulta[2];
                int ciMedico = Integer.parseInt(detalleDeConsulta[3]);
                int resultado = Integer.parseInt(detalleDeConsulta[4]);

                Consulta consulta = new Consulta(fecha, especialidad, ciMedico, resultado);
                arbolAfiliados.buscar(etiqueta).getDatos().cargarConsultaPendiente(consulta);
                
            }

        }

        // 3) Aplicar el método de carga de afiliados a partir de una lista (invocando el método cargarDesdeLista)
        // 4) Aplicar el método obtenerConsultasDelDia para obtener las consultas del día de la fecha. 

        TArbolBB<Consulta> arbolConsultaDelDia = arbolAfiliados.obtenerConsultasDelDia("20190905");
        //System.out.println(arbolConsultaDelDia.inOrden());

        String[] Lineas_salida = new String[1]; 
        Lineas_salida[0] = arbolConsultaDelDia.inOrden();
        ManejadorArchivosGenerico.escribirArchivo("consultasDelDia.txt",Lineas_salida);

        // 5) Obtener la cantidad de consultas en el día.

        System.out.println(arbolConsultaDelDia.inorden().cantElementos()); //El método no se puede usar porque es de TArbolPadrónAfiliados y estoy trabajando con un arbol de consultas

    }

        
        
    
    
}
