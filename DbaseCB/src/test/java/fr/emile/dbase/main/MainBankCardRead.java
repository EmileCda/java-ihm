package fr.emile.dbase.main;

import fr.emile.Dbase.utils.Utils;
import fr.emile.dbase.entity.BankCard;
import fr.emile.dbase.model.dao.BankCardDao;
import fr.emile.dbase.model.dao.IBankCardDao;

public class MainBankCardRead {

	public static void main(String[] args) {
		final IBankCardDao myBankCardDao = new BankCardDao();
		final int userId = 12 ;
		final int bankCardId = 2 ;
		BankCard myBankCard = null; 
		try {
			
			myBankCard = new BankCard();
			myBankCard= myBankCardDao.get(bankCardId);
			Utils.trace(myBankCard.toString());
		} catch (Exception e) {
			e.printStackTrace();
			System.out.printf("Error add %s", myBankCard);
			
		}

	}

	//---------------attribut ---------------------

	//---------------conctructor ---------------------

	//---------------processing methode ---------------------

	//----------- getter-Setter--------------------

}
