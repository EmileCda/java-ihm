package fr.emile.dbase.model.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import fr.emile.Dbase.utils.Dates;
import fr.emile.Dbase.utils.Utils;
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
//-----------------------------------------------------------------------------	

	public int addUser(User user) throws Exception {

		Connection connection = null;
		PreparedStatement prepareStatement = null;
		ResultSet resultSet= null;
		try {
			connection = DatabaseConnection.getConnection();
			String requete = "INSERT INTO user(firstname, lastname, date_of_birth) VALUES(?,?,?)";
			prepareStatement = connection.prepareStatement(requete, Statement.RETURN_GENERATED_KEYS);
			prepareStatement.setString(1, user.getFirstname());
			prepareStatement.setString(2, user.getLastname());
			prepareStatement.setDate(3, Dates.convertDateUtilToSql(user.getDateOfBirth()));

			prepareStatement.executeUpdate();
			resultSet= prepareStatement.getGeneratedKeys();
			if (resultSet!= null && resultSet.next()) {
				return resultSet.getInt(1);
			}
		} finally {
			if (resultSet!= null && !resultSet.isClosed()) {
				resultSet.close();
			}
			if (prepareStatement != null && !prepareStatement.isClosed()) {
				prepareStatement.close();
			}
			if (connection != null && !connection.isClosed()) {
				connection.close();
			}
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
				userList = new ArrayList<User>();
				while (resultSet.next()) {
					User user = new User(resultSet.getInt("id"), resultSet.getString("firstname"), resultSet.getString("lastname"),
							Dates.convertDateSqlToUtil(resultSet.getDate("date_of_birth")));
					userList.add(user);
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
		return userList;
	}
	//-----------------------------------------------------------------------------	


	public List<User> getUsers() throws Exception {
		Connection connection = null;
		PreparedStatement prepareStatement = null;
		ResultSet resultSet= null;
		List<User> userList = new ArrayList<User>();
		try {
			connection = DatabaseConnection.getConnection();
			String requete = "SELECT * FROM user";
			prepareStatement = connection.prepareStatement(requete);

			prepareStatement.execute();
			resultSet= prepareStatement.getResultSet();

			if (resultSet!= null) {
				while (resultSet.next()) {
					User user = new User(resultSet.getInt("id"), resultSet.getString("firstname"), resultSet.getString("lastname"),
							Dates.convertDateSqlToUtil(resultSet.getDate("date_of_birth")));
					userList.add(user);
				}
			}
		} finally {
			if (resultSet!= null && !resultSet.isClosed()) {
				resultSet.close();
			}
			if (prepareStatement != null && !prepareStatement.isClosed()) {
				prepareStatement.close();
			}
			if (connection != null && !connection.isClosed()) {
				connection.close();
			}
		}
		return userList;
	}
	
//-----------------------------------------------------------------------------	
		@Override
		public User get(int id) throws Exception {
		Connection connection = null;
		PreparedStatement prepareStatement = null;
		ResultSet resultSet = null;
		User user = null;
		try {
			connection = DatabaseConnection.getConnection();
			String requete = "SELECT * FROM user WHERE id = ?";
			prepareStatement = connection.prepareStatement(requete);
			prepareStatement.setInt(1, id);
//			Utils.trace(prepareStatement.toString());

			prepareStatement.execute();
			resultSet = prepareStatement.getResultSet();

			if (resultSet != null && resultSet.next()) {
				user = new User(resultSet.getInt("id"), resultSet.getString("firstname"), resultSet.getString("lastname"),
						Dates.convertDateSqlToUtil(resultSet.getDate("date_of_birth")));
			}
		} finally {
			if (resultSet != null && !resultSet.isClosed()) {
				resultSet.close();
			}
			if (prepareStatement != null && !prepareStatement.isClosed()) {
				prepareStatement.close();
			}
			if (connection != null && !connection.isClosed()) {
				connection.close();
			}
		}
		return user;
	}
//-----------------------------------------------------------------------------	

	public User getUserById(int id) throws Exception {

		Connection connection = null;
		PreparedStatement prepareStatement = null;
		ResultSet resultSet= null;
		User user = null;
		try {
			connection = DatabaseConnection.getConnection();
			String requete = "SELECT * FROM user WHERE id = ?";
			prepareStatement = connection.prepareStatement(requete);
			prepareStatement.setInt(1, id);

			prepareStatement.execute();
			resultSet= prepareStatement.getResultSet();

			if (resultSet!= null && resultSet.next()) {
				user = new User();
				user.setId(resultSet.getInt("id"));
				user.setFirstname(resultSet.getString("firstname"));
				user.setLastname(resultSet.getString("lastname"));
				user.setDateOfBirth(Dates.convertDateSqlToUtil(resultSet.getDate("date_of_birth")));
			}
		} finally {
			if (resultSet!= null && !resultSet.isClosed()) {
				resultSet.close();
			}
			if (prepareStatement != null && !prepareStatement.isClosed()) {
				prepareStatement.close();
			}
			if (connection != null && !connection.isClosed()) {
				connection.close();
			}
		}
		return user;
	}

//-----------------------------------------------------------------------------	
	@Override
	public void Update(User user) throws Exception {
		Connection connection = null;
		PreparedStatement prepareStatement = null;
		try {
			connection = DatabaseConnection.getConnection();
			String requete = "UPDATE user SET firstname = ?, lastname = ?, date_of_birth = ? WHERE id = ?";
			prepareStatement = connection.prepareStatement(requete);
			prepareStatement.setString(1, user.getFirstname());
			prepareStatement.setString(2, user.getLastname());
			prepareStatement.setDate(3, Dates.convertDateUtilToSql(user.getDateOfBirth()));
			prepareStatement.setInt(4, user.getId());

			prepareStatement.executeUpdate();

		} finally {

			if (prepareStatement != null && !prepareStatement.isClosed()) {
				prepareStatement.close();
			}
			if (connection != null && !connection.isClosed()) {
				connection.close();
			}
		}

	}
//-----------------------------------------------------------------------------	
	
	public void UpdateUser(User user) throws Exception {

		Connection connection = null;
		PreparedStatement prepareStatement = null;
		Utils.trace(user.toString());
		try {
			connection = DatabaseConnection.getConnection();
			String requete = "UPDATE user SET firstname = ?, lastname = ?, date_of_birth = ? WHERE id = ?";
			prepareStatement = connection.prepareStatement(requete);
			prepareStatement.setString(1, user.getFirstname());
			prepareStatement.setString(2, user.getLastname());
			prepareStatement.setDate(3, Dates.convertDateUtilToSql(user.getDateOfBirth()));
			prepareStatement.setInt(4, user.getId());

			Utils.trace(prepareStatement.toString());
			prepareStatement.executeUpdate();

		} finally {

			if (prepareStatement != null && !prepareStatement.isClosed()) {
				prepareStatement.close();
			}
			if (connection != null && !connection.isClosed()) {
				connection.close();
			}
		}
	}
//-----------------------------------------------------------------------------	

	@Override
	public void delete(int id) throws Exception {
		Connection connection = null;
		PreparedStatement prepareStatement = null;
		try {
			connection = DatabaseConnection.getConnection();
			String requete = "DELETE FROM user WHERE id = ?";
			prepareStatement = connection.prepareStatement(requete);
			prepareStatement.setInt(1, id);

			prepareStatement.executeUpdate();

		} finally {

			if (prepareStatement != null && !prepareStatement.isClosed()) {
				prepareStatement.close();
			}
			if (connection != null && !connection.isClosed()) {
				connection.close();
			}
		}

	}
//-----------------------------------------------------------------------------	

	public void deleteUser(int id) throws Exception {

		Connection connection = null;
		PreparedStatement prepareStatement = null;
		try {
			connection = DatabaseConnection.getConnection();
			String requete = "DELETE FROM user WHERE id = ?";
			prepareStatement = connection.prepareStatement(requete);
			prepareStatement.setInt(1, id);

			prepareStatement.executeUpdate();

		} finally {

			if (prepareStatement != null && !prepareStatement.isClosed()) {
				prepareStatement.close();
			}
			if (connection != null && !connection.isClosed()) {
				connection.close();
			}
		}
	}
//-----------------------------------------------------------------------------	

	// ---------------attribut ---------------------

	// ---------------conctructor ---------------------

	// ---------------processing methode ---------------------

	// ----------- getter-Setter--------------------

}
