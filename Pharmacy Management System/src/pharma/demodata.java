package pharma;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;

public class demodata {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					demodata window = new demodata();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public demodata() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 714, 473);
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
		
		JMenu mnNewMenu = new JMenu("TRANSACTIONS");
		menuBar.add(mnNewMenu);
		
		JMenu mnSales = new JMenu("SALES");
		mnNewMenu.add(mnSales);
		
		JButton btnNewButton = new JButton("SALE'S RECORD");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				  frame.dispose();
				   PAGE4 page4=new PAGE4();
				   page4.main(null);
				   page4.getClass();
			}
		});
		mnSales.add(btnNewButton);
		
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
		
		JMenuItem menuItem = new JMenuItem("");
		menuItem.setBounds(29, 101, 129, 22);
		frame.getContentPane().add(menuItem);
		
		JLabel lblNewLabel = new JLabel("PHARMACY MANAGEMENT SYSTEM");
		lblNewLabel.setBounds(0, 0, 691, 48);
		lblNewLabel.setFont(new Font("Dialog", Font.BOLD, 36));
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblGoToDatabase = new JLabel("Go To Database");
		lblGoToDatabase.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblGoToDatabase.setBounds(285, 161, 112, 22);
		frame.getContentPane().add(lblGoToDatabase);
		
		JPanel panel = new JPanel();
		panel.setBounds(31, 192, 634, 231);
		frame.getContentPane().add(panel);

	}

}
