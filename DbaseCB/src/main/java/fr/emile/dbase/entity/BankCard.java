package fr.emile.dbase.entity;

public class BankCard {
	
	private int id ; 
	private String cardNumber ; 
	private String expiryDate ; 
	private String crypto ;
	private boolean isValid ;
	private boolean isDeleted ;
	private int userId;
	
	//------------------------ constructor --------------
	/**
	 * @param id
	 * @param cardNumber
	 * @param expiryDate
	 * @param crypto
	 * @param isValid
	 * @param isdeleted
	 */
	public BankCard(int id, String cardNumber, String expiryDate, String crypto, boolean isValid, boolean isdeleted, int userId) {
		this.setId( id);
		this.setCardNumber(cardNumber);
		this.setExpiryDate(expiryDate);
		this.setCrypto(crypto);
		this.setIsValid(isValid);
		this.setIsDeleted(isdeleted);
		this.setUserId(userId);
	}
	
	public BankCard( String cardNumber, String expiryDate, String crypto, int userId) {
		this (-1, cardNumber, expiryDate, crypto,true,false,userId); 
	}
	public BankCard( String cardNumber, String expiryDate, String crypto) {
		this (-1, cardNumber, expiryDate, crypto,true,false,-1); 
	}
	
	public BankCard() {
		this (-1, "", "", "",true,false,-1); 
	}
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCardNumber() {
		return cardNumber;
	}
	public void setCardNumber(String cardNumber) {
		this.cardNumber = cardNumber;
	}
	public String getExpiryDate() {
		return expiryDate;
	}
	public void setExpiryDate(String expiryDate) {
		this.expiryDate = expiryDate;
	}
	public String getCrypto() {
		return crypto;
	}
	public void setCrypto(String crypto) {
		this.crypto = crypto;
	}
	public boolean getIsValid() {
		return isValid;
	}
	public void setIsValid(boolean isValid) {
		this.isValid = isValid;
	}
	public boolean getIsDeleted() {
		return isDeleted;
	}
	public void setIsDeleted(boolean isdeleted) {
		this.isDeleted = isdeleted;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	@Override
	public String toString() {
		return String.format(
				"BC %d: %s exp:%s cry[%s] %s,%s  userId : %d",
				getId(), getCardNumber(), getExpiryDate(), getCrypto(), 
				getIsValid() ? "Valid" : "inValid" , getIsDeleted() ? "deleted" :"in use", getUserId());
	}
	
	


}
