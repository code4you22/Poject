package pharma;
import java.sql.*;

import javax.swing.*;
public class Sqlite_Connec {

	Connection connec=null;
	public static Connection dbConnector()
	{
	try{
	Class.forName("org.sqlite.JDBC");
	Connection connec=DriverManager.getConnection("jdbc:sqlite:C:\\Users\\Dell\\Desktop\\New folder\\Database\\Pharmacy_Database.sqlite");
	//JOptionPane.showMessageDialog(null, "CONNECTION DONE", "Database Status",1 );  this line tell about right database connection but it will run every time before the page open
	return connec;
	}
	catch(Exception e){
		JOptionPane.showMessageDialog(null, "ERROR IN CONNECTION","Datebase Status",0);

	return null;
	}
	}
}
