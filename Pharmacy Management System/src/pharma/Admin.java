package pharma;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;

import java.awt.Color;

import javax.swing.JTextField;

public class Admin {

	private JFrame frame;
	private JTextField textFieldownername;
	private JTextField textFieldadminname;
	private JTextField textFieldemergancynumber;
	private JTextField textFieldfavpersonality;

	/**
	 * Launch the application.
	 */
	public void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Admin window = new Admin();
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
	public Admin() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 721, 471);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		
		
		JLabel lblNewLabel = new JLabel("PHARMACY MANAGEMENT SYSTEM");
		lblNewLabel.setBounds(0, 0, 691, 48);
		lblNewLabel.setFont(new Font("Dialog", Font.BOLD, 36));
		frame.getContentPane().add(lblNewLabel);
		
		JPanel panel = new JPanel();
		panel.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel.setBounds(103, 101, 487, 300);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblYourFavouritePersonality = new JLabel("Your Favourite Personality ?");
		lblYourFavouritePersonality.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblYourFavouritePersonality.setBounds(277, 108, 200, 20);
		panel.add(lblYourFavouritePersonality);
		
		textFieldownername = new JTextField();
		textFieldownername.setBounds(19, 51, 143, 20);
		panel.add(textFieldownername);
		textFieldownername.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Owner Name");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_1.setBounds(46, 14, 116, 14);
		panel.add(lblNewLabel_1);
		
		JLabel lblAdminName = new JLabel("Admin Name");
		lblAdminName.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblAdminName.setBounds(308, 11, 125, 20);
		panel.add(lblAdminName);
		
		textFieldadminname = new JTextField();
		textFieldadminname.setBounds(280, 51, 143, 20);
		panel.add(textFieldadminname);
		textFieldadminname.setColumns(10);
		
		JLabel lblEmergancyNumber = new JLabel("Saved Number");
		lblEmergancyNumber.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblEmergancyNumber.setBounds(46, 108, 143, 20);
		panel.add(lblEmergancyNumber);
		
		textFieldemergancynumber = new JTextField();
		textFieldemergancynumber.setBounds(19, 162, 143, 20);
		panel.add(textFieldemergancynumber);
		textFieldemergancynumber.setColumns(10);
		
		textFieldfavpersonality = new JTextField();
		textFieldfavpersonality.setBounds(278, 162, 155, 20);
		panel.add(textFieldfavpersonality);
		textFieldfavpersonality.setColumns(10);
		
		JButton btnSubmit = new JButton("SUBMIT");
		btnSubmit.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnSubmit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try{
					String oname=textFieldownername.getText();
					String Admin=textFieldadminname.getText();
					String Emr=textFieldemergancynumber.getText();
					String favp=textFieldfavpersonality.getText();
					if(oname.equals("admin")&& Admin.equals("admin")&&Emr.equals("7837741985")&&favp.equals("DHONI"))
					{
						JOptionPane.showMessageDialog(null, "Proceed to Next");
						frame.dispose();
						Database Database=new Database();
						Database.main(null);
						Database.getClass();
					}else{
						JOptionPane.showMessageDialog(null, "Error Occured");
					}
					}catch(Exception e)
					{
					JOptionPane.showMessageDialog(null, "Error Occured");
					}
			}
		});
		btnSubmit.setBounds(282, 239, 89, 23);
		panel.add(btnSubmit);
		
		JButton button = new JButton("EXIT");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.exit(JFrame.EXIT_ON_CLOSE);
			}
		});
		button.setFont(new Font("Tahoma", Font.BOLD, 12));
		button.setBounds(68, 239, 76, 23);
		panel.add(button);
	}
	}


