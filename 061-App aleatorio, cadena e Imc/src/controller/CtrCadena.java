package controller;

import logic.LogCadena;
import view.FrmCadena;

public class CtrCadena {

	public static void longitud() {
		
		System.out.println(FrmCadena.txtTexto.getText());
		FrmCadena.lblSalida.setText(String.valueOf((int)FrmCadena.txtTexto.getText().length()));
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