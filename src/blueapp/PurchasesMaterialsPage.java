package blueapp;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import java.awt.Component;
import javax.swing.JTextField;

public class PurchasesMaterialsPage extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;


	public PurchasesMaterialsPage() {
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
		lblNewLabel.setIcon(new ImageIcon(PurchasesMaterialsPage.class.getResource("/images/bluelogo-small.png")));
		lblNewLabel.setBounds(0, 0, 101, 82);
		header.add(lblNewLabel);
		
		JLabel lblNewLabel_2 = new JLabel("ΠΡΩΤΕΣ ΥΛΕΣ");
		lblNewLabel_2.setForeground(Color.WHITE);
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_2.setBounds(503, 19, 167, 44);
		header.add(lblNewLabel_2);
		
		JPanel footer = new JPanel();
		footer.setLayout(null);
		footer.setBackground(new Color(32, 45, 64));
		footer.setBounds(0, 632, 1232, 99);
		contentPane.add(footer);
		
		JButton btnAddProduct = new JButton("Προσθήκη Πρώτης Ύλης");
		btnAddProduct.setForeground(Color.WHITE);
		btnAddProduct.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnAddProduct.setBackground(new Color(0, 128, 0));
		btnAddProduct.setBounds(7, 298, 237, 105);
		contentPane.add(btnAddProduct);
		
		JButton btnReturn = new JButton("Επιστροφή");
		btnReturn.setForeground(Color.WHITE);
		btnReturn.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnReturn.setBackground(new Color(32, 45, 64));
		btnReturn.setBounds(26, 468, 181, 94);
		contentPane.add(btnReturn);
		
		JScrollPane scrollPaneCustomers = new JScrollPane((Component) null);
		scrollPaneCustomers.setBounds(254, 189, 659, 420);
		contentPane.add(scrollPaneCustomers);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(254, 111, 335, 51);
		contentPane.add(textField);
		
		JButton btnProductSearch = new JButton("Αναζήτηση Προϊόντος");
		btnProductSearch.setForeground(Color.WHITE);
		btnProductSearch.setBackground(new Color(32, 45, 64));
		btnProductSearch.setBounds(624, 112, 243, 49);
		contentPane.add(btnProductSearch);
		
		JButton btnShowProductHistory = new JButton("Προβολή Ιστορικού");
		btnShowProductHistory.setForeground(Color.WHITE);
		btnShowProductHistory.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnShowProductHistory.setBackground(new Color(32, 45, 64));
		btnShowProductHistory.setBounds(947, 177, 260, 105);
		contentPane.add(btnShowProductHistory);
		
		JButton btnUpdateProduct = new JButton("Επεξεργασία Προϊόντος");
		btnUpdateProduct.setForeground(Color.WHITE);
		btnUpdateProduct.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnUpdateProduct.setBackground(new Color(32, 45, 64));
		btnUpdateProduct.setBounds(947, 318, 260, 105);
		contentPane.add(btnUpdateProduct);
		
		JButton btnShowProductInfo = new JButton("Προβολή Στοιχείων");
		btnShowProductInfo.setForeground(Color.WHITE);
		btnShowProductInfo.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnShowProductInfo.setBackground(new Color(32, 45, 64));
		btnShowProductInfo.setBounds(947, 468, 260, 105);
		contentPane.add(btnShowProductInfo);
		
		JButton btnReturn_1 = new JButton("Υλικά");
		btnReturn_1.setForeground(Color.WHITE);
		btnReturn_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnReturn_1.setBackground(new Color(32, 45, 64));
		btnReturn_1.setBounds(26, 164, 181, 94);
		contentPane.add(btnReturn_1);
	}

}
