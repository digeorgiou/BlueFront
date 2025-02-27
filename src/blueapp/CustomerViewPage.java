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

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class CustomerViewPage extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	
	public CustomerViewPage() {
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
		
		JLabel lblNewLabel_2 = new JLabel("ΠΡΟΒΟΛΗ ΣΤΟΙΧΕΙΩΝ ΠΕΛΑΤΗ");
		lblNewLabel_2.setForeground(Color.WHITE);
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_2.setBounds(496, 25, 264, 31);
		header.add(lblNewLabel_2);
		
		JLabel lblLogo = new JLabel("");
		lblLogo.setIcon(new ImageIcon(CustomerViewPage.class.getResource("/images/bluelogo-small.png")));
		lblLogo.setBounds(0, 0, 103, 82);
		header.add(lblLogo);
		
		JPanel footer = new JPanel();
		footer.setLayout(null);
		footer.setBackground(new Color(32, 45, 64));
		footer.setBounds(0, 632, 1232, 99);
		contentPane.add(footer);
		
		JLabel lblFirstname = new JLabel("Όνομα");
		lblFirstname.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblFirstname.setBounds(297, 141, 54, 34);
		contentPane.add(lblFirstname);
		
		JLabel lblLastname = new JLabel("Επώνυμο");
		lblLastname.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblLastname.setBounds(277, 219, 74, 34);
		contentPane.add(lblLastname);
		
		JLabel lblPhoneNumber = new JLabel("Τηλέφωνο");
		lblPhoneNumber.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblPhoneNumber.setBounds(268, 291, 83, 34);
		contentPane.add(lblPhoneNumber);
		
		JLabel lblAddress = new JLabel("Διεύθυνση");
		lblAddress.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblAddress.setBounds(268, 368, 83, 34);
		contentPane.add(lblAddress);
		
		JLabel lblVAT = new JLabel("ΑΦΜ");
		lblVAT.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblVAT.setBounds(719, 141, 41, 34);
		contentPane.add(lblVAT);
		
		JLabel lblDOY = new JLabel("ΔΟΥ");
		lblDOY.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblDOY.setBounds(719, 206, 41, 34);
		contentPane.add(lblDOY);
		
		JLabel lblSpecificFirstname = new JLabel("Ονομα");
		lblSpecificFirstname.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblSpecificFirstname.setBounds(434, 148, 194, 22);
		contentPane.add(lblSpecificFirstname);
		
		JLabel lblSpecificLastname = new JLabel("Επωνυμο");
		lblSpecificLastname.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblSpecificLastname.setBounds(434, 226, 194, 22);
		contentPane.add(lblSpecificLastname);
		
		JLabel lblSpecificPhoneNumber = new JLabel("Τηλεφωνο");
		lblSpecificPhoneNumber.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblSpecificPhoneNumber.setBounds(434, 298, 83, 22);
		contentPane.add(lblSpecificPhoneNumber);
		
		JLabel lblSpecificAddress = new JLabel("Διεύθυνση");
		lblSpecificAddress.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblSpecificAddress.setBounds(434, 375, 194, 22);
		contentPane.add(lblSpecificAddress);
		
		JLabel lblSpecificVAT = new JLabel("ΑΦΜ");
		lblSpecificVAT.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblSpecificVAT.setBounds(838, 148, 194, 22);
		contentPane.add(lblSpecificVAT);
		
		JLabel lblSpecificDOY = new JLabel("ΔΟΥ");
		lblSpecificDOY.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblSpecificDOY.setBounds(838, 213, 194, 22);
		contentPane.add(lblSpecificDOY);
		
		JButton btnReturn = new JButton("Επιστροφή");
		btnReturn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				Main.getCustomerViewPage().setVisible(false);
				Main.getCustomersPage().setVisible(true);
			}
		});
		btnReturn.setForeground(Color.WHITE);
		btnReturn.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnReturn.setBackground(new Color(32, 45, 64));
		btnReturn.setBounds(485, 486, 262, 82);
		contentPane.add(btnReturn);
	}

}
