package logic;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LogPaises {
	
	private static List<String> paises = new ArrayList<String>();
	private static List<String> capitales = new ArrayList<String>();

	public static List<String> paisesMix = new ArrayList<String>();
	public static List<String> capitalesMix = new ArrayList<String>();
	
	public static void mezclaDatos() {
		paisesMix.addAll(paises);
		capitalesMix.addAll(capitales);
		Collections.shuffle(paisesMix);
		Collections.shuffle(capitalesMix);
	}

	public static void cargaPaises() {
		paises.add("España");
		paises.add("Francia");
		paises.add("Italia");
		paises.add("Portugal");
	}
	
	public static void cargaCapitales() {
		capitales.add("Madrid");
		capitales.add("París");
		capitales.add("Roma");
		capitales.add("Lisboa");
	}
	
	public static boolean compruebaPareja(String pais, String capital) {
		int posPais = paises.indexOf(pais);
		int posCapital = capitales.indexOf(capital);
		return (posPais == posCapital);
	}

}