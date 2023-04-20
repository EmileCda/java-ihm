package fr.emile.dbase.model.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import fr.emile.Dbase.utils.Dates;
import fr.emile.Dbase.utils.Utils;
import fr.emile.dbase.entity.Address;
import fr.emile.dbase.entity.User;
import fr.emile.dbase.model.connection.DatabaseConnection;

public class UserDao implements IUserDao {

	private final int ERROR = -1;

	public UserDao() {
		// TODO Auto-generated constructor stub
	}
	
//-----------------------------------------------------------------------------	
	@Override
	public int add(User user) throws Exception {

		Connection connection = null;
		PreparedStatement preparedStatement = null;
		ResultSet resultSet = null;
		try {
			connection = DatabaseConnection.getConnection();
			String requete = "INSERT INTO user(firstname, lastname, date_of_birth) VALUES(?,?,?)";
			preparedStatement = connection.prepareStatement(requete, Statement.RETURN_GENERATED_KEYS);
			preparedStatement.setString(1, user.getFirstname());
			preparedStatement.setString(2, user.getLastname());
			preparedStatement.setDate(3, Dates.convertDateUtilToSql(user.getDateOfBirth()));

			preparedStatement.executeUpdate();
			resultSet = preparedStatement.getGeneratedKeys();
			if (resultSet != null && resultSet.next()) {
				return resultSet.getInt(1);
			}
		} finally {
			this.closeStream(connection, preparedStatement, resultSet);
		}
		return this.ERROR;

	}
//-----------------------------------------------------------------------------	

	public int addUser(User user) throws Exception {

		Connection connection = null;
		PreparedStatement preparedStatement =null;
		ResultSet resultSet= null;
		try {
			connection = DatabaseConnection.getConnection();
			String requete = "INSERT INTO user(firstname, lastname, date_of_birth) VALUES(?,?,?)";
			preparedStatement =connection.prepareStatement(requete, Statement.RETURN_GENERATED_KEYS);
			preparedStatement.setString(1, user.getFirstname());
			preparedStatement.setString(2, user.getLastname());
			preparedStatement.setDate(3, Dates.convertDateUtilToSql(user.getDateOfBirth()));

			preparedStatement.executeUpdate();
			resultSet= preparedStatement.getGeneratedKeys();
			if (resultSet!= null && resultSet.next()) {
				return resultSet.getInt(1);
			}
		} finally {
			this.closeStream(connection, preparedStatement, resultSet);
		}
		return this.ERROR;
	}

//-----------------------------------------------------------------------------	
	@Override
	public List<User> get() throws Exception {
		Connection connection = null;
		PreparedStatement preparedStatement = null;
		ResultSet resultSet = null;
		List<User> userList = null; 
		try {
			connection = DatabaseConnection.getConnection();
			String requete = "SELECT * FROM user";
			preparedStatement = connection.prepareStatement(requete);

			preparedStatement.execute();
			resultSet = preparedStatement.getResultSet();

			if (resultSet != null) {
				final IAddressDao myAddressDao = new AddressDao();
				userList = new ArrayList<User>();
				List<Address>  addressList = new ArrayList<Address>();
				while (resultSet.next()) {
					User user = new User(resultSet.getInt("id"), resultSet.getString("firstname"), resultSet.getString("lastname"),
							Dates.convertDateSqlToUtil(resultSet.getDate("date_of_birth")));

					addressList = myAddressDao.get(user.getId());
					user.addAddress(addressList);
					userList.add(user);
				}
			}
		} finally {
			this.closeStream(connection, preparedStatement, resultSet);
		}
		return userList;
	}
	//-----------------------------------------------------------------------------	


	public List<User> getUsers() throws Exception {
		Connection connection = null;
		PreparedStatement preparedStatement =null;
		ResultSet resultSet= null;
		List<User> userList = new ArrayList<User>();
		try {
			connection = DatabaseConnection.getConnection();
			String requete = "SELECT * FROM user";
			preparedStatement =connection.prepareStatement(requete);

			preparedStatement.execute();
			resultSet= preparedStatement.getResultSet();

			if (resultSet!= null) {
				while (resultSet.next()) {
					User user = new User(resultSet.getInt("id"), resultSet.getString("firstname"), resultSet.getString("lastname"),
							Dates.convertDateSqlToUtil(resultSet.getDate("date_of_birth")));
					userList.add(user);
				}
			}
		} finally {
			this.closeStream(connection, preparedStatement, resultSet);
		}
		return userList;
	}
	
//-----------------------------------------------------------------------------	
		@Override
		public User get(int id) throws Exception {
		Connection connection = null;
		PreparedStatement preparedStatement =null;
		ResultSet resultSet = null;
		User user = null;
		try {
			connection = DatabaseConnection.getConnection();
			String requete = "SELECT * FROM user WHERE id = ?";
			preparedStatement =connection.prepareStatement(requete);
			preparedStatement.setInt(1, id);
//			Utils.trace(prepareStatement.toString());

			preparedStatement.execute();
			resultSet = preparedStatement.getResultSet();

			if (resultSet != null && resultSet.next()) {
				user = new User(resultSet.getInt("id"), resultSet.getString("firstname"), resultSet.getString("lastname"),
						Dates.convertDateSqlToUtil(resultSet.getDate("date_of_birth")));
			}
		} finally {
			this.closeStream(connection, preparedStatement, resultSet);
		}
		return user;
	}
//-----------------------------------------------------------------------------	

