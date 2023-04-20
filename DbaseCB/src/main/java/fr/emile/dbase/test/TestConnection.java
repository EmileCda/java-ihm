package fr.emile.dbase.test;

import java.sql.Connection;

import fr.emile.dbase.model.connection.DatabaseConnection;

public class TestConnection {

	public static void main(String[] args) {

		
		
		Connection connection = null;
		try {
			connection = DatabaseConnection.getConnection();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			System.out.println(connection);
			
		}

		

	}

	// ---------------attribut ---------------------

	// ---------------conctructor ---------------------

	// ---------------processing methode ---------------------

	// ----------- getter-Setter--------------------

}
