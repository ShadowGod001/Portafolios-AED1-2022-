public class ComputeResult {
	public static void main(String[] args) {
		
		String original = "este es el curso de Programación 2";
		StringBuilder result = new StringBuilder("hola");
		int index = original.indexOf('a');
		
		/* 1 */ result.setCharAt(0, original.charAt(0));
		//setCharAt es un replace de una sola letra
		// result = eola
		System.out.println(result);
		/* 2 */ result.setCharAt(1, original.charAt(original.length() - 1));
		// result = e2la
		System.out.println(result);
		/* 3 */ result.insert(1, original.charAt(4));
		// result = e 2la
		System.out.println(result);
		/* 4 */ result.append(original.substring(1, 4));
		// result = e 2laste
		System.out.println(result);
		/* 5 */ result.insert(3, (original.substring(index, index + 2) + ""));
		// result = e 2amlaste
		System.out.println(result);
	}
}