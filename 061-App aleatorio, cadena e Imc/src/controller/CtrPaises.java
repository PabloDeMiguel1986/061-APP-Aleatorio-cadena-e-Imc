package controller;

import java.util.ArrayList;
import java.util.List;

import logic.LogPaises;
import view.FrmPaises;

public class CtrPaises {
	public static void cargarDatos() {
		LogPaises.cargaPaises();
		LogPaises.cargaCapitales();
		LogPaises.cargaEmparejamiento();
		pintaPaises();
	}
		private static void pintaPaises() {
			for(String elto: LogPaises.paisesmix) {
				FrmPaises.lstPais.add(elto);
			}
			for(String elto: LogPaises.capitalesmix) {
				FrmPaises.lstCapital.add(elto);
			}
		
	}
		public static void listaPaises() {
		
		List<String> listaPaises = new ArrayList<String>();
		listaPaises.add("España");
		listaPaises.add("Francia");
		listaPaises.add("Alemania");
		listaPaises.add("Italia");
		listaPaises.add("Grecia");
		listaPaises.add("Turquia");
		listaPaises.add("España");
		listaPaises.add("Noruega");
		listaPaises.add("Suecia");
		
		
		for(String elto: listaPaises) {
		
		}
	
	}

		
	}
	

