package fr.emile.dbase.main;

import java.text.SimpleDateFormat;
import java.util.Date;

import fr.emile.Dbase.utils.Utils;

public class MainUtils {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Date myDate = null;
		try {
			myDate = Utils.string2Date("25061965", "ddmmyyyy");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {

			System.out.printf("date : %s", myDate);
		}
	}

}
