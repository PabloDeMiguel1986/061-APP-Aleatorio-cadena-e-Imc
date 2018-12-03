package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

import controller.CtrPrincipal;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JSeparator;

public class FrmPrincipal extends JFrame{

	private JFrame frame;

	public FrmPrincipal() {
		
		setBounds(400,400,288,184);
		JMenuBar mnBMenu = new JMenuBar();
		setJMenuBar(mnBMenu);
		
		JMenu mnnInicio = new JMenu("Inicio");
		mnBMenu.add(mnnInicio);
		
		JMenuItem mntAleatorio = new JMenuItem("Calcular n\u00BA Aleatorio");
		mntAleatorio.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				CtrPrincipal.abrirAleatorio();
			}
		});
		mnnInicio.add(mntAleatorio);
		
		JMenuItem mntcalcularImc = new JMenuItem("Calcular IMC");
		mntcalcularImc.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CtrPrincipal.abrirImc();
			}
		});
		mnnInicio.add(mntcalcularImc);
		
		JMenuItem mntCadena = new JMenuItem("Cadena");
		mntCadena.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				CtrPrincipal.abrirCadena();
			}
		});
		mnnInicio.add(mntCadena);
		
		JMenuItem mntPaises = new JMenuItem("Pa\u00EDses");
		mntPaises.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				CtrPrincipal.abrirPaises();
			}
		});
		mnnInicio.add(mntPaises);
		
		JSeparator separator = new JSeparator();
		mnnInicio.add(separator);
		
		JMenuItem mntSalir = new JMenuItem("Salir");
		mntSalir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CtrPrincipal.cerrarPrograma();
			}
		});
		mnnInicio.add(mntSalir);
		
		JMenu mnnOpciones = new JMenu("Opciones");
		mnBMenu.add(mnnOpciones);
		
		JMenuItem mntCortar = new JMenuItem("Cortar");
		mnnOpciones.add(mntCortar);
		getContentPane().setLayout(null);
		
		JLabel lblBienvenido = new JLabel("BIENVENIDO");
		lblBienvenido.setFont(new Font("Arial", Font.BOLD, 17));
		lblBienvenido.setForeground(new Color(0, 0, 128));
		lblBienvenido.setHorizontalAlignment(SwingConstants.CENTER);
		lblBienvenido.setBounds(0, 0, 280, 97);
		getContentPane().add(lblBienvenido);
		initialize();
		setVisible(true);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}