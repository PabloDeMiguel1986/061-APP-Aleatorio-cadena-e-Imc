package view;

import java.awt.Font;

import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JSlider;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

import controller.CtrImc;
import controller.CtrPrincipal;

public class FrmImc extends JDialog{

	private static final long serialVersionUID = 1L;
	
	public static JSlider sldPeso;
	public static JSlider sldAltura;
	public static JLabel lblIMC;
	public static JLabel lblComplexion;
	public static JLabel lblPeso;
	public static JLabel lblAltura;

	public FrmImc() {

		setResizable(false);
		setTitle("\u00CDndice de Masa Corporal");
		setBounds(100, 100, 386, 258);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		getContentPane().setLayout(null);

		JLabel lblPesokg = new JLabel("Peso (Kg) :");
		lblPesokg.setBounds(10, 28, 77, 14);
		getContentPane().add(lblPesokg);

		JLabel lblAlturam = new JLabel("Altura (m) :");
		lblAlturam.setBounds(10, 79, 77, 14);
		getContentPane().add(lblAlturam);

		sldPeso = new JSlider();

		sldPeso.setValue(1);
		sldPeso.setMinimum(1);
		sldPeso.setMaximum(300);
		sldPeso.setBounds(76, 28, 200, 26);
		sldPeso.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent arg0) {
				CtrImc.obtenerIMC();
			}
		});
		getContentPane().add(sldPeso);

		sldAltura = new JSlider();

		sldAltura.setValue(1);
		sldAltura.setMinimum(1);
		sldAltura.setMaximum(200);
		sldAltura.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				CtrImc.obtenerIMC();
			}
		});
		sldAltura.setBounds(76, 79, 200, 26);
		getContentPane().add(sldAltura);

		lblPeso = new JLabel("00");
		lblPeso.setBounds(312, 28, 46, 14);
		getContentPane().add(lblPeso);

		lblAltura = new JLabel("00");
		lblAltura.setBounds(312, 79, 46, 14);
		getContentPane().add(lblAltura);

		JLabel lblImc = new JLabel("IMC =");
		lblImc.setBounds(10, 168, 46, 14);
		getContentPane().add(lblImc);

		lblIMC = new JLabel("00");
		lblIMC.setBounds(51, 168, 46, 14);
		getContentPane().add(lblIMC);

		lblComplexion = new JLabel("");
		lblComplexion.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblComplexion.setBounds(118, 159, 209, 26);
		getContentPane().add(lblComplexion);
		
		setModal(true);
		setVisible(true);
	}

}