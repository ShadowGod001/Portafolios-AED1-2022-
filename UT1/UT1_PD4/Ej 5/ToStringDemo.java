public class ToStringDemo {
	public static void main(String[] args) {
		double d = 888.51;
		String s = Double.toString(d);
		int dot = s.indexOf('.'); // Devuelve el indice donde esta el "."
		System.out.println(dot + " digits " + "before decimal point.");
		System.out.println((s.length() - dot - 1) + " digits after decimal point.");
	}
	
	//1) 3 digits before decimal point.
	//	 2 digits after decimal point.
	
	//2) 3 digits before decimal point. ---> 3 es la posición del punto en la conversión del número a String, a eso se le suma el texto " digits " + "before decimal point."
	//   2 digits after decimal point. ---> el método length() devuelve el largo del String en este caso 6, a eso se le resta la posición del punto (3) y a eso 1 porque a pesar de tener largo 6, las posiciones van del 0 al 5.
}