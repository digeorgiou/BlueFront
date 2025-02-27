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

public class ProductInsertPage extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textFieldProductId;
	private JTextField textFieldProductName;
	private JTextField textFieldWeight;
	private JTextField textFieldPrice;
	private JTextField textFieldTimeToMake;
	private JTextField textFieldCost;
	private JTextField textFieldStock;
	private JTextField textFieldMaterial;
	private JTextField textFieldCategory;

	public ProductInsertPage() {
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
		
		JLabel lblLogo = new JLabel("");
		lblLogo.setIcon(new ImageIcon(ProductInsertPage.class.getResource("/images/bluelogo-small.png")));
		lblLogo.setBounds(0, 0, 99, 82);
		header.add(lblLogo);
		
		JLabel lblAddNewProduct = new JLabel("ΠΡΟΣΘΗΚΗ ΝΕΟΥ ΠΡΟΙΟΝΤΟΣ");
		lblAddNewProduct.setForeground(Color.WHITE);
		lblAddNewProduct.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblAddNewProduct.setBounds(499, 25, 258, 31);
		header.add(lblAddNewProduct);
		
		JPanel footer = new JPanel();
		footer.setLayout(null);
		footer.setBackground(new Color(32, 45, 64));
		footer.setBounds(0, 632, 1232, 99);
		contentPane.add(footer);
		
		textFieldProductId = new JTextField();
		textFieldProductId.setColumns(10);
		textFieldProductId.setBounds(368, 131, 220, 42);
		contentPane.add(textFieldProductId);
		
		textFieldProductName = new JTextField();
		textFieldProductName.setColumns(10);
		textFieldProductName.setBounds(368, 219, 220, 42);
		contentPane.add(textFieldProductName);
		
		textFieldWeight = new JTextField();
		textFieldWeight.setColumns(10);
		textFieldWeight.setBounds(368, 393, 220, 42);
		contentPane.add(textFieldWeight);
		
		JLabel lblProductId = new JLabel("Κωδικός Προϊόντος");
		lblProductId.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblProductId.setBounds(165, 133, 149, 34);
		contentPane.add(lblProductId);
		
		JLabel lblProductName = new JLabel("Όνομα");
		lblProductName.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblProductName.setBounds(258, 217, 56, 34);
		contentPane.add(lblProductName);
		
		JLabel lblMaterial = new JLabel("Υλικό");
		lblMaterial.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblMaterial.setBounds(268, 306, 46, 34);
		contentPane.add(lblMaterial);
		
		JLabel lblWeight = new JLabel("Βάρος (γρ.)");
		lblWeight.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblWeight.setBounds(221, 395, 93, 34);
		contentPane.add(lblWeight);
		
		JButton btnReturn = new JButton("Επιστροφή");
		btnReturn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Main.getProductInsertPage().setVisible(false);
				Main.getProductsPage().setVisible(true);
			}
		});
		btnReturn.setForeground(Color.WHITE);
		btnReturn.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnReturn.setBackground(new Color(32, 45, 64));
		btnReturn.setBounds(236, 497, 262, 82);
		contentPane.add(btnReturn);
		
		JButton btnSave = new JButton("Αποθήκευση");
		btnSave.setForeground(Color.WHITE);
		btnSave.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnSave.setBackground(new Color(0, 128, 64));
		btnSave.setBounds(734, 497, 262, 82);
		contentPane.add(btnSave);
		
		JLabel lblCategory = new JLabel("Κατηγορία");
		lblCategory.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblCategory.setBounds(700, 132, 78, 34);
		contentPane.add(lblCategory);
		
		JLabel lblPrice = new JLabel("Τιμή");
		lblPrice.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblPrice.setBounds(747, 198, 31, 34);
		contentPane.add(lblPrice);
		
		textFieldPrice = new JTextField();
		textFieldPrice.setColumns(10);
		textFieldPrice.setBounds(834, 199, 238, 37);
		contentPane.add(textFieldPrice);
		
		JLabel lblCost = new JLabel("Κόστος");
		lblCost.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblCost.setBounds(722, 336, 56, 34);
		contentPane.add(lblCost);
		
		textFieldTimeToMake = new JTextField();
		textFieldTimeToMake.setColumns(10);
		textFieldTimeToMake.setBounds(834, 262, 238, 37);
		contentPane.add(textFieldTimeToMake);
		
		JLabel lblTimeToMake = new JLabel("Χρόνος (λεπτά)");
		lblTimeToMake.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblTimeToMake.setBounds(669, 261, 109, 34);
		contentPane.add(lblTimeToMake);
		
		textFieldCost = new JTextField();
		textFieldCost.setColumns(10);
		textFieldCost.setBounds(834, 337, 238, 37);
		contentPane.add(textFieldCost);
		
		textFieldStock = new JTextField();
		textFieldStock.setColumns(10);
		textFieldStock.setBounds(834, 400, 238, 37);
		contentPane.add(textFieldStock);
		
		JLabel lblStock = new JLabel("Απόθεμα");
		lblStock.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblStock.setBounds(712, 403, 66, 34);
		contentPane.add(lblStock);
		
		textFieldMaterial = new JTextField();
		textFieldMaterial.setColumns(10);
		textFieldMaterial.setBounds(368, 298, 220, 42);
		contentPane.add(textFieldMaterial);
		
		textFieldCategory = new JTextField();
		textFieldCategory.setColumns(10);
		textFieldCategory.setBounds(834, 125, 238, 42);
		contentPane.add(textFieldCategory);
	}
}
