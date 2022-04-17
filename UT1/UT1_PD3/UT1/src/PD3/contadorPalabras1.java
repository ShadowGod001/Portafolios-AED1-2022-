package PD3;

import java.awt.BorderLayout;
import PD3.ContadorPalabras;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JScrollPane;
import javax.swing.JSpinner;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;

public class contadorPalabras1 extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private final ButtonGroup buttonGroup = new ButtonGroup();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					contadorPalabras1 frame = new contadorPalabras1();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public contadorPalabras1() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 641, 469);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Cantidad de palabras");
		lblNewLabel.setBounds(389, 173, 147, 30);
		contentPane.add(lblNewLabel);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(546, 176, 56, 22);
		contentPane.add(textArea);
		
		JButton btnNewButton = new JButton("OK");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				ContadorPalabras prueba = new ContadorPalabras();
				textArea.setText(Integer.toString(prueba.contarPalabras(textField.getText())));
			}
		});
		btnNewButton.setBounds(444, 57, 89, 37);
		contentPane.add(btnNewButton);
		
		textField = new JTextField();
		textField.setBounds(54, 60, 314, 30);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("Opcion 1");
		buttonGroup.add(rdbtnNewRadioButton);
		rdbtnNewRadioButton.setBounds(64, 177, 109, 23);
		contentPane.add(rdbtnNewRadioButton);
		rdbtnNewRadioButton.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				
				JOptionPane.showMessageDialog(null, "Seleccionó la opción 1", "Message", JOptionPane.INFORMATION_MESSAGE);
				
			}
			
		});
		
		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("Opcion 2");
		buttonGroup.add(rdbtnNewRadioButton_1);
		rdbtnNewRadioButton_1.setBounds(64, 236, 109, 23);
		contentPane.add(rdbtnNewRadioButton_1);
		rdbtnNewRadioButton_1.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				
				JOptionPane.showMessageDialog(null, "Seleccionó la opción 2", "Message", JOptionPane.INFORMATION_MESSAGE);
				
			}
			
		});
		
		JRadioButton rdbtnNewRadioButton_2 = new JRadioButton("Opcion 3");
		buttonGroup.add(rdbtnNewRadioButton_2);
		rdbtnNewRadioButton_2.setBounds(64, 297, 109, 23);
		contentPane.add(rdbtnNewRadioButton_2);
		rdbtnNewRadioButton_2.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				
				JOptionPane.showMessageDialog(null, "Seleccionó la opción 3", "Message", JOptionPane.INFORMATION_MESSAGE);
				
			}
			
		});
	}
}