	public User getUserById(int id) throws Exception {

		Connection connection = null;
		PreparedStatement preparedStatement =null;
		ResultSet resultSet= null;
		User user = null;
		try {
			connection = DatabaseConnection.getConnection();
			String requete = "SELECT * FROM user WHERE id = ?";
			preparedStatement =connection.prepareStatement(requete);
			preparedStatement.setInt(1, id);

			preparedStatement.execute();
			resultSet= preparedStatement.getResultSet();

			if (resultSet!= null && resultSet.next()) {
				user = new User();
				user.setId(resultSet.getInt("id"));
				user.setFirstname(resultSet.getString("firstname"));
				user.setLastname(resultSet.getString("lastname"));
				user.setDateOfBirth(Dates.convertDateSqlToUtil(resultSet.getDate("date_of_birth")));
			}
		} finally {
			this.closeStream(connection, preparedStatement, resultSet);
		}
		return user;
	}

//-----------------------------------------------------------------------------	
	@Override
	public void Update(User user) throws Exception {
		Connection connection = null;
		PreparedStatement preparedStatement =null;
		try {
			connection = DatabaseConnection.getConnection();
			String requete = "UPDATE user SET firstname = ?, lastname = ?, date_of_birth = ? WHERE id = ?";
			preparedStatement =connection.prepareStatement(requete);
			preparedStatement.setString(1, user.getFirstname());
			preparedStatement.setString(2, user.getLastname());
			preparedStatement.setDate(3, Dates.convertDateUtilToSql(user.getDateOfBirth()));
			preparedStatement.setInt(4, user.getId());

			preparedStatement.executeUpdate();

		} finally {

			this.closeStream(connection, preparedStatement);
		}

	}
//-----------------------------------------------------------------------------	
	
	public void UpdateUser(User user) throws Exception {

		Connection connection = null;
		PreparedStatement preparedStatement =null;
		Utils.trace(user.toString());
		try {
			connection = DatabaseConnection.getConnection();
			String requete = "UPDATE user SET firstname = ?, lastname = ?, date_of_birth = ? WHERE id = ?";
			preparedStatement =connection.prepareStatement(requete);
			preparedStatement.setString(1, user.getFirstname());
			preparedStatement.setString(2, user.getLastname());
			preparedStatement.setDate(3, Dates.convertDateUtilToSql(user.getDateOfBirth()));
			preparedStatement.setInt(4, user.getId());

			Utils.trace(preparedStatement.toString());
			preparedStatement.executeUpdate();

		} finally {

			this.closeStream(connection, preparedStatement);
		}
	}
//-----------------------------------------------------------------------------	

	@Override
	public void delete(int id) throws Exception {
		Connection connection = null;
		PreparedStatement preparedStatement =null;
		try {
			connection = DatabaseConnection.getConnection();
			String requete = "DELETE FROM user WHERE id = ?";
			preparedStatement =connection.prepareStatement(requete);
			preparedStatement.setInt(1, id);

			preparedStatement.executeUpdate();

		} finally {

			this.closeStream(connection, preparedStatement);
		}

	}
//-----------------------------------------------------------------------------	

	public void deleteUser(int id) throws Exception {

		Connection connection = null;
		PreparedStatement preparedStatement =null;
		try {
			connection = DatabaseConnection.getConnection();
			String requete = "DELETE FROM user WHERE id = ?";
			preparedStatement =connection.prepareStatement(requete);
			preparedStatement.setInt(1, id);

			preparedStatement.executeUpdate();

		} finally {

			this.closeStream(connection, preparedStatement);
		}
	}
//-----------------------------------------------------------------------------	

	private void closeStream(Connection connection, PreparedStatement preparedStatement, ResultSet resultSet)
			throws Exception {

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
//-----------------------------------------------------------------------------
	private void closeStream(Connection connection, PreparedStatement preparedStatement)
			throws Exception {
		
		closeStream(connection, preparedStatement, null);

	}

	// ---------------attribut ---------------------

	// ---------------conctructor ---------------------

	// ---------------processing methode ---------------------

	// ----------- getter-Setter--------------------

}
