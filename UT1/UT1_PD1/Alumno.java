public class Alumno {

	private String nombre;

	public Alumno() {
		nombre = null;
	}

	public String getNombreAdmiracion(String nombre) {
		return nombre.concat("!");
	}

	public static void main(String[] args) {
		Alumno alumno = new Alumno();
		System.out.println(alumno.getNombreAdmiracion("Agustin"));
		//String cadena = "Agustin";
		//System.out.println(cadena.length());
		System.out.println(recorrer("Agustin"));
		System.out.println(getValor());
		System.out.println(getPrimerCaracter("Agustin"));
		System.out.println(paraAString(5));
	}

	public static int recorrer(String cadena) {
		int res = 0;
		for (int i = 0; i < cadena.length(); i++) {
			if (cadena.charAt(i) != ' ') {
				res++;
			}
		}
		return res;
	}

	public static int getValor() {
		int vector[] = { 6, 16, 26, 36, 46, 56, 66, 76 };
		int idx = 7;
		return vector[idx];
	}

	public static char getPrimerCaracter(String palabra) {
		
		return (palabra.charAt(0));
	}

	public static String paraAString(int a) {
		Integer x1 = new Integer(a);
		return (String) (x1.toString());
		//o solo poner return (String.valueOf(a));
	}
}