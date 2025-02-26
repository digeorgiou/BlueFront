package blueapp;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.ImageIcon;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class CustomersPage extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTable table;
	private DefaultTableModel model = new DefaultTableModel();
	private JTextField textFieldCustomerSearch;

	
	public CustomersPage() {
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
				"Κωδικός", "Επώνυμο", "Όνομα", "Τηλέφωνο" 
			}
		));
		table.setBounds(57, 192, 659, 420);
		model = (DefaultTableModel) table.getModel();
		
		JScrollPane scrollPaneCustomers = new JScrollPane(table);
		scrollPaneCustomers.setBounds(255, 201, 659, 420);
		contentPane.add(scrollPaneCustomers);
		
		textFieldCustomerSearch = new JTextField();
		textFieldCustomerSearch.setBounds(255, 123, 335, 51);
		contentPane.add(textFieldCustomerSearch);
		textFieldCustomerSearch.setColumns(10);
		
		JButton btnCustomerSearch = new JButton("Αναζήτηση");
		btnCustomerSearch.setBackground(new Color(32, 45, 64));
		btnCustomerSearch.setForeground(new Color(255, 255, 255));
		btnCustomerSearch.setBounds(625, 124, 243, 49);
		contentPane.add(btnCustomerSearch);
		
		JPanel header = new JPanel();
		header.setLayout(null);
		header.setBackground(new Color(32, 45, 64));
		header.setBounds(0, 0, 1256, 82);
		contentPane.add(header);
		
		JLabel lblLogo = new JLabel("");
		lblLogo.setIcon(new ImageIcon(CustomersPage.class.getResource("/images/bluelogo-small.png")));
		lblLogo.setBounds(0, 0, 103, 82);
		header.add(lblLogo);
		
		JLabel lblCustomers = new JLabel("ΠΕΛΑΤΕΣ");
		lblCustomers.setForeground(Color.WHITE);
		lblCustomers.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblCustomers.setBounds(583, 25, 90, 31);
		header.add(lblCustomers);
		
		JPanel footer = new JPanel();
		footer.setLayout(null);
		footer.setBackground(new Color(32, 45, 64));
		footer.setBounds(0, 632, 1232, 99);
		contentPane.add(footer);
		
		JButton btnAddCustomer = new JButton("Προσθήκη Πελάτη");
		btnAddCustomer.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				Main.getCustomersPage().setVisible(false);
				Main.getAddCustomerPage().setVisible(true);
			}
		});
		btnAddCustomer.setForeground(Color.WHITE);
		btnAddCustomer.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnAddCustomer.setBackground(new Color(0, 128, 0));
		btnAddCustomer.setBounds(27, 221, 181, 105);
		contentPane.add(btnAddCustomer);
		
		JButton btnUpdateCustomer = new JButton("Επεξεργασία Πελάτη");
		btnUpdateCustomer.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Main.getCustomersPage().setVisible(false);
				Main.getUpdateCustomerPage().setVisible(true);
			}
		});
		btnUpdateCustomer.setForeground(Color.WHITE);
		btnUpdateCustomer.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnUpdateCustomer.setBackground(new Color(32, 45, 64));
		btnUpdateCustomer.setBounds(948, 330, 260, 105);
		contentPane.add(btnUpdateCustomer);
		
		JButton btnReturn = new JButton("Επιστροφή");
		btnReturn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				Main.getCustomersPage().setVisible(false);
				Main.getLandingPage().setVisible(true);
			}
		});
		btnReturn.setForeground(Color.WHITE);
		btnReturn.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnReturn.setBackground(new Color(32, 45, 64));
		btnReturn.setBounds(27, 480, 181, 94);
		contentPane.add(btnReturn);
		
		JButton btnShowCustomerInfo = new JButton("Προβολή Στοιχείων");
		btnShowCustomerInfo.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e){
				Main.getCustomersPage().setVisible(false);
				Main.getCustomerViewPage().setVisible(true);
			}
		});
		btnShowCustomerInfo.setForeground(Color.WHITE);
		btnShowCustomerInfo.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnShowCustomerInfo.setBackground(new Color(32, 45, 64));
		btnShowCustomerInfo.setBounds(948, 480, 260, 105);
		contentPane.add(btnShowCustomerInfo);
		
		JButton btnShowCustomerHistory = new JButton("Προβολή Ιστορικού");
		btnShowCustomerHistory.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				Main.getCustomersPage().setVisible(false);
				Main.getCustomerStatsPage().setVisible(true);
			}
		});
		btnShowCustomerHistory.setForeground(Color.WHITE);
		btnShowCustomerHistory.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnShowCustomerHistory.setBackground(new Color(32, 45, 64));
		btnShowCustomerHistory.setBounds(948, 189, 260, 105);
		contentPane.add(btnShowCustomerHistory);
	}
}
