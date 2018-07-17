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

import javax.swing.JTextField;
import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;

public class PAGE3 {

	private JFrame frame;
	private JTextField textFieldbid;
	private JTextField textFieldname;
	private JTextField textFieldaddress;
	private JTextField textFielpnu;
	private JTextField textFieldemail;
	private JTextField textFieldfaxnu;
	private JTextField textFielddebit;
	private JTextField textFieldcredit;

	/**
	 * Launch the application.
	 */
	public void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PAGE3 window = new PAGE3();
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
	public PAGE3() {
		initialize();
		connec= Sqlite_Connec.dbConnector();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(0, 0, 798, 600);
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
		
		JButton btnNewButton = new JButton("MEDICAL STORE");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				frame.dispose();
				PAGE2 pa1=new PAGE2();
				pa1.main(null);
				pa1.getClass();
			}
		});
		mnMaster.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("GENERAL STORE");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				frame.dispose();
				PAGE2 pa1=new PAGE2();
				pa1.main(null);
				pa1.getClass();
				}
		});
		mnMaster.add(btnNewButton_1);
		
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
		
		JButton btnEditSales = new JButton("EDIT SALES");
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
		
		JButton btnNewButton_6 = new JButton("EDIT PURCHASE");
		btnNewButton_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				  frame.dispose();
				   page8 PAGE8=new page8();
				   PAGE8.main(null);
				   PAGE8.getClass();
			}
		});
		mnNewMenu_3.add(btnNewButton_6);
		
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
		
		JButton btnClosingStock = new JButton("CLOSING STOCK");
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
		
		JButton btnNewButton_7 = new JButton("SUPPLIER DETAIL");
		btnNewButton_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				frame.dispose();
				PAGE7 page7=new PAGE7();
				page7.main(null);
				page7.getClass();
				}
		});
		mnNewMenu_5.add(btnNewButton_7);
		
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
		
		JMenuItem mntmNewMenuItem = new JMenuItem("SUPPLIER DETAIL");
		mnNewMenu_5.add(mntmNewMenuItem);
		
		JMenuItem mntmNewMenuItem_11 = new JMenuItem("BUYER DETAIL");
		mnNewMenu_5.add(mntmNewMenuItem_11);
		
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
		
		JButton btnNewButton_8 = new JButton("EXIT");
		btnNewButton_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.exit(JFrame.EXIT_ON_CLOSE);
			}
		});
		menuBar.add(btnNewButton_8);
		
		JLabel lblNewLabel = new JLabel("PHARMACY MANAGEMENT SYSTEM");
		lblNewLabel.setBounds(0, 0, 1184, 48);
		lblNewLabel.setFont(new Font("Dialog", Font.BOLD, 36));
		frame.getContentPane().add(lblNewLabel);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 237, 520, 316);
		panel.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel_2 = new JLabel("BUYER ID");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_2.setBounds(27, 42, 77, 23);
		panel.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("NAME");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_3.setBounds(27, 93, 77, 23);
		panel.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("ADDRESS");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_4.setBounds(27, 140, 77, 23);
		panel.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("PHONE NU.");
		lblNewLabel_5.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_5.setBounds(27, 178, 77, 23);
		panel.add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("E-MAIL ");
		lblNewLabel_6.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_6.setBounds(27, 224, 77, 23);
		panel.add(lblNewLabel_6);
		
		textFieldbid = new JTextField();
		textFieldbid.setBounds(155, 43, 86, 20);
		panel.add(textFieldbid);
		textFieldbid.setColumns(10);
		
		textFieldname = new JTextField();
		textFieldname.setBounds(155, 94, 86, 20);
		panel.add(textFieldname);
		textFieldname.setColumns(10);
		
		textFieldaddress = new JTextField();
		textFieldaddress.setBounds(155, 141, 86, 20);
		panel.add(textFieldaddress);
		textFieldaddress.setColumns(10);
		
		textFielpnu = new JTextField();
		textFielpnu.setBounds(155, 179, 86, 20);
		panel.add(textFielpnu);
		textFielpnu.setColumns(10);
		
		textFieldemail = new JTextField();
		textFieldemail.setBounds(155, 225, 86, 20);
		panel.add(textFieldemail);
		textFieldemail.setColumns(10);
		
		JLabel lblNewLabel_7 = new JLabel("BASIC INFORMATION");
		lblNewLabel_7.setFont(new Font("Dialog", Font.BOLD, 12));
		lblNewLabel_7.setBounds(70, 11, 155, 20);
		panel.add(lblNewLabel_7);
		
		textFieldfaxnu = new JTextField();
		textFieldfaxnu.setBounds(155, 266, 86, 20);
		panel.add(textFieldfaxnu);
		textFieldfaxnu.setColumns(10);
		
		JLabel lblNewLabel_8 = new JLabel("FAX NU.");
		lblNewLabel_8.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_8.setBounds(27, 269, 63, 17);
		panel.add(lblNewLabel_8);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(253, 4, 249, 291);
		panel.add(panel_2);
		panel_2.setLayout(null);
		
		JLabel lblNewLabel_9 = new JLabel("ACCOUNT INFORMATION");
		lblNewLabel_9.setFont(new Font("Dialog", Font.BOLD, 12));
		lblNewLabel_9.setBounds(49, 11, 163, 20);
		panel_2.add(lblNewLabel_9);
		
		JLabel lblNewLabel_10 = new JLabel("DEBIT");
		lblNewLabel_10.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_10.setBounds(22, 60, 66, 20);
		panel_2.add(lblNewLabel_10);
		
		JLabel lblNewLabel_11 = new JLabel("CREDIT");
		lblNewLabel_11.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_11.setBounds(22, 117, 66, 17);
		panel_2.add(lblNewLabel_11);
		
		textFielddebit = new JTextField();
		textFielddebit.setBounds(148, 57, 86, 20);
		panel_2.add(textFielddebit);
		textFielddebit.setColumns(10);
		
		textFieldcredit = new JTextField();
		textFieldcredit.setBounds(148, 114, 86, 20);
		panel_2.add(textFieldcredit);
		textFieldcredit.setColumns(10);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(149, 190, 342, 36);
		panel_1.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("BUYER'S INFORMATION");
		lblNewLabel_1.setFont(new Font("Dialog", Font.BOLD, 24));
		lblNewLabel_1.setBounds(24, 0, 289, 36);
		panel_1.add(lblNewLabel_1);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel_3.setBounds(547, 237, 144, 316);
		frame.getContentPane().add(panel_3);
		panel_3.setLayout(null);
		
		JButton btnNewButton_2 = new JButton("SAVE");
		btnNewButton_2.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try{
					String query="insert into Buyer_info(buyerid,name,address,phonenu,email,faxnu,amtdebit,amtcredit) values(?,?,?,?,?,?,?,?)";
					PreparedStatement pst=connec.prepareStatement(query);	
					pst.setString(1,textFieldbid.getText() );
					pst.setString(2,textFieldname.getText() );
					pst.setString(3,textFieldaddress.getText() );
				    pst.setString(4,textFielpnu.getText()  );
					pst.setString(5,textFieldemail.getText() );
					pst.setString(6,textFieldfaxnu.getText() );
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
		btnNewButton_2.setBounds(23, 65, 111, 23);
		panel_3.add(btnNewButton_2);
		
		JButton btnNewButton_4 = new JButton("DELETE");
		btnNewButton_4.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try
				{
					String query="delete from Buyer_info where buyerid='"+textFieldbid.getText()+"' ";
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
		btnNewButton_4.setBounds(23, 203, 111, 23);
		panel_3.add(btnNewButton_4);
		
		
	}
}
