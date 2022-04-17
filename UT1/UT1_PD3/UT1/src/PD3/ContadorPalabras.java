package PD3;
	
	public class ContadorPalabras {
	    public int contarPalabras(String frase) {
	        int contador = 0;
	        int i = 0;
	        while (i < frase.length()) {
	            String aux = "";
	            while ((i < frase.length()) && (frase.charAt(i) != ' ')) {
	                aux = aux + frase.charAt(i);
	                i++;
	            }
	            if (!aux.equals("")) {
	                contador += 1;
	            }
	            i++;
	        }
	        return contador;
	    }
	}

