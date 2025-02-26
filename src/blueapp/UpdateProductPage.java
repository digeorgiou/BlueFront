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
import javax.swing.JComboBox;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class UpdateProductPage extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;


	public UpdateProductPage() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1246, 768);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel header = new JPanel();
		header.setLayout(null);
		header.setBackground(new Color(32, 45, 64));
		header.setBounds(0, 0, 1232, 82);
		contentPane.add(header);
		
		JLabel lblLogo = new JLabel("");
		lblLogo.setIcon(new ImageIcon(UpdateProductPage.class.getResource("/images/bluelogo-small.png")));
		lblLogo.setBounds(0, 0, 99, 82);
		header.add(lblLogo);
		
		JLabel lblUpdateProduct = new JLabel("ΕΠΕΞΕΡΓΑΣΙΑ ΠΡΟΙΟΝΤΟΣ");
		lblUpdateProduct.setForeground(Color.WHITE);
		lblUpdateProduct.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblUpdateProduct.setBounds(499, 25, 258, 31);
		header.add(lblUpdateProduct);
		
		JPanel footer = new JPanel();
		footer.setLayout(null);
		footer.setBackground(new Color(32, 45, 64));
		footer.setBounds(0, 632, 1232, 99);
		contentPane.add(footer);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(350, 130, 220, 42);
		contentPane.add(textField);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(350, 214, 220, 42);
		contentPane.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(350, 388, 220, 42);
		contentPane.add(textField_2);
		
		JLabel lblProductId = new JLabel("Κωδικός Προϊόντος");
		lblProductId.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblProductId.setBounds(176, 128, 149, 34);
		contentPane.add(lblProductId);
		
		JLabel lblProductName = new JLabel("Όνομα");
		lblProductName.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblProductName.setBounds(176, 212, 149, 34);
		contentPane.add(lblProductName);
		
		JLabel lblMaterial = new JLabel("Υλικό");
		lblMaterial.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblMaterial.setBounds(176, 301, 149, 34);
		contentPane.add(lblMaterial);
		
		JLabel lblWeight = new JLabel("Βάρος (γρ.)");
		lblWeight.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblWeight.setBounds(176, 386, 149, 34);
		contentPane.add(lblWeight);
		
		JButton btnReturn = new JButton("Επιστροφή");
		btnReturn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Main.getUpdateProductPage().setVisible(false);
				Main.getProductsPage().setVisible(true);
			}
		});
		btnReturn.setForeground(Color.WHITE);
		btnReturn.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnReturn.setBackground(new Color(32, 45, 64));
		btnReturn.setBounds(350, 492, 262, 82);
		contentPane.add(btnReturn);
		
		JButton btnSave = new JButton("Αποθήκευση");
		btnSave.setForeground(Color.WHITE);
		btnSave.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnSave.setBackground(new Color(0, 128, 64));
		btnSave.setBounds(724, 492, 262, 82);
		contentPane.add(btnSave);
		
		JLabel lblCategory = new JLabel("Κατηγορία");
		lblCategory.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblCategory.setBounds(711, 127, 89, 34);
		contentPane.add(lblCategory);
		
		JComboBox comboBoxCategory = new JComboBox();
		comboBoxCategory.setBounds(845, 133, 238, 37);
		contentPane.add(comboBoxCategory);
		
		JLabel lblPrice = new JLabel("Τιμή");
		lblPrice.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblPrice.setBounds(711, 193, 89, 34);
		contentPane.add(lblPrice);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(845, 194, 238, 37);
		contentPane.add(textField_3);
		
		JLabel lblCost = new JLabel("Κόστος");
		lblCost.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblCost.setBounds(711, 331, 89, 34);
		contentPane.add(lblCost);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(845, 257, 238, 37);
		contentPane.add(textField_4);
		
		JLabel lblTimeToMake = new JLabel("Χρόνος (λεπτά)");
		lblTimeToMake.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblTimeToMake.setBounds(677, 256, 123, 34);
		contentPane.add(lblTimeToMake);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(845, 332, 238, 37);
		contentPane.add(textField_5);
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		textField_6.setBounds(845, 395, 238, 37);
		contentPane.add(textField_6);
		
		JLabel lblStock = new JLabel("Απόθεμα");
		lblStock.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblStock.setBounds(711, 398, 89, 34);
		contentPane.add(lblStock);
		
		JComboBox comboBoxMaterial = new JComboBox();
		comboBoxMaterial.setBounds(350, 301, 220, 42);
		contentPane.add(comboBoxMaterial);
	}
}
