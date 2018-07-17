package pharma;

import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
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

public class Database {

	private JFrame frame;
	private JTextField textFielduname;
	private JTextField textFieldpassword;

	/**
	 * Launch the application.
	 */
	public  void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Database window = new Database();
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
	public Database() {
		initialize();
		connec=Sqlite_Connec.dbConnector();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 726, 471);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		JLabel lblNewLabel = new JLabel("PHARMACY MANAGEMENT SYSTEM");
		lblNewLabel.setBounds(0, 0, 691, 48);
		lblNewLabel.setFont(new Font("Dialog", Font.BOLD, 36));
		frame.getContentPane().add(lblNewLabel);
		
		JPanel panel = new JPanel();
		panel.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel.setBounds(10, 59, 629, 363);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(178, 11, 275, 341);
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblSignUp = new JLabel("Sign Up");
		lblSignUp.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblSignUp.setBounds(95, 11, 101, 24);
		panel_1.add(lblSignUp);
		
		JLabel lblUsername = new JLabel("User-Name");
		lblUsername.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblUsername.setBounds(10, 51, 93, 24);
		panel_1.add(lblUsername);
		
		JLabel lblPassword = new JLabel("Password");
		lblPassword.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblPassword.setBounds(10, 161, 72, 14);
		panel_1.add(lblPassword);
		
		textFielduname = new JTextField();
		textFielduname.setBounds(105, 41, 160, 50);
		panel_1.add(textFielduname);
		textFielduname.setColumns(10);
		
		textFieldpassword = new JTextField();
		textFieldpassword.setBounds(105, 142, 160, 50);
		panel_1.add(textFieldpassword);
		textFieldpassword.setColumns(10);
		
		JButton btnSave = new JButton("Save");
		btnSave.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			
					try{
						String query="insert into Employeeinfo(Userid,password) values(?,?)";
						PreparedStatement pst=connec.prepareStatement(query);	
						pst.setString(1,textFielduname.getText() );
						pst.setString(2,textFieldpassword.getText() );
						
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
		btnSave.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnSave.setBounds(135, 258, 89, 23);
		panel_1.add(btnSave);
		
		JButton btnExit = new JButton("Exit");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.exit(JFrame.EXIT_ON_CLOSE);
			}
		});
		btnExit.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnExit.setBounds(14, 259, 89, 23);
		panel_1.add(btnExit);
		
		JButton btnLogin = new JButton("Log-in");
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				frame.dispose();
				login_page login_page=new login_page();
				login_page.main(null);
				login_page.getClass();
			}
		});
		btnLogin.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnLogin.setBounds(77, 307, 89, 23);
		panel_1.add(btnLogin);
	}
}
