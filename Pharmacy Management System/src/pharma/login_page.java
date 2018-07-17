package pharma;
import pharma.PAGE1;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JLabel;

import java.awt.Font;

import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JPasswordField;
import javax.swing.border.LineBorder;




import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.swing.ImageIcon;

public class login_page {

	private JFrame frame;
	private JTextField textFieldUserName;
	private JPasswordField passwordField;
    
    /**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					login_page window = new login_page();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */Connection connect=null;
	public login_page() {
		initialize();
		connect=Sqlite_Connec.dbConnector();
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
		lblNewLabel.setFont(new Font("Microsoft Tai Le", Font.BOLD, 36));
		lblNewLabel.setBounds(49, 11, 735, 47);
		frame.getContentPane().add(lblNewLabel);
		
		JPanel panel = new JPanel();
		panel.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel.setBounds(10, 144, 761, 254);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("LOG-IN");
		lblNewLabel_1.setFont(new Font("Dialog", Font.BOLD, 14));
		lblNewLabel_1.setBounds(379, 11, 79, 31);
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("USER NAME");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_2.setBounds(249, 56, 79, 20);
		panel.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("PASSWORD");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_3.setBounds(249, 131, 100, 20);
		panel.add(lblNewLabel_3);
		
		textFieldUserName = new JTextField();
		textFieldUserName.setBounds(556, 51, 86, 31);
		panel.add(textFieldUserName);
		textFieldUserName.setColumns(10);
		
		JButton btnNewButton = new JButton("RESET");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			try{
				JOptionPane.showMessageDialog(null,"If You are Admin then Proceed");
				 frame.dispose();
				   Admin Admin=new Admin();
				   Admin.main(null);
				   Admin.getClass();
			}catch(Exception e)
			{
				JOptionPane.showMessageDialog(null, "Error Occured");
			}
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnNewButton.setBounds(344, 194, 89, 23);
		panel.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("LOG-IN");
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try
				{
				String query="Select * from Employeeinfo where Userid = ? and password = ?";
				PreparedStatement pst=connect.prepareStatement(query);
				pst.setString(1,  textFieldUserName.getText());
				pst.setString(2, passwordField.getText());
				ResultSet rs=pst.executeQuery();
				int count=0;
				while(rs.next())
				{
				count++;	
				}
				if(count ==1)
				{
					//JOptionPane.showMessageDialog(null, "User name Password is correct");
					JOptionPane.showMessageDialog(null, "User-Name Password is Correct","Log-In Status", 1);
					frame.dispose();
				    PAGE1 pa=new PAGE1();
					pa.main(null);
					pa.getClass();				}
				else if(count>1)
				{
					JOptionPane.showMessageDialog(null, "Duplicate Values are Used","Log-In Status", 2);
				}
				else
				{
					JOptionPane.showMessageDialog(null, "User-Name Password is In-Correct","Log-In Status", 3);
				}
				rs.close();
				pst.close();
				}
				catch(Exception e)
				{
				JOptionPane.showMessageDialog(null, e);
				}
			
			
			}
		});
		btnNewButton_1.setBounds(491, 194, 89, 23);
		panel.add(btnNewButton_1);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(556, 120, 86, 31);
		panel.add(passwordField);
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon("C:\\Users\\Dell\\Desktop\\IMG\\Log.png"));
		label.setBounds(10, 28, 229, 190);
		panel.add(label);
	}
}
