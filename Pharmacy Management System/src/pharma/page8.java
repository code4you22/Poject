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
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;

public class page8 {

	private JFrame frame;
	private JTextField textFieldcnu;
	private JTextField textFieldcdate;
	private JTextField textFieldbnu;
	private JTextField textFieldbdate;
	private JTextField textFieldpcode;
	private JTextField textFieldpname;
	private JTextField textFieldptype;
	private JTextField textFieldpquan;
	private JTextField textFieldcost;
	private JTextField textFieldedate;
	private JTextField textFieldmanu;
	private JTextField textFieldsid;
	private JTextField textFieldsname;

	/**
	 * Launch the application.
	 */
	public void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					page8 window = new page8();
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
	public page8() {
		initialize();
		connec=Sqlite_Connec.dbConnector();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(0,0,800,600);
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
		
		JButton btnNewButton_6 = new JButton("SALE'S");
		btnNewButton_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
		   frame.dispose();
		   PAGE4 page4=new PAGE4();
		   page4.main(null);
		   page4.getClass();
			}
		});
		mnSales.add(btnNewButton_6);
		
		JButton btnNewButton_7 = new JButton("EDIT SALE'S");
		btnNewButton_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				  frame.dispose();
				   PAGE9 page9=new PAGE9();
				   page9.main(null);
				   page9.getClass();
			}
		});
		mnSales.add(btnNewButton_7);
		
		JMenu mnNewMenu_3 = new JMenu("PURCHASE");
		mnNewMenu.add(mnNewMenu_3);
		
		JButton btnNewButton_8 = new JButton("PURCHASE");
		btnNewButton_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				 frame.dispose();
				   PAGE6 page6=new PAGE6();
				   page6.main(null);
				   page6.getClass();
			}
 		});
		mnNewMenu_3.add(btnNewButton_8);
		
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
		
		JButton btnNewButton_9 = new JButton("OPENING STOCK");
		btnNewButton_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				frame.dispose();
				PAGE5 page5=new PAGE5();
				page5.main(null);
				page5.getClass();
			}
		});
		mnNewMenu_1.add(btnNewButton_9);
		
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
		
		JMenu mnNewMenu_5 = new JMenu("CONTACT DETAIL");
		mnNewMenu_2.add(mnNewMenu_5);
		
		JButton btnNewButton_10 = new JButton("SUPPLIER DETAIL");
		btnNewButton_10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				frame.dispose();
				PAGE12 page12=new PAGE12();
				page12.main(null);
				page12.getClass();
			}
		});
		mnNewMenu_5.add(btnNewButton_10);
		
		JButton btnNewButton_11 = new JButton("BUYER DETAIL");
		btnNewButton_11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			    frame.dispose();
				PAGE3 page3=new PAGE3();
			    page3.main(null);
			    page3.getClass();
			}
		});
		mnNewMenu_5.add(btnNewButton_11);
		
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
		
		JButton btnDataRecord = new JButton("DATA RECORD");
		btnDataRecord.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			frame.dispose();
			PAGE11 page11=new PAGE11();
			page11.main(null);
			page11.getClass();
			}
		});
		mnNewMenu_2.add(btnDataRecord);
		
		JButton btnNewButton_12 = new JButton("EXIT");
		menuBar.add(btnNewButton_12);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 152, 784, 409);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(164, 0, 288, 36);
		panel_1.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("     EDIT PURCHASE     ");
		lblNewLabel_1.setFont(new Font("Dialog", Font.BOLD, 24));
		lblNewLabel_1.setBounds(10, 0, 268, 25);
		panel_1.add(lblNewLabel_1);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(0, 41, 569, 357);
		panel_2.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel.add(panel_2);
		panel_2.setLayout(null);
		
		JLabel lblNewLabel_2 = new JLabel("TYPE");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_2.setBounds(53, 0, 49, 27);
		panel_2.add(lblNewLabel_2);
		
		JRadioButton rdbtnGeneralStore = new JRadioButton("GENERAL STORE");
		rdbtnGeneralStore.setBounds(6, 29, 128, 27);
		panel_2.add(rdbtnGeneralStore);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("MEDICA STORE");
		rdbtnNewRadioButton.setBounds(6, 59, 128, 27);
		panel_2.add(rdbtnNewRadioButton);
		
		JLabel lblNewLabel_3 = new JLabel("CHALLAN NU.");
		lblNewLabel_3.setBounds(153, 7, 92, 14);
		panel_2.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("CHALLAN DATE");
		lblNewLabel_4.setBounds(153, 65, 92, 14);
		panel_2.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("BILL NU.");
		lblNewLabel_5.setBounds(371, 7, 49, 14);
		panel_2.add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("BILL DATE");
		lblNewLabel_6.setBounds(371, 65, 67, 14);
		panel_2.add(lblNewLabel_6);
		
		textFieldcnu = new JTextField();
		textFieldcnu.setBounds(255, 6, 102, 27);
		panel_2.add(textFieldcnu);
		textFieldcnu.setColumns(10);
		
		textFieldcdate = new JTextField();
		textFieldcdate.setBounds(255, 59, 102, 27);
		panel_2.add(textFieldcdate);
		textFieldcdate.setColumns(10);
		
		textFieldbnu = new JTextField();
		textFieldbnu.setBounds(439, 3, 120, 27);
		panel_2.add(textFieldbnu);
		textFieldbnu.setColumns(10);
		
		textFieldbdate = new JTextField();
		textFieldbdate.setBounds(439, 59, 120, 27);
		panel_2.add(textFieldbdate);
		textFieldbdate.setColumns(10);
		
		JLabel lblNewLabel_7 = new JLabel("PRODUCT CODE");
		lblNewLabel_7.setBounds(10, 122, 92, 14);
		panel_2.add(lblNewLabel_7);
		
		JLabel lblNewLabel_8 = new JLabel("PRODUCT NAME");
		lblNewLabel_8.setBounds(10, 192, 92, 14);
		panel_2.add(lblNewLabel_8);
		
		JLabel lblNewLabel_9 = new JLabel("PRODUCT TYPE");
		lblNewLabel_9.setBounds(10, 264, 92, 14);
		panel_2.add(lblNewLabel_9);
		
		textFieldpcode = new JTextField();
		textFieldpcode.setBounds(101, 118, 128, 27);
		panel_2.add(textFieldpcode);
		textFieldpcode.setColumns(10);
		
		textFieldpname = new JTextField();
		textFieldpname.setBounds(101, 184, 128, 31);
		panel_2.add(textFieldpname);
		textFieldpname.setColumns(10);
		
		textFieldptype = new JTextField();
		textFieldptype.setBounds(101, 255, 128, 31);
		panel_2.add(textFieldptype);
		textFieldptype.setColumns(10);
		
		JLabel lblNewLabel_10 = new JLabel("QUANTITY");
		lblNewLabel_10.setBounds(6, 325, 77, 14);
		panel_2.add(lblNewLabel_10);
		
		textFieldpquan = new JTextField();
		textFieldpquan.setBounds(101, 319, 136, 27);
		panel_2.add(textFieldpquan);
		textFieldpquan.setColumns(10);
		
		JLabel lblNewLabel_11 = new JLabel("COST");
		lblNewLabel_11.setBounds(255, 122, 67, 14);
		panel_2.add(lblNewLabel_11);
		
		JLabel lblNewLabel_12 = new JLabel("EXPIRY DATE");
		lblNewLabel_12.setBounds(255, 180, 77, 14);
		panel_2.add(lblNewLabel_12);
		
		textFieldcost = new JTextField();
		textFieldcost.setBounds(367, 116, 120, 27);
		panel_2.add(textFieldcost);
		textFieldcost.setColumns(10);
		
		textFieldedate = new JTextField();
		textFieldedate.setBounds(367, 172, 120, 31);
		panel_2.add(textFieldedate);
		textFieldedate.setColumns(10);
		
		JLabel lblNewLabel_13 = new JLabel("MANUFACTURER");
		lblNewLabel_13.setBounds(255, 237, 102, 14);
		panel_2.add(lblNewLabel_13);
		
		textFieldmanu = new JTextField();
		textFieldmanu.setBounds(367, 229, 120, 31);
		panel_2.add(textFieldmanu);
		textFieldmanu.setColumns(10);
		
		JLabel lblNewLabel_14 = new JLabel("SUPPLIER ID");
		lblNewLabel_14.setBounds(255, 285, 77, 14);
		panel_2.add(lblNewLabel_14);
		
		JLabel lblNewLabel_15 = new JLabel("SUPPLIER NAME");
		lblNewLabel_15.setBounds(255, 332, 102, 14);
		panel_2.add(lblNewLabel_15);
		
		textFieldsid = new JTextField();
		textFieldsid.setBounds(371, 282, 116, 20);
		panel_2.add(textFieldsid);
		textFieldsid.setColumns(10);
		
		textFieldsname = new JTextField();
		textFieldsname.setBounds(371, 326, 116, 20);
		panel_2.add(textFieldsname);
		textFieldsname.setColumns(10);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel_3.setBounds(577, 41, 142, 357);
		panel.add(panel_3);
		panel_3.setLayout(null);
		
		JButton btnNewButton = new JButton("SAVE");
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try{
					String query="insert into edit_purchase(cnu,cdate,billnu,bdate,procode,proname,protype,cost,exdate,manu,sname,supid,quan) values(?,?,?,?,?,?,?,?,?,?,?,?,?)";
					PreparedStatement pst=connec.prepareStatement(query);	
					pst.setString(1,textFieldcnu.getText() );
					pst.setString(2,textFieldcdate.getText() );
					pst.setString(3,textFieldbdate.getText() );
				    pst.setString(4,textFieldpcode.getText()  );
					pst.setString(5,textFieldpname.getText() );
					pst.setString(6,textFieldptype.getText() );
					pst.setString(7,textFieldpquan.getText() );
					pst.setString(8,textFieldcost.getText()  );
					pst.setString(9,textFieldedate.getText());
					pst.setString(10,textFieldmanu.getText());
					pst.setString(11,textFieldsname.getText());
					pst.setString(12,textFieldsid.getText());
					pst.setString(13,textFieldbnu.getText());
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
		btnNewButton.setBounds(24, 109, 89, 23);
		panel_3.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("DELETE");
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try
				{
					String query="delete from edit_purchase where procode='"+textFieldpcode.getText()+"' ";
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
		btnNewButton_1.setBounds(24, 249, 89, 23);
		panel_3.add(btnNewButton_1);
		
		
		
	}
}
