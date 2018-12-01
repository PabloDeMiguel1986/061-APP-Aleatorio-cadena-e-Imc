package logic;

public class LogCadena {
	
	public static String invertir(String cadena) {
		
		String cadenaInvertida = "";
		String cadenaTexto= cadena;
		
		for (int i = cadenaTexto.length()-1; i>=0; i--) {
			
			cadenaInvertida = cadenaInvertida + cadenaTexto.charAt(i);
		}
		
		return cadenaInvertida;
		
	}

}
