package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JSpinner;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JTextField;
import javax.swing.event.ChangeListener;

import controller.CtrAleatorio;
import controller.CtrPrincipal;

import javax.swing.event.ChangeEvent;
import java.awt.event.ActionListener;
import java.util.Random;
import java.awt.event.ActionEvent;
import javax.swing.SpinnerNumberModel;

public class FrmAleatorio extends JDialog{

	public static JTextField txtInfo;
	public static Integer valorIni;
	public static Integer valorMax;
	private JLabel lblInfo;
	private JLabel lblInfo_1;
	
	public FrmAleatorio() {
		//Aquí se puede eliminar frmPrincipal (objeto) y llamar directamente al método
		
		setResizable(false);
		setTitle("Numero Random");
		setBounds(100, 100, 283, 300);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		getContentPane().setLayout(null);
		
		JSpinner spnNumero1 = new JSpinner();
		spnNumero1.setModel(new SpinnerNumberModel(0, 0, 20, 1));
		
		spnNumero1.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent arg0) {
				
				valorIni = (Integer) spnNumero1.getValue();
			}
		});
		spnNumero1.setBounds(124, 48, 79, 20);
		getContentPane().add(spnNumero1);
		
		JSpinner spnNumero2 = new JSpinner();
		spnNumero2.setModel(new SpinnerNumberModel(0, 0, 20, 1));
		
		spnNumero2.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				
				valorMax = (Integer) spnNumero2.getValue();
			}
		});
		spnNumero2.setBounds(124, 105, 79, 20);
		getContentPane().add(spnNumero2);
		
		JLabel lblValor = new JLabel("Valor mínimo");
		lblValor.setHorizontalAlignment(SwingConstants.TRAILING);
		lblValor.setBounds(10, 48, 79, 20);
		getContentPane().add(lblValor);
		
		JLabel lblValor2 = new JLabel("Valor máximo");
		lblValor2.setHorizontalAlignment(SwingConstants.TRAILING);
		lblValor2.setBounds(10, 108, 79, 20);
		getContentPane().add(lblValor2);
		
		JButton btnAleatorio = new JButton("ALEATORIO");
		
		btnAleatorio.setBounds(66, 157, 137, 38);
		getContentPane().add(btnAleatorio);
		
		lblInfo_1 = new JLabel("Numero aleatorio :");
		lblInfo_1.setHorizontalAlignment(SwingConstants.TRAILING);
		lblInfo_1.setBounds(10, 216, 111, 20);
		getContentPane().add(lblInfo_1);
		
		txtInfo = new JTextField();
		txtInfo.setEditable(false);
		txtInfo.setBounds(124, 216, 79, 20);
		getContentPane().add(txtInfo);
		txtInfo.setColumns(10);
		
		btnAleatorio.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				controller.CtrAleatorio.obtenerAleatorio(valorIni, valorMax);
			}
		});
		setModal(true);
		setVisible(true);
	}
	
}