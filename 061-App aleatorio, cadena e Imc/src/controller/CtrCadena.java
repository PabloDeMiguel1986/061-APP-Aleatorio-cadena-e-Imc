package controller;

import logic.LogCadena;
import view.FrmCadena;

public class CtrCadena {

	public static void longitud() {
		String str = FrmCadena.txtTexto.getText();
		int longStr = LogCadena.longitudCadena(str);
		System.out.println(longStr);
		FrmCadena.lblSalida.setText(longStr+"");
	}

	public static void minusculas() {

		FrmCadena.lblSalida.setText((FrmCadena.txtTexto.getText().toLowerCase()));

	}

	public static void mayusculas() {

		FrmCadena.lblSalida.setText(FrmCadena.txtTexto.getText().toUpperCase());

	}

	public static void invertir() {

		FrmCadena.lblSalida.setText(LogCadena.invertir(FrmCadena.txtTexto.getText()));
	}

}