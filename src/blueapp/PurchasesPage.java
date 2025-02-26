package blueapp;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import java.awt.Component;
import javax.swing.JComboBox;

public class PurchasesPage extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;

	public PurchasesPage() {
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
		lblNewLabel.setIcon(new ImageIcon(PurchasesPage.class.getResource("/images/bluelogo-small.png")));
		lblNewLabel.setBounds(0, 0, 101, 82);
		header.add(lblNewLabel);
		
		JLabel lblNewLabel_2 = new JLabel("ΑΓΟΡΑ");
		lblNewLabel_2.setForeground(Color.WHITE);
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_2.setBounds(586, 19, 84, 44);
		header.add(lblNewLabel_2);
		
		JPanel footer = new JPanel();
		footer.setLayout(null);
		footer.setBackground(new Color(32, 45, 64));
		footer.setBounds(0, 632, 1232, 99);
		contentPane.add(footer);
		
		JLabel lblproduct = new JLabel("Υλικό");
		lblproduct.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblproduct.setBounds(229, 162, 52, 37);
		contentPane.add(lblproduct);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(291, 160, 276, 45);
		contentPane.add(textField);
		
		JButton btnSearchProduct = new JButton("Αναζήτηση");
		btnSearchProduct.setForeground(Color.WHITE);
		btnSearchProduct.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnSearchProduct.setBackground(new Color(32, 54, 64));
		btnSearchProduct.setBounds(593, 152, 114, 56);
		contentPane.add(btnSearchProduct);
		
		JButton btnAddProductToCart = new JButton("Προσθήκη");
		btnAddProductToCart.setForeground(Color.WHITE);
		btnAddProductToCart.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnAddProductToCart.setBackground(new Color(32, 54, 64));
		btnAddProductToCart.setBounds(730, 154, 147, 56);
		contentPane.add(btnAddProductToCart);
		
		JScrollPane scrollPaneShoppingCart = new JScrollPane((Component) null);
		scrollPaneShoppingCart.setBounds(234, 289, 635, 285);
		contentPane.add(scrollPaneShoppingCart);
		
		JLabel lblCart = new JLabel("Καλάθι");
		lblCart.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblCart.setBounds(487, 247, 80, 37);
		contentPane.add(lblCart);
		
		JLabel lblProvider = new JLabel("ΠΡΟΜΗΘΕΥΤΗΣ");
		lblProvider.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblProvider.setBounds(940, 134, 250, 27);
		contentPane.add(lblProvider);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(938, 167, 255, 37);
		contentPane.add(comboBox);
		
		JButton btnRestoreButton = new JButton("Επαναφορά");
		btnRestoreButton.setForeground(Color.WHITE);
		btnRestoreButton.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnRestoreButton.setBackground(new Color(255, 128, 0));
		btnRestoreButton.setBounds(932, 367, 274, 89);
		contentPane.add(btnRestoreButton);
		
		JButton btnSaleButton = new JButton("Καταχώρηση Αγοράς");
		btnSaleButton.setForeground(Color.WHITE);
		btnSaleButton.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnSaleButton.setBackground(new Color(0, 128, 0));
		btnSaleButton.setBounds(932, 483, 274, 89);
		contentPane.add(btnSaleButton);
		
		JButton btnReturnButton = new JButton("Επιστροφή");
		btnReturnButton.setForeground(Color.WHITE);
		btnReturnButton.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnReturnButton.setBackground(new Color(32, 45, 64));
		btnReturnButton.setBounds(41, 483, 158, 89);
		contentPane.add(btnReturnButton);
		
		JButton btnReturnButton_1 = new JButton("Προμηθευτές");
		btnReturnButton_1.setForeground(Color.WHITE);
		btnReturnButton_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnReturnButton_1.setBackground(new Color(32, 45, 64));
		btnReturnButton_1.setBounds(41, 120, 158, 89);
		contentPane.add(btnReturnButton_1);
		
		JButton btnReturnButton_2 = new JButton("Υλικά");
		btnReturnButton_2.setForeground(Color.WHITE);
		btnReturnButton_2.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnReturnButton_2.setBackground(new Color(32, 45, 64));
		btnReturnButton_2.setBounds(41, 237, 158, 89);
		contentPane.add(btnReturnButton_2);
		
		JButton btnSaleButton_1 = new JButton("Ιστορικό Αγορών");
		btnSaleButton_1.setForeground(Color.WHITE);
		btnSaleButton_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnSaleButton_1.setBackground(new Color(0, 128, 0));
		btnSaleButton_1.setBounds(938, 237, 268, 89);
		contentPane.add(btnSaleButton_1);
	}

}
