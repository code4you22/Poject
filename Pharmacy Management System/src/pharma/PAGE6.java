package pharma;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;

public class PAGE6 {

	private JFrame frame;
	private JTextField textFieldgstin;
	private JTextField textFieldbal;
	private JTextField textFieldtotal;
	private JTextField textFieldvnu;
	private JTextField textFieldremain;
	private JTextField textFieldcurrent;
	private JTextField textFieldname;
	private JTextField textFieldproid;
	private JTextField textFieldmanu;
	private JTextField textField_10;
	private JTextField textFielddate;

	/**
	 * Launch the application.
	 */
	public void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PAGE6 window = new PAGE6();
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
	public PAGE6() {
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
		
		JButton btnMedicalStore = new JButton("MEDICAL STORE");
		btnMedicalStore.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				frame.dispose();
				PAGE2 pa1=new PAGE2();
				pa1.main(null);
				pa1.getClass();
			}
		});
		mnMaster.add(btnMedicalStore);
		
		JButton btnNewButton_4 = new JButton("GENERAL STORE");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				frame.dispose();
				PAGE2 pa1=new PAGE2();
				pa1.main(null);
				pa1.getClass();
			}
		});
		mnMaster.add(btnNewButton_4);
		
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
		
		JButton btnEditRecord = new JButton("EDIT PURCHASE");
		btnEditRecord.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				  frame.dispose();
				   page8 PAGE8=new page8();
				   PAGE8.main(null);
				   PAGE8.getClass();
			}
		});
		mnNewMenu_3.add(btnEditRecord);
		
		JMenu mnNewMenu_1 = new JMenu("STOCK");
		menuBar.add(mnNewMenu_1);
		
		JButton btnOpeningStock = new JButton("OPENING STOCK");
		btnOpeningStock.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				frame.dispose();
				PAGE5 pa5=new PAGE5();
				pa5.main(null);
				pa5.getClass();
			}
		});
		mnNewMenu_1.add(btnOpeningStock);
		
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
		
		JMenu mnNewMenu_5 = new JMenu("CUSTOMER DETAIL");
		mnNewMenu_2.add(mnNewMenu_5);
		
		JButton btnSupplierDetail = new JButton("SUPPLIER DETAIL");
		btnSupplierDetail.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				frame.dispose();
				PAGE12 page12=new PAGE12();
				page12.main(null);
				page12.getClass();
			}
		});
		mnNewMenu_5.add(btnSupplierDetail);
		
		JButton btnBuyerDetail = new JButton("BUYER DETAIL");
		btnBuyerDetail.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				 frame.dispose();
					PAGE3 page3=new PAGE3();
				    page3.main(null);
				    page3.getClass();
			}
		});
		mnNewMenu_5.add(btnBuyerDetail);
		
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
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(10, 231, 471, 323);
		panel_1.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel_2 = new JLabel("TYPE OF PURCHASE");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_2.setBounds(48, 34, 115, 25);
		panel_1.add(lblNewLabel_2);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("MEDICAL STORE");
		rdbtnNewRadioButton.setBounds(6, 66, 125, 23);
		panel_1.add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("GENERAL STORE");
		rdbtnNewRadioButton_1.setBounds(6, 92, 125, 23);
		panel_1.add(rdbtnNewRadioButton_1);
		
		JRadioButton rdbtnNewRadioButton_2 = new JRadioButton("CASH");
		rdbtnNewRadioButton_2.setBounds(133, 66, 109, 23);
		panel_1.add(rdbtnNewRadioButton_2);
		
		JRadioButton rdbtnNewRadioButton_3 = new JRadioButton("CREDIT");
		rdbtnNewRadioButton_3.setBounds(133, 92, 109, 23);
		panel_1.add(rdbtnNewRadioButton_3);
		
		JLabel lblNewLabel_3 = new JLabel("AMOUNT");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_3.setBounds(319, 36, 73, 20);
		panel_1.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("TOTAL");
		lblNewLabel_4.setBounds(268, 68, 63, 19);
		panel_1.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("BALANCE");
		lblNewLabel_5.setBounds(268, 143, 63, 19);
		panel_1.add(lblNewLabel_5);
		
		textFieldbal = new JTextField();
		textFieldbal.setBounds(352, 142, 86, 20);
		panel_1.add(textFieldbal);
		textFieldbal.setColumns(10);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_3.setBounds(10, 139, 232, 173);
		panel_1.add(panel_3);
		panel_3.setLayout(null);
		
		JLabel lblNewLabel_6 = new JLabel("PRODUCT DETAIL");
		lblNewLabel_6.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_6.setBounds(51, 11, 109, 20);
		panel_3.add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("NAME");
		lblNewLabel_7.setBounds(10, 41, 46, 14);
		panel_3.add(lblNewLabel_7);
		
		JLabel lblNewLabel_8 = new JLabel("PRODUCT I.D.");
		lblNewLabel_8.setBounds(10, 77, 95, 14);
		panel_3.add(lblNewLabel_8);
		
		JLabel lblNewLabel_9 = new JLabel("MANUFACTURER");
		lblNewLabel_9.setBounds(10, 111, 101, 14);
		panel_3.add(lblNewLabel_9);
		
		JLabel lblNewLabel_10 = new JLabel("DATE");
		lblNewLabel_10.setBounds(10, 148, 63, 14);
		panel_3.add(lblNewLabel_10);
		
		textFieldname = new JTextField();
		textFieldname.setBounds(115, 42, 86, 20);
		panel_3.add(textFieldname);
		textFieldname.setColumns(10);
		
		textFieldproid = new JTextField();
		textFieldproid.setBounds(115, 74, 86, 20);
		panel_3.add(textFieldproid);
		textFieldproid.setColumns(10);
		
		textFieldmanu = new JTextField();
		textFieldmanu.setBounds(115, 108, 86, 20);
		panel_3.add(textFieldmanu);
		textFieldmanu.setColumns(10);
		
		textFielddate = new JTextField();
		textFielddate.setBounds(115, 145, 86, 20);
		panel_3.add(textFielddate);
		textFielddate.setColumns(10);
		
		JLabel lblNewLabel_11 = new JLabel("VOUCHER NU.");
		lblNewLabel_11.setBounds(268, 113, 86, 17);
		panel_1.add(lblNewLabel_11);
		
		JLabel lblNewLabel_12 = new JLabel("STOCK");
		lblNewLabel_12.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_12.setBounds(332, 192, 46, 14);
		panel_1.add(lblNewLabel_12);
		
		JLabel lblNewLabel_13 = new JLabel("CURRENT");
		lblNewLabel_13.setBounds(281, 229, 63, 14);
		panel_1.add(lblNewLabel_13);
		
		JLabel lblNewLabel_14 = new JLabel("REMAIN");
		lblNewLabel_14.setBounds(281, 268, 46, 14);
		panel_1.add(lblNewLabel_14);
		
		textFieldcurrent = new JTextField();
		textFieldcurrent.setBounds(352, 226, 86, 20);
		panel_1.add(textFieldcurrent);
		textFieldcurrent.setColumns(10);
		
		JLabel lblNewLabel_15 = new JLabel("G.S.T.I.N");
		lblNewLabel_15.setBounds(6, 11, 46, 14);
		panel_1.add(lblNewLabel_15);
		
		JLabel lblNewLabel_16 = new JLabel("DATE");
		lblNewLabel_16.setBounds(298, 11, 46, 14);
		panel_1.add(lblNewLabel_16);
		
		textField_10 = new JTextField();
		textField_10.setBounds(352, 8, 86, 20);
		panel_1.add(textField_10);
		
		textFieldgstin = new JTextField();
		textFieldgstin.setBounds(62, 8, 86, 20);
		panel_1.add(textFieldgstin);
		textFieldgstin.setColumns(10);
		
		textFieldtotal = new JTextField();
		textFieldtotal.setBounds(352, 67, 86, 20);
		panel_1.add(textFieldtotal);
		textFieldtotal.setColumns(10);
		
		textFieldvnu = new JTextField();
		textFieldvnu.setBounds(352, 113, 86, 20);
		panel_1.add(textFieldvnu);
		textFieldvnu.setColumns(10);
		
		textFieldremain = new JTextField();
		textFieldremain.setBounds(352, 265, 86, 20);
		panel_1.add(textFieldremain);
		textFieldremain.setColumns(10);
		textField_10.setColumns(10);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(217, 175, 364, 45);
		panel_2.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		frame.getContentPane().add(panel_2);
		panel_2.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("PURCHASE");
		lblNewLabel_1.setFont(new Font("Dialog", Font.BOLD, 24));
		lblNewLabel_1.setBounds(106, 11, 184, 23);
		panel_2.add(lblNewLabel_1);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel_4.setBounds(525, 231, 173, 323);
		frame.getContentPane().add(panel_4);
		panel_4.setLayout(null);
		
		JButton btnNewButton = new JButton("SAVE");
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try{
					String query="insert into purchase(gstin,name,proid,manu,date,total,vnu,bal,current,remain) values(?,?,?,?,?,?,?,?,?,?)";
					PreparedStatement pst=connec.prepareStatement(query);	
					pst.setString(1,textFieldgstin.getText() );
					pst.setString(2,textFieldname.getText() );
					pst.setString(3,textFieldproid.getText() );
				    pst.setString(4,textFieldmanu.getText()  );
					pst.setString(5,textFielddate.getText() );
					pst.setString(6,textFieldtotal.getText() );
					pst.setString(7,textFieldvnu.getText() );
					pst.setString(8,textFieldbal.getText()  );
					pst.setString(9, textFieldcurrent.getText() );
					pst.setString(10,textFieldremain.getText() );
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
		btnNewButton.setBounds(32, 84, 89, 23);
		panel_4.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("DELETE");
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try
				{
					String query="delete from purchase where proid='"+textFieldproid.getText()+"' ";
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
		btnNewButton_1.setBounds(32, 243, 89, 23);
		panel_4.add(btnNewButton_1);
		

	}
}
