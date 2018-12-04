package view;

import java.awt.List;

import javax.swing.JDialog;


import controller.CtrPaises;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class FrmPaises extends JDialog {

	private static final long serialVersionUID = 1L;
	
	public static List lstPaises;
	public static List lstCapitales;
	public static JLabel lblResultado;

	public FrmPaises() {
		initialize();
		CtrPaises.cargaDatos();
		setVisible(true);
	}

	private void initialize() {
		setTitle("Paises y Capitales");
		setBounds(100, 100, 241, 245);
		setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
		getContentPane().setLayout(null);
		
		lstPaises = new List();
		lstPaises.setBounds(10, 10, 100, 100);
		lstPaises.select(0);
		getContentPane().add(lstPaises);
		
		lstCapitales = new List();
		lstCapitales.setBounds(116, 10, 100, 100);
		lstCapitales.select(0);
		getContentPane().add(lstCapitales);
		
		JButton btnComprobar = new JButton("COMPROBAR");
		btnComprobar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				CtrPaises.comprobar();
			}
		});
		btnComprobar.setBounds(10, 174, 208, 23);
		getContentPane().add(btnComprobar);
		
		lblResultado = new JLabel("");
		lblResultado.setFont(new Font("Arial Black", Font.PLAIN, 19));
		lblResultado.setHorizontalAlignment(SwingConstants.CENTER);
		lblResultado.setBounds(30, 134, 167, 29);
		getContentPane().add(lblResultado);
		
		setModal(true);
	}
	
}
