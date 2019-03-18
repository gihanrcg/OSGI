package gui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;

import servicepublisher.ServicePublish;

import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.Font;
import java.awt.Color;

public class UnitConvertor {

	public JFrame frame;
	private JTextField txtkilo;
	private ServicePublish publisher;

	/**
	 * Launch the application.
	 */
//	public static void main(String[] args) {
//		EventQueue.invokeLater(new Runnable() {
//			public void run() {
//				try {
//					UnitConvertor window = new UnitConvertor();
//					window.frame.setVisible(true);
//				} catch (Exception e) {
//					e.printStackTrace();
//				}
//			}
//		});
//	}

	/**
	 * Create the application.
	 */
	public UnitConvertor(ServicePublish publisher) {
		initialize();
		this.publisher = publisher;
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		txtkilo = new JTextField();
		txtkilo.setFont(new Font("Tahoma", Font.PLAIN, 24));
		txtkilo.setBounds(35, 92, 146, 40);
		frame.getContentPane().add(txtkilo);
		txtkilo.setColumns(10);
		
		JLabel lblAnswer = new JLabel("Answer");
		lblAnswer.setFont(new Font("Tahoma", Font.PLAIN, 27));
		lblAnswer.setBounds(77, 165, 179, 50);
		frame.getContentPane().add(lblAnswer);
		
		JButton btnGram = new JButton("Get value in KiloGrams");
		btnGram.setForeground(Color.BLACK);
		btnGram.setBackground(Color.GRAY);
		btnGram.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				
				 double ans =  publisher.convertGramToKilogram(Double.parseDouble(txtkilo.getText()));
				 lblAnswer.setText(String.valueOf(ans) + " KG");
			}
		});
		btnGram.setBounds(218, 83, 165, 59);
		frame.getContentPane().add(btnGram);
		

	}
}
