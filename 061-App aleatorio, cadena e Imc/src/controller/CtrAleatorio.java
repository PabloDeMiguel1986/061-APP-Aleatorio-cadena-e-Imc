package controller;

import view.FrmAleatorio;


public class CtrAleatorio {
	
	public static void obtenerAleatorio(int valorIni, int valorMax) {
		//ASí se consigue generar un numero aleatorio entre rangos
		//txtInfo.setText(String.valueOf((int)(Math.random()*(valorMax-valorIni+1)+ valorIni)));
	//Otra opcion para sacarlo es(profesor):
		FrmAleatorio.txtInfo.setText((String.valueOf((int)(Math.random()*(valorIni - (valorMax+1))+ (valorMax+1)))));
		//Se llama a la clase
}
}