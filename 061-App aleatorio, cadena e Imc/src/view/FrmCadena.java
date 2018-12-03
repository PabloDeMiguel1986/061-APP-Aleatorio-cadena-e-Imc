package view;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import controller.CtrCadena;

public class FrmCadena extends JDialog{

	private static final long serialVersionUID = 1L;
	
	public static JTextField txtTexto;
	public static JLabel lblSalida;
	private JButton btnLongitud;
	private JButton btnMinusculas;
	private JButton btnMayusculas;
	private JButton btnInvertido;

	public FrmCadena() {
		
		setTitle("Cadena");
		setBounds(100, 100, 298, 300);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		getContentPane().setLayout(null);
		
		JLabel lblTexto = new JLabel("Texto:");
		lblTexto.setFont(new Font("Verdana", Font.BOLD, 11));
		lblTexto.setBounds(10, 11, 46, 14);
		getContentPane().add(lblTexto);
		
		txtTexto = new JTextField();
		txtTexto.setFont(new Font("Verdana", Font.PLAIN, 11));
		txtTexto.setBounds(66, 9, 208, 20);
		getContentPane().add(txtTexto);
		txtTexto.setColumns(10);
		
		JLabel lblSalida = new JLabel("");
		lblSalida.setForeground(new Color(0, 0, 128));
		lblSalida.setFont(new Font("Verdana", Font.BOLD, 16));
		lblSalida.setBounds(24, 54, 235, 108);
		getContentPane().add(lblSalida);
		
		btnLongitud = new JButton("Longitud");
	
		btnLongitud.setBounds(10, 183, 129, 29);
		getContentPane().add(btnLongitud);
		
		btnMinusculas = new JButton("Min\u00FAsculas");
		btnMinusculas.setBounds(143, 183, 129, 29);
		getContentPane().add(btnMinusculas);
		
		btnInvertido = new JButton("Invertir");
		btnInvertido.setBounds(143, 221, 129, 29);
		getContentPane().add(btnInvertido);
		
		btnMayusculas = new JButton("May\u00FAsculas");
		btnMayusculas.setBounds(10, 221, 129, 29);
		getContentPane().add(btnMayusculas);
		
		btnLongitud.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent z) {
				String str = FrmCadena.txtTexto.getText();
				int longStr = str.length();
				System.out.println(longStr);
				lblSalida.setText(longStr+"");
				//CtrCadena.longitud();
			}
		});
		btnMinusculas.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblSalida.setText((FrmCadena.txtTexto.getText().toLowerCase()));
				//CtrCadena.minusculas();
			}
		});
		btnInvertido.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent x) {
				String cadenaTexto = txtTexto.getText();
				String cadenaInvertida = "";
				
				for (int i = cadenaTexto.length()-1; i>=0; i--) {
					
					cadenaInvertida = cadenaInvertida + cadenaTexto.charAt(i);
				}
				
				lblSalida.setText(cadenaInvertida);
				//lblSalida.setText(LogCadena.invertir(FrmCadena.txtTexto.getText()));
				//CtrCadena.invertir();
			}
		});
		btnMayusculas.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent y) {
				lblSalida.setText(FrmCadena.txtTexto.getText().toUpperCase());
				//CtrCadena.mayusculas();
			}
		});
		setModal(true);
		setVisible(true);
	}
}
