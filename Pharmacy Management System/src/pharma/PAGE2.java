package pharma;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;
import javax.swing.DefaultComboBoxModel;

public class PAGE2 {

	private JFrame frame;
	private JTextField textFieldMCode;
	private JTextField textField_1MName;
	private JTextField textField_2MStock;
	private JTextField textFieldmcode;
	private JTextField textFieldmname;
	private JTextField textFieldmstock;
    private JComboBox comboBoxMType;
    private JComboBox comboBoxmtype;
	/**
	 * Launch the application.
	 */
	public void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PAGE2 window = new PAGE2();
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

			Connection connec=null;
	public PAGE2() {
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
		
		JButton btnExit = new JButton("EXIT");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			System.exit(JFrame.EXIT_ON_CLOSE);
			}
		});
		menuBar.add(btnExit);
		
		JLabel lblNewLabel = new JLabel("PHARMACY MANAGEMENT SYSTEM");
		lblNewLabel.setBounds(0, 0, 1184, 48);
		lblNewLabel.setFont(new Font("Dialog", Font.BOLD, 36));
		frame.getContentPane().add(lblNewLabel);
		
		JPanel panel = new JPanel();
		panel.setBounds(10, 202, 362, 286);
		panel.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("MEDICAL STORE");
		lblNewLabel_1.setBounds(132, 11, 99, 21);
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("MEDICINE CODE");
		lblNewLabel_2.setBounds(20, 56, 99, 27);
		panel.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("MEDICINE NAME");
		lblNewLabel_3.setBounds(20, 101, 99, 34);
		panel.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("MEDICINE TYPE");
		lblNewLabel_4.setBounds(20, 146, 99, 46);
		panel.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("MINIMUM STOCK");
		lblNewLabel_5.setBounds(20, 203, 99, 27);
		panel.add(lblNewLabel_5);
		
		textFieldMCode = new JTextField();
		textFieldMCode.setBounds(201, 59, 86, 20);
		panel.add(textFieldMCode);
		textFieldMCode.setColumns(10);
		
		textField_1MName = new JTextField();
		textField_1MName.setBounds(201, 108, 86, 20);
		panel.add(textField_1MName);
		textField_1MName.setColumns(10);
		
		comboBoxMType = new JComboBox();
		comboBoxMType.setModel(new DefaultComboBoxModel(new String[] {"General ", "Medicine"}));
		comboBoxMType.setBounds(201, 159, 86, 20);
		panel.add(comboBoxMType);
		
		textField_2MStock = new JTextField();
		textField_2MStock.setBounds(201, 203, 86, 20);
		panel.add(textField_2MStock);
		textField_2MStock.setColumns(10);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(382, 202, 362, 286);
		panel_1.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel_6 = new JLabel("GENERAL STORE");
		lblNewLabel_6.setBounds(130, 11, 96, 26);
		panel_1.add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("MEDICINE CODE");
		lblNewLabel_7.setBounds(25, 58, 106, 17);
		panel_1.add(lblNewLabel_7);
		
		JLabel lblNewLabel_8 = new JLabel("MEDICINE NAME");
		lblNewLabel_8.setBounds(25, 106, 106, 26);
		panel_1.add(lblNewLabel_8);
		
		JLabel lblNewLabel_9 = new JLabel("MEDICINE TYPE");
		lblNewLabel_9.setBounds(25, 148, 106, 27);
		panel_1.add(lblNewLabel_9);
		
		JLabel lblNewLabel_10 = new JLabel("MINIMUM STOCK");
		lblNewLabel_10.setBounds(25, 197, 106, 17);
		panel_1.add(lblNewLabel_10);
		
		textFieldmcode = new JTextField();
		textFieldmcode.setBounds(202, 55, 86, 20);
		panel_1.add(textFieldmcode);
		textFieldmcode.setColumns(10);
		
		textFieldmname = new JTextField();
		textFieldmname.setBounds(202, 103, 86, 20);
		panel_1.add(textFieldmname);
		textFieldmname.setColumns(10);
		
		comboBoxmtype = new JComboBox();
		comboBoxmtype.setModel(new DefaultComboBoxModel(new String[] {"General ", "Medicine"}));
		comboBoxmtype.setBounds(202, 155, 86, 20);
		panel_1.add(comboBoxmtype);
		
		textFieldmstock = new JTextField();
		textFieldmstock.setBounds(202, 194, 86, 20);
		panel_1.add(textFieldmstock);
		textFieldmstock.setColumns(10);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(0, 506, 744, 48);
		
		panel_2.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		frame.getContentPane().add(panel_2);
		panel_2.setLayout(null);
		
		JButton btnNewButton = new JButton("DELETE");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try
				{
					String query="delete from medicalstore where mid='"+textFieldMCode.getText()+"' ";
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
		btnNewButton.setBounds(425, 7, 89, 23);
		panel_2.add(btnNewButton);
		
		JButton btnNewButton_3 = new JButton("SAVE");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			try{
				String query="insert into medicalstore(mid,mname,mtype,mstock,gid,gname,gtype,gstock) values(?,?,?,?,?,?,?,?)";
				PreparedStatement pst=connec.prepareStatement(query);	
				pst.setString(1,textFieldMCode.getText() );
				pst.setString(2,textField_1MName.getText() );
				pst.setString(3,comboBoxMType.getToolTipText() );
			    pst.setString(4,textField_2MStock.getText()  );
				pst.setString(5,textFieldmcode.getText() );
				pst.setString(6,textFieldmname.getText() );
				pst.setString(7,comboBoxmtype.getToolTipText() );
				pst.setString(8,textFieldmstock.getText()  );
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
		btnNewButton_3.setBounds(201, 7, 89, 23);
		panel_2.add(btnNewButton_3);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel_3.setBounds(146, 158, 448, 38);
		frame.getContentPane().add(panel_3);
		
		JLabel lblNewLabel_11 = new JLabel("      MEDICAL & GENERAL STORE      ");
		lblNewLabel_11.setFont(new Font("Dialog", Font.BOLD, 24));
		panel_3.add(lblNewLabel_11);
	}
}
