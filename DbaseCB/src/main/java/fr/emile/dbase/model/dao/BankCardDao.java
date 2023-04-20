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
import fr.emile.dbase.entity.BankCard;
import fr.emile.dbase.entity.User;
import fr.emile.dbase.model.connection.DatabaseConnection;

public class BankCardDao implements IBankCardDao {
	private final int ERROR = -1;

	public BankCardDao() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public int add(BankCard bankCard) throws Exception {
		Connection connection = null;
		PreparedStatement preparedStatement = null;
		ResultSet resultSet = null;
		try {
			connection = DatabaseConnection.getConnection();

			String request = "INSERT INTO `exempledb`.`bank_card` (`card_number`,`expiry_date`,`crypto`, `is_valid`,	`is_delete`,`user_id`) VALUES	(? ,? ,? ,? ,?,? )";

			preparedStatement = connection.prepareStatement(request, Statement.RETURN_GENERATED_KEYS);
			preparedStatement.setString(1, bankCard.getCardNumber());
			preparedStatement.setString(2, bankCard.getExpiryDate());
			preparedStatement.setString(3, bankCard.getCrypto());
			preparedStatement.setBoolean(4, bankCard.getIsValid());
			preparedStatement.setBoolean(5, bankCard.getIsDeleted());
			preparedStatement.setInt(6, bankCard.getUserId());

			preparedStatement.executeUpdate();
			resultSet = preparedStatement.getGeneratedKeys();
			if (resultSet != null && resultSet.next()) {
				return resultSet.getInt(1); // return only one value (1) Statement.RETURN_GENERATED_KEYS
			}
		} finally {
			this.closeStream(connection, preparedStatement, resultSet);
		}
		return this.ERROR;
	}

//-----------------------------------------------------------------------------
	@Override
	public BankCard get(int Id) throws Exception {
		Connection connection = null;
		PreparedStatement preparedStatement = null;
		ResultSet resultSet = null;
		BankCard  bankCard = null;
		try {
			connection = DatabaseConnection.getConnection();
			String request = "SELECT id,card_number, expiry_date,crypto,is_valid,is_delete,user_id FROM bank_card WHERE id = ?";
			preparedStatement = connection.prepareStatement(request);
			preparedStatement.setInt(1, Id);

			preparedStatement.execute();
			resultSet = preparedStatement.getResultSet();


			if (resultSet != null && resultSet.next()) {
				bankCard = new BankCard(
						resultSet.getInt("id"), 
						resultSet.getString("card_number"), 
						resultSet.getString("expiry_date"),
						resultSet.getString("crypto"),
						resultSet.getBoolean("is_valid"),
						resultSet.getBoolean("is_delete"),
						resultSet.getInt("user_id"));
			}
			
		} finally {
			this.closeStream(connection, preparedStatement, resultSet);
		}
		return bankCard;
	}

//---------------------------------------------------------------------------------------------------------------------------------
	@Override
	public List<BankCard> get(User user) throws Exception {

		Connection connection = null;
		PreparedStatement preparedStatement = null;
		ResultSet resultSet = null;
		List<BankCard> bankCardList = null;
		try {
			connection = DatabaseConnection.getConnection();
			String request = "SELECT id,card_number, expiry_date,crypto,is_valid,is_delete,user_id FROM bank_card WHERE user_id = ?";
			preparedStatement = connection.prepareStatement(request);
			preparedStatement.setInt(1, user.getId());

			preparedStatement.execute();
			resultSet = preparedStatement.getResultSet();

			if (resultSet != null) {
				bankCardList = new ArrayList<BankCard>();

				while (resultSet.next()) {
					BankCard bankCard = new BankCard(resultSet.getInt("id"), resultSet.getString("card_number"),
							resultSet.getString("expiry_date"), resultSet.getString("crypto"),
							resultSet.getBoolean("is_valid"), resultSet.getBoolean("is_delete"),
							resultSet.getInt("user_id"));

					bankCardList.add(bankCard);
				}
			}
		} finally {
			this.closeStream(connection, preparedStatement, resultSet);
		}
		return bankCardList;
	}

//---------------------------------------------------------------------------------------------------------------------------------
	@Override
	public List<BankCard> get() throws Exception {
		Connection connection = null;
		PreparedStatement preparedStatement = null;
		ResultSet resultSet = null;
		List<BankCard> bankCardList = null;
		try {
			connection = DatabaseConnection.getConnection();
			String request = "SELECT id,card_number, expiry_date,crypto,is_valid,is_delete,user_id FROM bank_card";
			preparedStatement = connection.prepareStatement(request);

			preparedStatement.execute();
			resultSet = preparedStatement.getResultSet();

			if (resultSet != null) {
				bankCardList = new ArrayList<BankCard>();

				while (resultSet.next()) {
					BankCard bankCard = new BankCard(resultSet.getInt("id"), resultSet.getString("card_number"),
							resultSet.getString("expiry_date"), resultSet.getString("crypto"),
							resultSet.getBoolean("is_valid"), resultSet.getBoolean("is_delete"),
							resultSet.getInt("user_id"));

					bankCardList.add(bankCard);
				}
			}
		} finally {
			this.closeStream(connection, preparedStatement, resultSet);
		}
		return bankCardList;
	}

	@Override
	public int Update(BankCard bankCard, boolean isValid) throws Exception {

		Connection connection = null;
		PreparedStatement preparedStatement = null;
		ResultSet resultSet = null;
		int result = 0;

		try {

			connection = DatabaseConnection.getConnection();

			String request = "UPDATE `bank_card` SET `is_valid` = ? WHERE `id` = ?;";
			preparedStatement = connection.prepareStatement(request);
			preparedStatement.setBoolean(1, isValid);
			preparedStatement.setInt(2, bankCard.getId());
			Utils.trace(preparedStatement.toString());
			preparedStatement.execute();
			resultSet = preparedStatement.getResultSet();
			if (resultSet != null && resultSet.next()) {
				result = resultSet.getInt(1); // return only one value (1) Statement.RETURN_GENERATED_KEYS
			}

			// TODO Auto-generated method stub
		} finally {
			this.closeStream(connection, preparedStatement, resultSet);
		}
		return result;

	}

	@Override
	public int delete(BankCard bankCard) throws Exception {
		// TODO Auto-generated method stub
		Connection connection = null;
		PreparedStatement preparedStatement = null;
		ResultSet resultSet = null;
		int result = 0;

		try {

			connection = DatabaseConnection.getConnection();

			String request = "UPDATE `bank_card` SET `is_delete` = true  WHERE `id` = ?;";
			preparedStatement = connection.prepareStatement(request);

			preparedStatement.setInt(1, bankCard.getId());
			preparedStatement.execute();
			resultSet = preparedStatement.getResultSet();
			if (resultSet != null && resultSet.next()) {
				result = resultSet.getInt(1); // return only one value (1) Statement.RETURN_GENERATED_KEYS
			}

		} finally {
			this.closeStream(connection, preparedStatement, resultSet);
		}

		return result;

	}

	// ---------------processing methode ---------------------
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

	// -----------------------------------------------------------------------------
	private void closeStream(Connection connection, PreparedStatement preparedStatement) throws Exception {

		closeStream(connection, preparedStatement, null);

	}
}
