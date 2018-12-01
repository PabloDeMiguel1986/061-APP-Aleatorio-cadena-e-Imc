package controller;

import logic.logImc;
import view.FrmImc;

public class CtrImc {

	public static void obtenerIMC() {
		int peso = FrmImc.sldPeso.getValue();
		double altura = FrmImc.sldAltura.getValue() / 100.0;

		double imcVal = logImc.calculoIMC(peso, altura);
		String imcTxt = logImc.calculoIMCtxt(imcVal);

		FrmImc.lblPeso.setText("" + peso);
		FrmImc.lblAltura.setText("" + altura);
		FrmImc.lblIMC.setText("" + imcVal);
		FrmImc.lblComplexion.setText(imcTxt);

	}
}