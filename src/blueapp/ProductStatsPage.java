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
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ProductStatsPage extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;


	public ProductStatsPage() {
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
		lblLogo.setIcon(new ImageIcon(ProductStatsPage.class.getResource("/images/bluelogo-small.png")));
		lblLogo.setBounds(0, 0, 103, 82);
		header.add(lblLogo);
		
		JLabel lblProductSalesStats = new JLabel("ΣΤΑΤΙΣΤΙΚΑ ΠΩΛΗΣΕΩΝ ΠΡΟΙΟΝΤΟΣ");
		lblProductSalesStats.setForeground(Color.WHITE);
		lblProductSalesStats.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblProductSalesStats.setBounds(490, 25, 316, 31);
		header.add(lblProductSalesStats);
		
		JPanel footer = new JPanel();
		footer.setLayout(null);
		footer.setBackground(new Color(32, 45, 64));
		footer.setBounds(0, 632, 1232, 99);
		contentPane.add(footer);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(1008, 174, 182, 37);
		contentPane.add(textField);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(1008, 276, 182, 37);
		contentPane.add(textField_1);
		
		JButton btnReturn = new JButton("Προβολή");
		btnReturn.setForeground(Color.WHITE);
		btnReturn.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnReturn.setBackground(new Color(0, 128, 0));
		btnReturn.setBounds(1007, 481, 158, 89);
		contentPane.add(btnReturn);
		
		JLabel lblDateFrom = new JLabel("Από : ");
		lblDateFrom.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblDateFrom.setBounds(1008, 144, 100, 20);
		contentPane.add(lblDateFrom);
		
		JLabel lblDateTo = new JLabel("Έως : ");
		lblDateTo.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblDateTo.setBounds(1008, 243, 100, 20);
		contentPane.add(lblDateTo);
		
		JScrollPane scrollPaneCustomerSales = new JScrollPane((Component) null);
		scrollPaneCustomerSales.setBounds(282, 144, 668, 462);
		contentPane.add(scrollPaneCustomerSales);
		
		JLabel lblCustomerSales = new JLabel("ΠΩΛΗΣΕΙΣ ΠΡΟΙΟΝΤΟΣ");
		lblCustomerSales.setFont(new Font("Tahoma", Font.BOLD, 24));
		lblCustomerSales.setBounds(466, 90, 299, 43);
		contentPane.add(lblCustomerSales);
		
		JButton btnReturn_1 = new JButton("Επιστροφή");
		btnReturn_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Main.getProductStatsPage().setVisible(false);
				Main.getProductsPage().setVisible(true);
			}
		});
		btnReturn_1.setForeground(Color.WHITE);
		btnReturn_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnReturn_1.setBackground(new Color(32, 45, 64));
		btnReturn_1.setBounds(50, 481, 158, 89);
		contentPane.add(btnReturn_1);
	}
}
