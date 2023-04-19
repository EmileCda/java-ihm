package fr.emile.dbmaven.main;

import java.sql.Connection;

import fr.emile.dbmaven.model.connection.DatabaseConnection;


public class Main {

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

}
