package fr.emile.dbase.model.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.ResourceBundle;

public final class DatabaseConnection {

	private DatabaseConnection() {
		// TODO Auto-generated constructor stub
	}

	
	
	//---------------attribut ---------------------

	//---------------conctructor ---------------------

	//---------------processing methode ---------------------
public static Connection  getConnection() throws Exception {
	ResourceBundle  myResource = ResourceBundle.getBundle("Dbase"); // retreive data from Dbase.properties
	
	String dbUser = myResource.getString("user");
	String dbPass= myResource.getString("password");
	String dbUrl = myResource.getString("url");
	
	
//	System.out.printf("user %s pass %s url %s\n", dbUser, dbPass, dbUrl);
	// create  the connection to return
	Connection myConection = DriverManager.getConnection(dbUrl, dbUser, dbPass);
	
	return myConection ; 
}
	//----------- getter-Setter--------------------

}
