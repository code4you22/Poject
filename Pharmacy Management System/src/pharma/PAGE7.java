package pharma;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;

public class PAGE7 {

	private JFrame frame;
	private JTextField textFieldsid;
	private JTextField textFieldname;
	private JTextField textFieldaddress;
	private JTextField textFieldphn;
	private JTextField textFieldfaxnu;
	private JTextField textFieldemail;
	private JTextField textFielddebit;
	private JTextField textFieldcredit;

	/**
	 * Launch the application.
	 */
	public void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PAGE7 window = new PAGE7();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */Connection connec=null;
	public PAGE7() {
		initialize();
		connec=Sqlite_Connec.dbConnector();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(0, 0, 800, 600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		JLabel lblNewLabel = new JLabel("PHARMACY MANAGEMENT SYSTEM");
		lblNewLabel.setBounds(0, 0, 1184, 48);
		lblNewLabel.setFont(new Font("Dialog", Font.BOLD, 36));
		frame.getContentPane().add(lblNewLabel);
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBounds(0, 52, 691, 48);
		menuBar.setToolTipText("");
		frame.getContentPane().add(menuBar);
		
		JMenu menu = new JMenu("");
		menuBar.add(menu);
		
		JMenu mnMaster = new JMenu("MASTER");
		menuBar.add(mnMaster);
		
		JButton btnNewButton_4 = new JButton("MEDICAL STORE");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				frame.dispose();
				PAGE2 pa1=new PAGE2();
				pa1.main(null);
				pa1.getClass();
			}
		});
		mnMaster.add(btnNewButton_4);
		
		JButton btnGeneralStore = new JButton("GENERAL STORE");
		btnGeneralStore.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				frame.dispose();
				PAGE2 pa1=new PAGE2();
				pa1.main(null);
				pa1.getClass();
				}
		});
		mnMaster.add(btnGeneralStore);
		
		JMenu mnNewMenu = new JMenu("TRANSACTIONS");
		menuBar.add(mnNewMenu);
		
		JMenu mnSales = new JMenu("SALES");
		mnNewMenu.add(mnSales);
		
		JButton btnSalesRecord = new JButton("SALE'S RECORD");
		btnSalesRecord.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				  frame.dispose();
				   PAGE4 page4=new PAGE4();
				   page4.main(null);
				   page4.getClass();
			}
		});
		mnSales.add(btnSalesRecord);
		
		JButton btnEditSales = new JButton("EDIT SALE'S");
		btnEditSales.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				  frame.dispose();
				   PAGE9 page9=new PAGE9();
				   page9.main(null);
				   page9.getClass();
			}
		});
		mnSales.add(btnEditSales);
		
		JMenu mnNewMenu_3 = new JMenu("PURCHASE");
		mnNewMenu.add(mnNewMenu_3);
		
		JButton btnPurchaseRecord = new JButton("PURCHASE RECORD");
		btnPurchaseRecord.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				 frame.dispose();
				   PAGE6 page6=new PAGE6();
				   page6.main(null);
				   page6.getClass();
			}
		});
		mnNewMenu_3.add(btnPurchaseRecord);
		
		JButton btnEditPurchase = new JButton("EDIT PURCHASE");
		btnEditPurchase.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				 frame.dispose();
				   page8 PAGE8=new page8();
				   PAGE8.main(null);
				   PAGE8.getClass();
			}
		});
		mnNewMenu_3.add(btnEditPurchase);
		
		JMenu mnNewMenu_1 = new JMenu("STOCK");
		menuBar.add(mnNewMenu_1);
		
		JButton btnNewButton_5 = new JButton("OPENING STOCK");
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				frame.dispose();
				PAGE5 page5=new PAGE5();
				page5.main(null);
				page5.getClass();
			}
		});
		mnNewMenu_1.add(btnNewButton_5);
		
		JButton btnEditStock = new JButton("EDIT STOCK");
		btnEditStock.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				frame.dispose();
				PAGE12 page12=new PAGE12();
				page12.main(null);
				page12.getClass();
			}
		});
		mnNewMenu_1.add(btnEditStock);
		
		JMenu mnNewMenu_2 = new JMenu("RECORD");
		menuBar.add(mnNewMenu_2);
		
		JMenu mnNewMenu_4 = new JMenu("CUSTOMER INFORMATION");
		mnNewMenu_2.add(mnNewMenu_4);
		
		JButton btnSuppliersDetail = new JButton("SUPPLIER'S DETAIL");
		btnSuppliersDetail.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				frame.dispose();
				PAGE12 page12=new PAGE12();
				page12.main(null);
				page12.getClass();
			}
		});
		mnNewMenu_4.add(btnSuppliersDetail);
		
		JButton btnBuyersDetail = new JButton("BUYER'S DETAIL");
		btnBuyersDetail.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				   frame.dispose();
					PAGE3 page3=new PAGE3();
				    page3.main(null);
				    page3.getClass();
			}
		});
		mnNewMenu_4.add(btnBuyersDetail);
		
		JButton btnProductInformation = new JButton("PRODUCT INFORMATION");
		btnProductInformation.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				frame.dispose();
				PAGE10 page10=new PAGE10();
				page10.main(null);
				page10.getClass();
			}
		});
		mnNewMenu_2.add(btnProductInformation);
		
		JButton btnOldData = new JButton("OLD DATA");
		btnOldData.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				frame.dispose();
				PAGE11 page11=new PAGE11();
				page11.main(null);
				page11.getClass();
			}
		});
		mnNewMenu_2.add(btnOldData);
		
		JButton btnExit = new JButton("EXIT");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.exit(JFrame.EXIT_ON_CLOSE);
			}
		});
		menuBar.add(btnExit);
		
		JPanel panel = new JPanel();
		panel.setBounds(10, 212, 556, 342);
		panel.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(21, 11, 525, 320);
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel_2 = new JLabel("SULLPIERS  ID");
		lblNewLabel_2.setBounds(10, 58, 83, 14);
		panel_1.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("NAME");
		lblNewLabel_3.setBounds(10, 100, 83, 14);
		panel_1.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("ADDRESS");
		lblNewLabel_4.setBounds(10, 146, 83, 14);
		panel_1.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("PHONE NU.");
		lblNewLabel_5.setBounds(10, 198, 83, 14);
		panel_1.add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("FAX NU.");
		lblNewLabel_6.setBounds(10, 242, 83, 14);
		panel_1.add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("E-MAIL");
		lblNewLabel_7.setBounds(10, 296, 83, 14);
		panel_1.add(lblNewLabel_7);
		
		textFieldsid = new JTextField();
		textFieldsid.setBounds(174, 55, 86, 20);
		panel_1.add(textFieldsid);
		textFieldsid.setColumns(10);
		
		textFieldname = new JTextField();
		textFieldname.setBounds(174, 100, 86, 20);
		panel_1.add(textFieldname);
		textFieldname.setColumns(10);
		
		textFieldaddress = new JTextField();
		textFieldaddress.setBounds(174, 143, 86, 20);
		panel_1.add(textFieldaddress);
		textFieldaddress.setColumns(10);
		
		textFieldphn = new JTextField();
		textFieldphn.setBounds(174, 195, 86, 20);
		panel_1.add(textFieldphn);
		textFieldphn.setColumns(10);
		
		textFieldfaxnu = new JTextField();
		textFieldfaxnu.setBounds(174, 239, 86, 20);
		panel_1.add(textFieldfaxnu);
		textFieldfaxnu.setColumns(10);
		
		textFieldemail = new JTextField();
		textFieldemail.setBounds(174, 293, 86, 20);
		panel_1.add(textFieldemail);
		textFieldemail.setColumns(10);
		
		JLabel lblNewLabel_8 = new JLabel("BASIC INFORMATION");
		lblNewLabel_8.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_8.setBounds(73, 11, 141, 14);
		panel_1.add(lblNewLabel_8);
		
		JLabel lblNewLabel_9 = new JLabel("ACCOUNT INFORMATION");
		lblNewLabel_9.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_9.setBounds(339, 11, 155, 14);
		panel_1.add(lblNewLabel_9);
		
		JLabel lblNewLabel_10 = new JLabel("DEBIT");
		lblNewLabel_10.setBounds(321, 58, 46, 14);
		panel_1.add(lblNewLabel_10);
		
		JLabel lblNewLabel_11 = new JLabel("CREDIT");
		lblNewLabel_11.setBounds(321, 146, 46, 14);
		panel_1.add(lblNewLabel_11);
		
		textFielddebit = new JTextField();
		textFielddebit.setBounds(408, 55, 86, 20);
		panel_1.add(textFielddebit);
		textFielddebit.setColumns(10);
		
		textFieldcredit = new JTextField();
		textFieldcredit.setBounds(408, 143, 86, 20);
		panel_1.add(textFieldcredit);
		textFieldcredit.setColumns(10);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBounds(576, 212, 181, 323);
		panel_4.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		frame.getContentPane().add(panel_4);
		panel_4.setLayout(null);
		
		JButton btnNewButton = new JButton("SAVE");
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try{
					String query="insert into supplier_detail(sid,name,address,phn,faxnu,email,debit,credit) values(?,?,?,?,?,?,?,?)";
					PreparedStatement pst=connec.prepareStatement(query);	
					pst.setString(1,textFieldsid.getText() );
					pst.setString(2,textFieldname.getText() );
					pst.setString(3,textFieldaddress.getText() );
				    pst.setString(4,textFieldphn.getText()  );
					pst.setString(5,textFieldfaxnu.getText() );
					pst.setString(6,textFieldemail.getText() );
					pst.setString(7,textFielddebit.getText() );
					pst.setString(8,textFieldcredit.getText()  );
					pst.execute();
					JOptionPane.showMessageDialog(null, "Data Entered");
					pst.close();
				}catch(Exception e)
				{
					JOptionPane.showMessageDialog(null, "Error Occured");
					e.printStackTrace();
				}
			}
		});
		btnNewButton.setBounds(21, 56, 89, 23);
		panel_4.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("DELETE");
		btnNewButton_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try
				{
					String query="delete from supplier_detail where sid='"+textFieldsid.getText()+"' ";
					PreparedStatement pst=connec.prepareStatement(query);
					pst.execute();
					JOptionPane.showMessageDialog(null, "Deleted");
					pst.close();
				}
				catch(Exception ex)
				{
				JOptionPane.showMessageDialog(null, "error in deleting");
				ex.printStackTrace();
				}
			}
		});
		btnNewButton_1.setBounds(21, 206, 89, 23);
		panel_4.add(btnNewButton_1);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(186, 166, 399, 43);
		panel_2.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		frame.getContentPane().add(panel_2);
		
		JLabel lblNewLabel_1 = new JLabel("SUPPLIER DETAIL");
		panel_2.add(lblNewLabel_1);
		lblNewLabel_1.setFont(new Font("Dialog", Font.BOLD, 24));
		
		

	}
}
