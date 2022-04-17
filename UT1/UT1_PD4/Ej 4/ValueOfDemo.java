public class ValueOfDemo {

    public static void main(String[] args) {
        // this program requires two
        // arguments on the command line
    	
    	for (String string : args) {
			System.out.println(string);
		}
        if (args.length == 3) { //esta condición debe ser igual a 2.
            // convert strings to numbers
            float a = (Float.valueOf (args[0])).floatValue();
            float b = (Float.valueOf(args[1])).floatValue();
            // do some arithmetic
            System.out.println("a + b = " + (a + b));
            System.out.println("a - b = " + (a - b));
            System.out.println("a * b = " + (a * b));
            System.out.println("a / b = " + (a / b));
            System.out.println("a % b = " + (a % b));
        } else {
            System.out.println("This program " + "requires two command-line arguments.");
            }
        
        // 1) Cuando se invoca con 13.4 y 66.1 imprime por consola el mensaje del else.
        // 2) Si fueran solo enteros positivos podría utilizarse int en vez de float.
    }
}