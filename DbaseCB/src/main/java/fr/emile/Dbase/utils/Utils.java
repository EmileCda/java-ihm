package fr.emile.Dbase.utils;

import java.text.SimpleDateFormat;
import java.util.Date;

public abstract class Utils {

	
	private Utils() {};
	
	
	public static void trace(String msg) {
		Throwable sys = new Throwable();
		
		System.out.printf("=>[%s]:%d : %s\n",sys.getStackTrace()[1].getFileName(),
				sys.getStackTrace()[1].getLineNumber(),msg);
		
		
//		System.out.println("Trace: " + 
//					   "file " + new Throwable().getStackTrace()[1].getFileName() +
//					   " class " + new Throwable().getStackTrace()[1].getClassName() +
//					   " method " + new Throwable().getStackTrace()[1].getMethodName() +
//					   " line " + new Throwable().getStackTrace()[1].getLineNumber());
	}
	
	
	
	
	
	public  static Date toJavaDate(java.sql.Date sqlDate) {
		
		return new Date(sqlDate.getTime());
	}; 
	

	public static java.sql.Date toSqlDate(Date mydate) {
		
		return new java.sql.Date(mydate.getTime());
	}; 

	
	public static Date string2Date(String dateString,String dateFormat) throws Exception{
		return new SimpleDateFormat(dateFormat).parse(dateString);

	}	
	
	
}

