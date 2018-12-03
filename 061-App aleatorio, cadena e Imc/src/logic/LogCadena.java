package logic;

public class LogCadena {
	
	public static String invertir(String cadena) {
		
		String cadenaInvertida = "";
		String cadenaTexto= cadena;
		
		for (int i = cadenaTexto.length()-1; i>=0; i--) {
			//se puede hacer un for cuando se tiene una sola lines
			//(for (int cont = cadenaTexto.length()-1; cont>=0; cadenaInvertida+=cadenaTexto.charAt(cont, i--){}
			
			cadenaInvertida = cadenaInvertida + cadenaTexto.charAt(i);
		}
		
		return cadenaInvertida;
		
	}

	public static int longitudCadena(String str) {
		
		return str.length();
	}
	

}
