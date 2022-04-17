import java.util.Iterator;

public class Contador {

	private final static int MAX_CONT = 50; // final se usa para que el valor de la variable no cambie durante
											//  la ejecución del programa.
	private static int incremento = 1;
	private static int contador = 1;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		mostrarContador();
	}

	public static void mostrarContador() {
		/*
		 * while (contador <= MAX_CONT) { System.out.println(contador); contador =
		 * contador + incremento;
		 * 
		 * 
		 * do { System.out.println(contador); contador = contador + incremento; } while
		 * (contador <= MAX_CONT);
		 */

		for (int i = 1; i <= MAX_CONT; i++) {

			System.out.println(contador);
			contador = contador + incremento;
		}
	};
}
