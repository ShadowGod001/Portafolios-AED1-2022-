
public class StringMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String palabra = "Palabra de prueba de";
		
		System.out.println(palabra.substring(7)); 
		System.out.println(palabra.substring(0,7)); 
		// Si se le pone un mínimo y un máximo imprime desde el minimo hasta el anterior al máximo. 
		// Si se le pasa solo un numero imprime desde el siguiente hasta el final.
		
		String arrayString[] = palabra.split(" ");
		// palabra.split(" ", 5) limit for the number of strings in array. 
		// If it is zero, it will returns all the strings matching regex.
		
		//Foreach de c# foreach(string in arrayString)
		for (String string : arrayString) {
			
			System.out.println(string);
		} 
		
		System.out.println(palabra.subSequence(0, 5));
		// subSequence devuelve una secuencia de tipo char y read-only.
		
		System.out.print(palabra.trim().length());
		// Remueve los espacios de izq y derecha
		
		System.out.println(palabra.toLowerCase());
		System.out.println(palabra.toUpperCase());
		
		System.out.println(palabra.indexOf("a"));
		System.out.println(palabra.indexOf("a",2));
		System.out.println(palabra.indexOf(97));
		//El numero representa el caracter en ascii, 97 es a en ascii
		System.out.println(palabra.indexOf(97,2));
		
		System.out.println(palabra.lastIndexOf("a"));
		System.out.println(palabra.lastIndexOf("a",15));
		System.out.println(palabra.lastIndexOf(97));
		
		System.out.println(palabra.contains("de"));
		System.out.println(palabra.contains("madai"));
		// Devuelve booleano
		
		System.out.println(palabra.replace("de" , "madai"));
		System.out.println(palabra.replaceAll("de", "madai"));
		// Replace y replaceAll hacen lo mismo
		System.out.println(palabra.replaceFirst("de", "madai"));
		// Replace first solo reemplaza la primera coincidencia
		
		StringBuilder sb = new StringBuilder();
		System.out.println(sb.capacity());
		//System.out.println(sb.length());
		sb.append("Greetings");
		System.out.println(sb.capacity());
		sb.ensureCapacity(20);
		System.out.println(sb.capacity());
		//System.out.println(sb.length());
		String sb1 = sb.toString();
		System.out.println(sb1);
		
		StringBuilder sb2 = new StringBuilder("Able was I ere I saw Elba.");
		System.out.println(sb2.capacity());
		
		String hannah = "Did Hannah see bees? Hannah did.";
		System.out.println(hannah.length());
		System.out.println(hannah.charAt(12));
		System.out.println(hannah.indexOf("b"));
		
		//a) 32
		//b) e
		//c) la letra b esta en la posición 15
		
		System.out.println("Was it a car or a cat I saw?".substring(9, 12).length());
		
		//El String devuelto tiene un largo de 3 caracteres, y dice "car ".
		
		
		
	}

}
