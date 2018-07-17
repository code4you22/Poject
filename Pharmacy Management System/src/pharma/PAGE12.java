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

public class PAGE12 {

	private JFrame frame;
	private JTextField textFieldiid;
	private JTextField textFieldiname;
	private JTextField textFielditype;
	private JTextField textFieldquan;
	private JTextField textFieldsprice;
	private JTextField textFieldodate;
	private JTextField textFieldmid;
	private JTextField textFieldmname;
	private JTextField textFieldmtype;
	private JTextField textFieldquan2;
	private JTextField textFieldexdate;
	private JTextField textFieldsprice2;
	private JTextField textFieldodate2;

	/**
	 * Launch the application.
	 */
	public void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PAGE12 window = new PAGE12();
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
	public PAGE12() {
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
		lblNewLabel.setFont(new Font("Dialog", Font.BOLD, 36));
		lblNewLabel.setBounds(0, 0, 784, 47);
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
				PAGE7 page7=new PAGE7();
				page7.main(null);
				page7.getClass();
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
		
		JButton btnExit = new JButton("EXIT");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.exit(JFrame.EXIT_ON_CLOSE);
			}
		});
		menuBar.add(btnExit);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 160, 784, 394);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel_1.setBounds(158, 0, 395, 39);
		panel.add(panel_1);
		
		JLabel lblNewLabel_1 = new JLabel("          EDIT  STOCK         ");
		lblNewLabel_1.setFont(new Font("Dialog", Font.BOLD, 24));
		panel_1.add(lblNewLabel_1);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel_2.setBounds(0, 51, 559, 332);
		panel.add(panel_2);
		panel_2.setLayout(null);
		
		JLabel lblNewLabel_2 = new JLabel("ACTION");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_2.setBounds(99, 0, 48, 21);
		panel_2.add(lblNewLabel_2);
		
		JRadioButton rdbtnGeneralStore = new JRadioButton("GENERAL STORE");
		rdbtnGeneralStore.setBounds(6, 28, 129, 23);
		panel_2.add(rdbtnGeneralStore);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("MEDICAL STORE");
		rdbtnNewRadioButton.setBounds(148, 28, 133, 23);
		panel_2.add(rdbtnNewRadioButton);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel_3.setBounds(6, 58, 264, 263);
		panel_2.add(panel_3);
		panel_3.setLayout(null);
		
		JLabel lblNewLabel_3 = new JLabel("GENERAL STORE");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_3.setBounds(83, 0, 98, 14);
		panel_3.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("ITEM ID");
		lblNewLabel_4.setBounds(10, 25, 74, 14);
		panel_3.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("ITEM NAME");
		lblNewLabel_5.setBounds(10, 66, 74, 14);
		panel_3.add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("TYPE");
		lblNewLabel_6.setBounds(10, 110, 74, 14);
		panel_3.add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("QUANTITY");
		lblNewLabel_7.setBounds(10, 151, 74, 14);
		panel_3.add(lblNewLabel_7);
		
		JLabel lblNewLabel_8 = new JLabel("SELLING PRICE");
		lblNewLabel_8.setBounds(10, 197, 74, 14);
		panel_3.add(lblNewLabel_8);
		
		JLabel lblNewLabel_9 = new JLabel("OPENING DATE");
		lblNewLabel_9.setBounds(10, 238, 74, 14);
		panel_3.add(lblNewLabel_9);
		
		textFieldiid = new JTextField();
		textFieldiid.setBounds(157, 25, 86, 20);
		panel_3.add(textFieldiid);
		textFieldiid.setColumns(10);
		
		textFieldiname = new JTextField();
		textFieldiname.setBounds(157, 63, 86, 20);
		panel_3.add(textFieldiname);
		textFieldiname.setColumns(10);
		
		textFielditype = new JTextField();
		textFielditype.setBounds(157, 107, 86, 20);
		panel_3.add(textFielditype);
		textFielditype.setColumns(10);
		
		textFieldquan = new JTextField();
		textFieldquan.setBounds(157, 148, 86, 20);
		panel_3.add(textFieldquan);
		textFieldquan.setColumns(10);
		
		textFieldsprice = new JTextField();
		textFieldsprice.setBounds(157, 194, 86, 20);
		panel_3.add(textFieldsprice);
		textFieldsprice.setColumns(10);
		
		textFieldodate = new JTextField();
		textFieldodate.setBounds(157, 235, 86, 20);
		panel_3.add(textFieldodate);
		textFieldodate.setColumns(10);
		textFieldodate.setColumns(10);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel_4.setBounds(280, 58, 264, 263);
		panel_2.add(panel_4);
		panel_4.setLayout(null);
		
		JLabel lblNewLabel_10 = new JLabel("    MEDICAL STORE     ");
		lblNewLabel_10.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_10.setBounds(76, 0, 116, 14);
		panel_4.add(lblNewLabel_10);
		
		JLabel lblNewLabel_11 = new JLabel("MEDICINE ID");
		lblNewLabel_11.setBounds(10, 24, 86, 14);
		panel_4.add(lblNewLabel_11);
		
		JLabel lblNewLabel_12 = new JLabel("MEDICINE NAME");
		lblNewLabel_12.setBounds(10, 55, 86, 14);
		panel_4.add(lblNewLabel_12);
		
		JLabel lblNewLabel_13 = new JLabel("MEDICINE TYPE");
		lblNewLabel_13.setBounds(10, 91, 86, 14);
		panel_4.add(lblNewLabel_13);
		
		JLabel lblNewLabel_15 = new JLabel("QUANTITY");
		lblNewLabel_15.setBounds(10, 130, 86, 14);
		panel_4.add(lblNewLabel_15);
		
		JLabel lblNewLabel_16 = new JLabel("EXPIRY DATE");
		lblNewLabel_16.setBounds(10, 166, 86, 14);
		panel_4.add(lblNewLabel_16);
		
		JLabel lblNewLabel_17 = new JLabel("SELLING PRICE");
		lblNewLabel_17.setBounds(10, 202, 86, 14);
		panel_4.add(lblNewLabel_17);
		
		JLabel lblNewLabel_18 = new JLabel("OPENING DATE");
		lblNewLabel_18.setBounds(10, 238, 86, 14);
		panel_4.add(lblNewLabel_18);
		
		textFieldmid = new JTextField();
		textFieldmid.setBounds(153, 21, 86, 20);
		panel_4.add(textFieldmid);
		textFieldmid.setColumns(10);
		
		textFieldmname = new JTextField();
		textFieldmname.setBounds(153, 52, 86, 20);
		panel_4.add(textFieldmname);
		textFieldmname.setColumns(10);
		
		textFieldmtype = new JTextField();
		textFieldmtype.setBounds(153, 88, 86, 20);
		panel_4.add(textFieldmtype);
		textFieldmtype.setColumns(10);
		
		textFieldquan2 = new JTextField();
		textFieldquan2.setBounds(153, 127, 86, 20);
		panel_4.add(textFieldquan2);
		textFieldquan2.setColumns(10);
		
		textFieldexdate = new JTextField();
		textFieldexdate.setBounds(153, 163, 86, 20);
		panel_4.add(textFieldexdate);
		textFieldexdate.setColumns(10);
		
		textFieldsprice2 = new JTextField();
		textFieldsprice2.setBounds(153, 199, 86, 20);
		panel_4.add(textFieldsprice2);
		textFieldsprice2.setColumns(10);
		
		textFieldodate2 = new JTextField();
		textFieldodate2.setBounds(153, 235, 86, 20);
		panel_4.add(textFieldodate2);
		textFieldodate2.setColumns(10);
		textFieldodate2.setColumns(10);
		
		
		
		JPanel panel_5 = new JPanel();
		panel_5.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel_5.setBounds(584, 51, 142, 332);
		panel.add(panel_5);
		panel_5.setLayout(null);
		panel_5.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel_5.setLayout(null);
		
		JButton btnNewButton_1 = new JButton("DELETE");
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try
				{
					String query="delete from edit_stock where iid='"+textFieldiid.getText()+"' ";
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
		btnNewButton_1.setBounds(30, 236, 89, 23);
		panel_5.add(btnNewButton_1);
		
		JButton btnNewButton = new JButton("SAVE");
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try{
					String query="insert into edit_stock(iid,iname,type,quan,sprice,odate,mid,mname,mtype,quan2,exdate,sprice2,odate2) values(?,?,?,?,?,?,?,?,?,?,?,?,?)";
					PreparedStatement pst=connec.prepareStatement(query);	
					pst.setString(1,textFieldiid.getText() );
					pst.setString(2,textFieldiname.getText() );
					pst.setString(3,textFielditype.getText() );
				    pst.setString(4,textFieldquan.getText()  );
					pst.setString(5,textFieldsprice.getText() );
					pst.setString(6,textFieldodate.getText() );
					pst.setString(7,textFieldmid.getText() );
					pst.setString(8,textFieldmname.getText()  );
					pst.setString(9,textFieldmtype.getText());
					pst.setString(10,textFieldquan2.getText());
					pst.setString(11,textFieldexdate.getText());
					pst.setString(12,textFieldsprice2.getText());
					pst.setString(13,textFieldodate2.getText());
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
		btnNewButton.setBounds(30, 70, 89, 23);
		panel_5.add(btnNewButton);
		

	}

}
