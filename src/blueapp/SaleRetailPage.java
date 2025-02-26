package blueapp;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.JScrollPane;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JTable;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JComboBox;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;

public class SaleRetailPage extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTable table;
	private DefaultTableModel model = new DefaultTableModel();
	private JTextField textField;

	
	public SaleRetailPage() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1246, 768);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		table = new JTable();
		
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"Κωδικός", "Προϊόν","Τιμή" 
			}
		));
		table.setBounds(57, 192, 635, 285);
		model = (DefaultTableModel) table.getModel();
		
		JScrollPane scrollPaneShoppingCart = new JScrollPane(table);
		scrollPaneShoppingCart.setBounds(225, 291, 635, 285);
		contentPane.add(scrollPaneShoppingCart);
		
		JPanel header = new JPanel();
		header.setLayout(null);
		header.setBackground(new Color(32, 45, 64));
		header.setBounds(0, 0, 1256, 82);
		contentPane.add(header);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(SaleRetailPage.class.getResource("/images/bluelogo-small.png")));
		lblNewLabel.setBounds(0, 0, 101, 82);
		header.add(lblNewLabel);
		
		JLabel lblNewLabel_2 = new JLabel("ΠΩΛΗΣΗ");
		lblNewLabel_2.setForeground(Color.WHITE);
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_2.setBounds(586, 19, 84, 44);
		header.add(lblNewLabel_2);
		
		JPanel footer = new JPanel();
		footer.setLayout(null);
		footer.setBackground(new Color(32, 45, 64));
		footer.setBounds(0, 645, 1232, 99);
		contentPane.add(footer);
		
		JButton btnSaleButton = new JButton("Καταχώρηση Πώλησης");
		btnSaleButton.setBackground(new Color(0, 128, 0));
		btnSaleButton.setForeground(new Color(255, 255, 255));
		btnSaleButton.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnSaleButton.setBounds(923, 485, 274, 89);
		contentPane.add(btnSaleButton);
		
		JButton btnRestoreButton = new JButton("Επαναφορά");
		btnRestoreButton.setForeground(Color.WHITE);
		btnRestoreButton.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnRestoreButton.setBackground(new Color(255, 128, 0));
		btnRestoreButton.setBounds(923, 369, 274, 89);
		contentPane.add(btnRestoreButton);
		
		JButton btnReturnButton = new JButton("Επιστροφή");
		btnReturnButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Main.getSaleRetailPage().setVisible(false);
				Main.getLandingPage().setVisible(true);			
				}
		});
		btnReturnButton.setForeground(Color.WHITE);
		btnReturnButton.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnReturnButton.setBackground(new Color(0, 128, 0));
		btnReturnButton.setBounds(32, 485, 158, 89);
		contentPane.add(btnReturnButton);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(929, 169, 255, 37);
		contentPane.add(comboBox);
		
		JLabel lblCustomer = new JLabel("ΠΕΛΑΤΗΣ");
		lblCustomer.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblCustomer.setBounds(931, 136, 250, 27);
		contentPane.add(lblCustomer);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setBounds(929, 253, 255, 37);
		contentPane.add(comboBox_1);
		
		JLabel lblPaymentMethod = new JLabel("ΤΡΟΠΟΣ ΠΛΗΡΩΜΗΣ");
		lblPaymentMethod.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblPaymentMethod.setBounds(931, 217, 250, 27);
		contentPane.add(lblPaymentMethod);
		
		JLabel lblproduct = new JLabel("Προϊόν");
		lblproduct.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblproduct.setBounds(134, 164, 128, 37);
		contentPane.add(lblproduct);
		
		textField = new JTextField();
		textField.setBounds(216, 161, 276, 45);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JButton btnSearchProduct = new JButton("Αναζήτηση");
		btnSearchProduct.setForeground(new Color(255, 255, 255));
		btnSearchProduct.setBackground(new Color(32, 54, 64));
		btnSearchProduct.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnSearchProduct.setBounds(519, 156, 164, 56);
		contentPane.add(btnSearchProduct);
		
		JButton btnAddProductToCart = new JButton("Προσθήκη");
		btnAddProductToCart.setForeground(Color.WHITE);
		btnAddProductToCart.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnAddProductToCart.setBackground(new Color(32, 54, 64));
		btnAddProductToCart.setBounds(704, 156, 164, 56);
		contentPane.add(btnAddProductToCart);
		
		JLabel lblCart = new JLabel("Καλάθι");
		lblCart.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblCart.setBounds(478, 249, 80, 37);
		contentPane.add(lblCart);
	}
}
