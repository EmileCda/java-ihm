package fr.emile.Dbase.utils;

public final class Utils {

	
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
}

