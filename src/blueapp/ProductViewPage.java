package blueapp;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ProductViewPage extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	
	public ProductViewPage() {
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
		
		JLabel lblNewLabel_2 = new JLabel("ΠΡΟΒΟΛΗ ΣΤΟΙΧΕΙΩΝ ΠΡΟΙΟΝΤΟΣ");
		lblNewLabel_2.setForeground(Color.WHITE);
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_2.setBounds(496, 25, 320, 31);
		header.add(lblNewLabel_2);
		
		JLabel lblLogo = new JLabel("");
		lblLogo.setIcon(new ImageIcon(ProductViewPage.class.getResource("/images/bluelogo-small.png")));
		lblLogo.setBounds(0, 0, 103, 82);
		header.add(lblLogo);
		
		JPanel footer = new JPanel();
		footer.setLayout(null);
		footer.setBackground(new Color(32, 45, 64));
		footer.setBounds(0, 632, 1232, 99);
		contentPane.add(footer);
		
		JLabel lblFirstname = new JLabel("Κωδικός Προϊόντος");
		lblFirstname.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblFirstname.setBounds(192, 148, 138, 34);
		contentPane.add(lblFirstname);
		
		JLabel lblLastname = new JLabel("Όνομα");
		lblLastname.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblLastname.setBounds(192, 226, 122, 34);
		contentPane.add(lblLastname);
		
		JLabel lblPhoneNumber = new JLabel("Υλικό");
		lblPhoneNumber.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblPhoneNumber.setBounds(192, 298, 83, 34);
		contentPane.add(lblPhoneNumber);
		
		JLabel lblAddress = new JLabel("Βάρος (γρ.)");
		lblAddress.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblAddress.setBounds(192, 375, 96, 34);
		contentPane.add(lblAddress);
		
		JLabel lblVAT = new JLabel("Κατηγορία");
		lblVAT.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblVAT.setBounds(663, 148, 109, 34);
		contentPane.add(lblVAT);
		
		JLabel lblDOY = new JLabel("Τιμή");
		lblDOY.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblDOY.setBounds(663, 212, 109, 34);
		contentPane.add(lblDOY);
		
		JLabel lblSpecificFirstname = new JLabel("Κωδικός Προϊόντος");
		lblSpecificFirstname.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblSpecificFirstname.setBounds(373, 155, 194, 22);
		contentPane.add(lblSpecificFirstname);
		
		JLabel lblSpecificLastname = new JLabel("Όνομα");
		lblSpecificLastname.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblSpecificLastname.setBounds(373, 233, 194, 22);
		contentPane.add(lblSpecificLastname);
		
		JLabel lblSpecificPhoneNumber = new JLabel("Υλικό");
		lblSpecificPhoneNumber.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblSpecificPhoneNumber.setBounds(373, 305, 83, 22);
		contentPane.add(lblSpecificPhoneNumber);
		
		JLabel lblSpecificAddress = new JLabel("Βάρος (γρ.)");
		lblSpecificAddress.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblSpecificAddress.setBounds(373, 382, 194, 22);
		contentPane.add(lblSpecificAddress);
		
		JLabel lblSpecificVAT = new JLabel("Κατηγορία");
		lblSpecificVAT.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblSpecificVAT.setBounds(808, 155, 194, 22);
		contentPane.add(lblSpecificVAT);
		
		JLabel lblSpecificDOY = new JLabel("Τιμή");
		lblSpecificDOY.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblSpecificDOY.setBounds(808, 219, 194, 22);
		contentPane.add(lblSpecificDOY);
		
		JButton btnReturn = new JButton("Επιστροφή");
		btnReturn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Main.getProductViewPage().setVisible(false);
				Main.getProductsPage().setVisible(true);
			}
		});
		btnReturn.setForeground(Color.WHITE);
		btnReturn.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnReturn.setBackground(new Color(32, 45, 64));
		btnReturn.setBounds(455, 493, 262, 82);
		contentPane.add(btnReturn);
		
		JLabel lblDOY_1 = new JLabel("Χρόνος (λεπτά)");
		lblDOY_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblDOY_1.setBounds(663, 267, 109, 34);
		contentPane.add(lblDOY_1);
		
		JLabel lblDOY_2 = new JLabel("Κόστος");
		lblDOY_2.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblDOY_2.setBounds(663, 323, 109, 34);
		contentPane.add(lblDOY_2);
		
		JLabel lblDOY_3 = new JLabel("Απόθεμα");
		lblDOY_3.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblDOY_3.setBounds(663, 375, 109, 34);
		contentPane.add(lblDOY_3);
		
		JLabel lblSpecificDOY_1 = new JLabel("Χρόνος (λεπτά)");
		lblSpecificDOY_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblSpecificDOY_1.setBounds(808, 274, 194, 22);
		contentPane.add(lblSpecificDOY_1);
		
		JLabel lblSpecificDOY_2 = new JLabel("Κόστος");
		lblSpecificDOY_2.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblSpecificDOY_2.setBounds(808, 330, 194, 22);
		contentPane.add(lblSpecificDOY_2);
		
		JLabel lblSpecificDOY_2_1 = new JLabel("Απόθεμα");
		lblSpecificDOY_2_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblSpecificDOY_2_1.setBounds(808, 382, 194, 22);
		contentPane.add(lblSpecificDOY_2_1);
	}

}
