package blueapp;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Font;
import javax.swing.JScrollPane;
import java.awt.Component;
import javax.swing.JButton;
import javax.swing.JTextField;

public class PurchasesStats extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;

	
	public PurchasesStats() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1246, 768);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel header = new JPanel();
		header.setLayout(null);
		header.setBackground(new Color(32, 45, 64));
		header.setBounds(0, 0, 1256, 82);
		contentPane.add(header);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(PurchasesStats.class.getResource("/images/bluelogo-small.png")));
		lblNewLabel.setBounds(0, 0, 101, 82);
		header.add(lblNewLabel);
		
		JLabel lblNewLabel_2 = new JLabel("ΙΣΤΟΡΙΚΟ ΑΓΟΡΩΝ");
		lblNewLabel_2.setForeground(Color.WHITE);
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_2.setBounds(503, 19, 167, 44);
		header.add(lblNewLabel_2);
		
		JPanel footer = new JPanel();
		footer.setLayout(null);
		footer.setBackground(new Color(32, 45, 64));
		footer.setBounds(0, 632, 1232, 99);
		contentPane.add(footer);
		
		JLabel lblSales = new JLabel("ΑΓΟΡΕΣ");
		lblSales.setFont(new Font("Tahoma", Font.BOLD, 24));
		lblSales.setBounds(549, 93, 158, 51);
		contentPane.add(lblSales);
		
		JScrollPane scrollPaneSales = new JScrollPane((Component) null);
		scrollPaneSales.setBounds(281, 148, 668, 462);
		contentPane.add(scrollPaneSales);
		
		JButton btnReturn = new JButton("Επιστροφή");
		btnReturn.setForeground(Color.WHITE);
		btnReturn.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnReturn.setBackground(new Color(0, 128, 0));
		btnReturn.setBounds(39, 478, 158, 89);
		contentPane.add(btnReturn);
		
		JLabel lblDateFrom = new JLabel("Από : ");
		lblDateFrom.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblDateFrom.setBounds(1012, 148, 100, 20);
		contentPane.add(lblDateFrom);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(1012, 178, 182, 37);
		contentPane.add(textField);
		
		JLabel lblDateTo = new JLabel("Έως : ");
		lblDateTo.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblDateTo.setBounds(1012, 247, 100, 20);
		contentPane.add(lblDateTo);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(1012, 280, 182, 37);
		contentPane.add(textField_1);
	}

}
