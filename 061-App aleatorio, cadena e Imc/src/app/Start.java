package app;

public class Start {

	public static void main(String[] args) {
		Start app = new Start();
		app.inicializar();
	}
	public void inicializar() {
		new view.FrmPrincipal();
	}
}