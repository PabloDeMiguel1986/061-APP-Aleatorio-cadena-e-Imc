package controller;

public class CtrPrincipal {
	
	public static  void abrirImc() {
		
		new view.FrmImc();
	}
	
	public static void abrirAleatorio() {
		new view.FrmAleatorio();
	}

	public static void abrirCadena() {

		new view.FrmCadena();
	}
	public static void abrirPaises() {
		new view.FrmPaises();
	}
	
	public static void cerrarPrograma() {
		System.exit(0);
		
	}

	
	
}