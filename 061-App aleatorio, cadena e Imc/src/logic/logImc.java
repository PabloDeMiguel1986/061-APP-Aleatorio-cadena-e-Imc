package logic;

public class logImc {

	public static double calculoIMC(int peso, double altura) {
		double imc = 0.0;
		imc = peso / Math.pow(altura, 2);
		return imc;
	}

	public static String calculoIMCtxt(double imcVal) {
		String complexion = "";
		if (imcVal < 16.0) {
			complexion = "Infrapeso: Delgadez Severa";
		} else if (imcVal <= 16.99) {
			complexion = "Infrapeso: Delgadez moderada";
		} else if (imcVal <= 18.49) {
			complexion = "Infrapeso: Delgadez aceptable";
		} else if (imcVal <= 24.99) {
			complexion = "Peso Normal";
		} else if (imcVal <= 29.99) {
			complexion = "Sobrepeso";
		} else if (imcVal <= 34.99) {
			complexion = "Obeso: Tipo I";
		} else if (imcVal <= 40.00) {
			complexion = "Obeso: Tipo II";
		} else {
			complexion = "Obeso: Tipo III";
		}
		return complexion;
	}
}