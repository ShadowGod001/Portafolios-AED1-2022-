import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Entrada_de_datos_2 {
	
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
		
		Entrada_de_datos_2 Nueva_entrada = new Entrada_de_datos_2();
		String[] Lineas_entrada = Nueva_entrada.leerArchivo("entrada2.txt");
		List<String> Lineas_salida = new ArrayList<String>(); //Uso un arraylist pq no se cuantas lineas va a tener el archivo tonces no puedo usar un array pq es inmutable
		for (int i = 0; i < Lineas_entrada.length; i++) {
			String[] array = Lineas_entrada[i].split(" ");
			for (int j = 0; j < array.length; j++) {
				if (array[j].equals("ABC")) {
					Lineas_salida.add("2");
				}
				if (array[j].equals("DEF")) {
					Lineas_salida.add("3");
				}
				if (array[j].equals("GHI")) {
					Lineas_salida.add("4");
				}
				if (array[j].equals("JKL")) {
					Lineas_salida.add("5");
				}
				if (array[j].equals("MNO")) {
					Lineas_salida.add("6");
				}
				if (array[j].equals("PQRS")) {
					Lineas_salida.add("7");
				}
				if (array[j].equals("TUV")) {
					Lineas_salida.add("8");
				}
				if (array[j].equals("WXYZ")) {
					Lineas_salida.add("9");
				}
				if (array[j].equals(" ")) {
					Lineas_salida.add("0");
				}
				if (array[j].equals(".")) {
					Lineas_salida.add("1");
				}
			}
		}
		String[] Lineas_salida_2 = new String [Lineas_salida.size()];
		Lineas_salida_2 = Lineas_salida.toArray(Lineas_salida_2); //No puedo pasar del arraylist directo a un array con .toArray porque .toArray m lo pasa como array de objetos y el método para escribir necesita array de strings tonces
																 // lo que hago es crear un nuevo array con el tamaño del arraylist y después le digo que dentro del array 2 quiero que este el contenido del array 1 en formato del array 2 osea de strings. 
																// Eso se pone dentro del paréntesis osea le especifico el tipo de elementos que quiero dentro del array
		
		Nueva_entrada.escribirArchivo("salida2.txt", Lineas_salida_2);
		
		
		

	}

}
