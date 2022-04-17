import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class Entrada_de_datos {
	
	public static void escribirArchivo(String nombreCompletoArchivo, String[] listaLineasArchivo) {
		FileWriter fw;
		try {
		    fw = new FileWriter(nombreCompletoArchivo, true);
		    BufferedWriter bw = new BufferedWriter(fw);
		    for (int i = 0; i < listaLineasArchivo.length; i++) {
		        String lineaActual = listaLineasArchivo[i];
		        bw.write(lineaActual);
		        bw.newLine();
		    }
		    bw.close();
		    fw.close();
		} catch (IOException e) {
		    System.out.println("Error al escribir el archivo "
		            + nombreCompletoArchivo);
		    e.printStackTrace();
		}
		}

		public static String[] leerArchivo(String nombreCompletoArchivo) {
		FileReader fr;
		ArrayList<String> listaLineasArchivo = new ArrayList<String>();
		try {
		    fr = new FileReader(nombreCompletoArchivo);
		    BufferedReader br = new BufferedReader(fr);
		    String lineaActual = br.readLine();
		    while (lineaActual != null) {
		        listaLineasArchivo.add(lineaActual);
		        lineaActual = br.readLine();
		    }
		    br.close();
		    fr.close();
		} catch (FileNotFoundException e) {
		    System.out.println("Error al leer el archivo "
		            + nombreCompletoArchivo);
		    e.printStackTrace();
		} catch (IOException e) {
		    System.out.println("Error al leer el archivo "
		            + nombreCompletoArchivo);
		    e.printStackTrace();
		}
		System.out.println("Archivo leido satisfactoriamente");

		return listaLineasArchivo.toArray(new String[0]);
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Entrada_de_datos Nueva_entrada = new Entrada_de_datos();
		String[] Lineas_entrada = Nueva_entrada.leerArchivo("entrada.txt");
		System.out.println("El entero leído es: " + Lineas_entrada[0]);
		System.out.println("El número de punto flotante es: " + Lineas_entrada[1]);
		System.out.println("La cadena leída es " + Lineas_entrada[2]);
		System.out.println("¡Hola " + Lineas_entrada[2] + "! La suma de " + Lineas_entrada[0] + " y " + Lineas_entrada[1] + " es 45.44" );
		System.out.println("La división entera de " + Lineas_entrada[1] + " y " + Lineas_entrada[0] + " es 2 y su resto es 9.44 ");
		

	}

}
