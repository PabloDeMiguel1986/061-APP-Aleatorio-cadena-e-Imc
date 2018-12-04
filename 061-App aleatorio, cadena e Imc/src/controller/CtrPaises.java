package controller;

import java.awt.Color;

import logic.LogPaises;
import view.FrmPaises;

public class CtrPaises {

	public static void cargaDatos() {
		LogPaises.cargaPaises();
		LogPaises.cargaCapitales();
		LogPaises.mezclaDatos();
		pintaDatos();
	}

	public static void pintaDatos() {
		for (String str : LogPaises.paisesMix) {
			FrmPaises.lstPaises.add(str);
		}
		for (String str : LogPaises.capitalesMix) {
			FrmPaises.lstCapitales.add(str);
		}
	}

	public static void comprobar() {
		String pais = FrmPaises.lstPaises.getSelectedItem();
		String capital = FrmPaises.lstCapitales.getSelectedItem();
		boolean esAcierto = LogPaises.compruebaPareja(pais, capital);
		if (esAcierto) {
			FrmPaises.lblResultado.setText("ACIERTO");
			FrmPaises.lblResultado.setForeground(Color.GREEN);;
		} else {
			FrmPaises.lblResultado.setText("FALLO");
			FrmPaises.lblResultado.setForeground(Color.RED);;
		}
	}

}
