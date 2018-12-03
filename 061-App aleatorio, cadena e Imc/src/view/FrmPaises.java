package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

import controller.CtrPaises;

import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JRadioButton;
import javax.swing.ListSelectionModel;
import java.awt.Color;
import java.awt.List;

public class FrmPaises extends JDialog {

	public JFrame frmPaises;
	public static List lstPais;
	public static JLabel lblResultado;
	public static List lstCapital;

	
	public FrmPaises() {
		
		initialize();
		CtrPaises.cargarDatos();
		lstPais.select(0);
		lstCapital.select(0);
		setVisible(true);
		
	}
	private void initialize() {
		setTitle("Pa\u00EDses");
		setBounds(100, 100, 307, 382);
		setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
		getContentPane().setLayout(null);
		
		JLabel lblPais = new JLabel("PA\u00CDS");
		lblPais.setFont(new Font("Verdana", Font.BOLD, 14));
		lblPais.setHorizontalAlignment(SwingConstants.CENTER);
		lblPais.setBounds(10, 11, 113, 21);
		getContentPane().add(lblPais);
		
		JLabel lblCapital = new JLabel("CAPITAL");
		lblCapital.setHorizontalAlignment(SwingConstants.CENTER);
		lblCapital.setFont(new Font("Verdana", Font.BOLD, 14));
		lblCapital.setBounds(165, 11, 113, 21);
		getContentPane().add(lblCapital);
		
		JLabel lblResultado = new JLabel("New label");
		lblResultado.setHorizontalAlignment(SwingConstants.CENTER);
		lblResultado.setBounds(80, 225, 123, 45);
		getContentPane().add(lblResultado);
		
		JButton btnComprobar = new JButton("COMPROBAR");
		btnComprobar.setFont(new Font("Verdana", Font.BOLD, 11));
		btnComprobar.setBounds(80, 281, 123, 33);
		getContentPane().add(btnComprobar);
		
		List lstPais = new List();
		lstPais.setMultipleSelections(false);
		lstPais.setBounds(13, 38, 123, 168);
		lstPais.add(CtrPaises.listaPaises());
		getContentPane().add(lstPais);
		
		List lstCapital = new List();
		lstCapital.setMultipleSelections(false);
		lstCapital.setBounds(155, 38, 123, 168);
		getContentPane().add(lstCapital);
		
		setModal(true);
		setVisible(true);
	}
}
