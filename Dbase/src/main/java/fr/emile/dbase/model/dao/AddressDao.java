package fr.emile.dbase.model.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import fr.emile.Dbase.utils.Utils;
import fr.emile.dbase.entity.Address;
import fr.emile.dbase.model.connection.DatabaseConnection;

public class AddressDao implements IAddressDao {
	private final int ERROR = -1;

	public AddressDao() {
		// TODO Auto-generated constructor stub
	}
//-----------------------------------------------------------------------------	

	@Override
	public int add(Address address) throws Exception {

		Connection connection = null;
		PreparedStatement preparedStatement = null;
		ResultSet resultSet = null;
		try {
			connection = DatabaseConnection.getConnection();
			String requete = "INSERT INTO address(number, street, city,zip_code,user_id) VALUES(?,?,?,?,?)";
			preparedStatement = connection.prepareStatement(requete, Statement.RETURN_GENERATED_KEYS);
			preparedStatement.setString(1, address.getNumber());
			preparedStatement.setString(2, address.getStreet());
			preparedStatement.setString(3, address.getCity());
			preparedStatement.setString(4, address.getZipCode());
			preparedStatement.setInt(5, address.getIdUser());

			preparedStatement.executeUpdate();
			resultSet = preparedStatement.getGeneratedKeys();
			if (resultSet != null && resultSet.next()) {
				return resultSet.getInt(1);
			}
		} finally {
			if (resultSet != null && !resultSet.isClosed()) {
				resultSet.close();
			}
			if (preparedStatement != null && !preparedStatement.isClosed()) {
				preparedStatement.close();
			}
			if (connection != null && !connection.isClosed()) {
				connection.close();
			}
		}
		return this.ERROR;
	}

	// -----------------------------------------------------------------------------
	@Override
	public List<Address> get() throws Exception {
		Connection connection = null;
		PreparedStatement preparedStatement = null;
		ResultSet resultSet = null;
		List<Address> addressList = null;
		try {
			connection = DatabaseConnection.getConnection();
			String requete = "SELECT * FROM address";
			preparedStatement = connection.prepareStatement(requete);

			preparedStatement.execute();
			resultSet = preparedStatement.getResultSet();

			if (resultSet != null) {
				addressList = new ArrayList<Address>();
				while (resultSet.next()) {
					Address address = new Address( 
							resultSet.getInt("id"),
							resultSet.getString("number"),
							resultSet.getString("street"),
							resultSet.getString("city"),
							resultSet.getString("zip_code"),
							resultSet.getInt("user_id"));
							
					addressList.add(address);
				}
			}
		} finally {
			if (resultSet != null && !resultSet.isClosed()) {
				resultSet.close();
			}
			if (preparedStatement != null && !preparedStatement.isClosed()) {
				preparedStatement.close();
			}
			if (connection != null && !connection.isClosed()) {
				connection.close();
			}
		}
		return addressList;
	}

	// -----------------------------------------------------------------------------
	@Override
	public void Update(Address address) throws Exception {
		Connection connection = null;
		PreparedStatement preparedStatement = null;
		try {
			connection = DatabaseConnection.getConnection();
			String requete = "UPDATE address SET  number = ?, street = ?, city = ?, zip_code= ?, user_id = ? WHERE id = ?";
			preparedStatement = connection.prepareStatement(requete);
			
			preparedStatement.setString(1, address.getNumber());
			preparedStatement.setString(2, address.getStreet());
			preparedStatement.setString(3, address.getCity());
			preparedStatement.setString(4, address.getZipCode());
			preparedStatement.setInt(5, address.getIdUser());
			preparedStatement.setInt(6, address.getId());

			Utils.trace(preparedStatement.toString());
			preparedStatement.executeUpdate();

		} finally {

			if (preparedStatement != null && !preparedStatement.isClosed()) {
				preparedStatement.close();
			}
			if (connection != null && !connection.isClosed()) {
				connection.close();
			}
		}

	}

	// -----------------------------------------------------------------------------
	@Override
	public void delete(int id) throws Exception {
		Connection connection = null;
		PreparedStatement preparedStatement = null;
		try {
			connection = DatabaseConnection.getConnection();
			String requete = "DELETE FROM address WHERE id = ?";
			preparedStatement = connection.prepareStatement(requete);
			preparedStatement.setInt(1, id);

			preparedStatement.executeUpdate();

		} finally {

			if (preparedStatement != null && !preparedStatement.isClosed()) {
				preparedStatement.close();
			}
			if (connection != null && !connection.isClosed()) {
				connection.close();
			}
		}

	}

	// -----------------------------------------------------------------------------
	@Override
	public List<Address> get(int userId) throws Exception {
		Connection connection = null;
		PreparedStatement preparedStatement = null;
		ResultSet resultSet = null;
		List<Address> addressList = null;
		try {
			connection = DatabaseConnection.getConnection();
			String requete = "SELECT * FROM address WHERE user_id=?";

			preparedStatement = connection.prepareStatement(requete);
			preparedStatement.setInt(1, userId);

			preparedStatement.execute();
			resultSet = preparedStatement.getResultSet();

			if (resultSet != null) {
				addressList = new ArrayList<Address>();
				while (resultSet.next()) {
					Address address = new Address( 
							resultSet.getInt("id"),
							resultSet.getString("number"),
							resultSet.getString("street"),
							resultSet.getString("city"),
							resultSet.getString("zip_code"),
							resultSet.getInt("user_id"));
							
					addressList.add(address);
				}
			}
		} finally {
			if (resultSet != null && !resultSet.isClosed()) {
				resultSet.close();
			}
			if (preparedStatement != null && !preparedStatement.isClosed()) {
				preparedStatement.close();
			}
			if (connection != null && !connection.isClosed()) {
				connection.close();
			}
		}
		return addressList;
	}

	// ---------------attribut ---------------------

	// ---------------conctructor ---------------------

	// ---------------processing methode ---------------------

	// ----------- getter-Setter--------------------

}
