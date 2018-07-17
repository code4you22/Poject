package pharma;

import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;

import java.awt.Color;

import javax.swing.JRadioButton;
import javax.swing.JSeparator;
import javax.swing.JTextField;
import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;

public class PAGE4 {

	private JFrame frame;
	private JTextField textFieldtotal;
	private JTextField textFieldbalance;
	private JTextField textFieldname;
	private JTextField textFieldmedicine;
	private JTextField textFieldrefby;
	private JTextField textFielddate;
	private JTextField textFieldvouchernu;
	private JTextField textFieldcurrent;
	private JTextField textFieldremain;
	private JTextField textFieldgstin;
	private JTextField textField_10;

	/**
	 * Launch the application.
	 */
	public void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PAGE4 window = new PAGE4();
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
	private JLabel lblNewLabel_11;
	public PAGE4() {
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
		
		JButton btnNewButton_5 = new JButton("GENERAL STORE");
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			
				frame.dispose();
				PAGE2 pa1=new PAGE2();
				pa1.main(null);
				pa1.getClass();
				}
		});
		mnMaster.add(btnNewButton_5);
		
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
		
		JButton btnOpeningStock = new JButton("OPENING STOCK");
		btnOpeningStock.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				frame.dispose();
				PAGE5 page5=new PAGE5();
				page5.main(null);
				page5.getClass();
			}
		});
		mnNewMenu_1.add(btnOpeningStock);
		
		JButton btnClosingStock = new JButton("EDIT STOCK");
		btnClosingStock.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				frame.dispose();
				PAGE12 page12=new PAGE12();
				page12.main(null);
				page12.getClass();
			}
		});
		mnNewMenu_1.add(btnClosingStock);
		
		JMenu mnNewMenu_2 = new JMenu("RECORD");
		menuBar.add(mnNewMenu_2);
		
		JMenu mnNewMenu_5 = new JMenu("CUSTOMER DETAIL");
		mnNewMenu_2.add(mnNewMenu_5);
		
		JButton btnSupplierDetail = new JButton("SUPPLIER DETAIL");
		btnSupplierDetail.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				frame.dispose();
				PAGE7 page7=new PAGE7();
				page7.main(null);
				page7.getClass();
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
		
		JButton btnMedicineCodeList = new JButton("PRODUCT INFORMATION");
		btnMedicineCodeList.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				frame.dispose();
				PAGE10 page10=new PAGE10();
				page10.main(null);
				page10.getClass();	
			}
		});
		mnNewMenu_2.add(btnMedicineCodeList);
		
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
		
		JMenuItem menuItem = new JMenuItem("");
		menuItem.setBounds(29, 101, 129, 22);
		frame.getContentPane().add(menuItem);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 885, 41);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("PHARMACY MANAGEMENT SYSTEM");
		lblNewLabel.setFont(new Font("Dialog", Font.BOLD, 36));
		lblNewLabel.setBounds(10, 0, 803, 41);
		panel.add(lblNewLabel);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel_1.setBounds(10, 231, 471, 323);
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel_2 = new JLabel("TYPE OF SALE");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_2.setBounds(80, 34, 83, 25);
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
		
		JSeparator separator = new JSeparator();
		separator.setBounds(114, 113, 1, -46);
		panel_1.add(separator);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(117, 113, 14, -64);
		panel_1.add(separator_1);
		
		JLabel lblNewLabel_3 = new JLabel("AMOUNT");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_3.setBounds(319, 36, 73, 20);
		panel_1.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("TOTAL");
		lblNewLabel_4.setBounds(271, 68, 73, 19);
		panel_1.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("BALANCE");
		lblNewLabel_5.setBounds(271, 143, 73, 19);
		panel_1.add(lblNewLabel_5);
		
		textFieldtotal = new JTextField();
		textFieldtotal.setBounds(352, 68, 86, 20);
		panel_1.add(textFieldtotal);
		textFieldtotal.setColumns(10);
		
		textFieldbalance = new JTextField();
		textFieldbalance.setBounds(352, 142, 86, 20);
		panel_1.add(textFieldbalance);
		textFieldbalance.setColumns(10);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_3.setBounds(10, 139, 232, 173);
		panel_1.add(panel_3);
		panel_3.setLayout(null);
		
		JLabel lblNewLabel_6 = new JLabel("PATIENT DETAIL");
		lblNewLabel_6.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_6.setBounds(51, 11, 98, 20);
		panel_3.add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("NAME");
		lblNewLabel_7.setBounds(10, 41, 46, 14);
		panel_3.add(lblNewLabel_7);
		
		JLabel lblNewLabel_8 = new JLabel("MEDICINE");
		lblNewLabel_8.setBounds(10, 77, 63, 14);
		panel_3.add(lblNewLabel_8);
		
		JLabel lblNewLabel_9 = new JLabel("REF. BY. Dr.");
		lblNewLabel_9.setBounds(10, 111, 73, 14);
		panel_3.add(lblNewLabel_9);
		
		JLabel lblNewLabel_10 = new JLabel("DATE");
		lblNewLabel_10.setBounds(10, 148, 63, 14);
		panel_3.add(lblNewLabel_10);
		
		textFieldname = new JTextField();
		textFieldname.setBounds(99, 42, 86, 20);
		panel_3.add(textFieldname);
		textFieldname.setColumns(10);
		
		textFieldmedicine = new JTextField();
		textFieldmedicine.setBounds(99, 74, 86, 20);
		panel_3.add(textFieldmedicine);
		textFieldmedicine.setColumns(10);
		
		textFieldrefby = new JTextField();
		textFieldrefby.setBounds(99, 108, 86, 20);
		panel_3.add(textFieldrefby);
		textFieldrefby.setColumns(10);
		
		textFielddate = new JTextField();
		textFielddate.setBounds(99, 145, 86, 20);
		panel_3.add(textFielddate);
		textFielddate.setColumns(10);
		
		lblNewLabel_11 = new JLabel("VOUCHER NU");
		lblNewLabel_11.setBounds(271, 113, 73, 20);
		panel_1.add(lblNewLabel_11);
		
		textFieldvouchernu = new JTextField();
		textFieldvouchernu.setBounds(352, 111, 86, 20);
		panel_1.add(textFieldvouchernu);
		textFieldvouchernu.setColumns(10);
		
		JLabel lblNewLabel_12 = new JLabel("STOCK");
		lblNewLabel_12.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_12.setBounds(332, 192, 60, 14);
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
		
		textFieldremain = new JTextField();
		textFieldremain.setBounds(352, 262, 86, 20);
		panel_1.add(textFieldremain);
		textFieldremain.setColumns(10);
		
		JLabel lblNewLabel_15 = new JLabel("G.S.T.I.N");
		lblNewLabel_15.setBounds(6, 11, 46, 14);
		panel_1.add(lblNewLabel_15);
		
		textFieldgstin = new JTextField();
		textFieldgstin.setBounds(77, 8, 86, 20);
		panel_1.add(textFieldgstin);
		textFieldgstin.setColumns(10);
		
		JLabel lblNewLabel_16 = new JLabel("DATE");
		lblNewLabel_16.setBounds(298, 11, 46, 14);
		panel_1.add(lblNewLabel_16);
		
		textField_10 = new JTextField();
		textField_10.setBounds(352, 8, 86, 20);
		panel_1.add(textField_10);
		textField_10.setColumns(10);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel_2.setBounds(175, 175, 364, 45);
		frame.getContentPane().add(panel_2);
		panel_2.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("SALE'S");
		lblNewLabel_1.setFont(new Font("Dialog", Font.BOLD, 24));
		lblNewLabel_1.setBounds(129, 11, 120, 23);
		panel_2.add(lblNewLabel_1);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel_4.setBounds(491, 231, 153, 323);
		frame.getContentPane().add(panel_4);
		panel_4.setLayout(null);
		
		JButton btnNewButton = new JButton("SAVE");
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try{
					String query="insert into Sale(gstin,name,medicine,refby,total,vouchernu,balance,currentstock,remainstock) values(?,?,?,?,?,?,?,?,?)";
					PreparedStatement pst=connec.prepareStatement(query);	
					pst.setString(1,textFieldgstin.getText() );
					pst.setString(2,textFieldname.getText() );
					pst.setString(3,textFieldmedicine.getText() );
				    pst.setString(4,textFieldrefby.getText()  );
					pst.setString(5,textFieldvouchernu.getText() );
					pst.setString(6,textFieldbalance.getText() );
					pst.setString(7,textFieldcurrent.getText() );
					pst.setString(8,textFieldremain.getText()  );
					pst.setString(9, textFieldtotal.getText() );
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
		btnNewButton.setBounds(21, 67, 89, 23);
		panel_4.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("DELETE");
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try
				{
					String query="delete from Sale where name='"+textFieldname.getText()+"' ";
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
		btnNewButton_1.setBounds(21, 196, 89, 23);
		panel_4.add(btnNewButton_1);
		
		

	}
}
