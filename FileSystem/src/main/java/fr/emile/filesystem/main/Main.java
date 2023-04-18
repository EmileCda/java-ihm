package fr.emile.filesystem.main;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.util.Scanner;

//https://waytolearnx.com/2020/03/creer-un-fichier-en-java.html
public class Main {

	private final static String fileName = "/home/arfmazad/Documents/dev/java-ihm/newFile.txt";
	private final static String encoding = "UTF-8";
	

	public static void main(String[] args) {
		
        String str = "String to append : option false\n";
        try {
  
            // attach a file to FileWriter
            FileWriter fw   = new FileWriter(fileName,false);
  
            fw.write(str);
  
            fw.close();
        }
        catch (Exception e) {
            e.getStackTrace();
        }

	}

	
//	https://www.delftstack.com/fr/howto/java/read-file-in-java/
	public static void readFile() {
		File myFile = new File(fileName);

		        Scanner objFile;
				try {
					objFile = new Scanner(myFile);
			        while (objFile.hasNextLine()) {
			            System.out.println(objFile.nextLine());
			        }
				} catch (FileNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

	}

	
	public static void createFile() {
		try {

			File myFile = new File(fileName);

			if (myFile.createNewFile()) {
				System.out.println("Le fichier est créé.");
			} else {
				System.out.println("Le fichier existe déjà.");
			}

		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			System.out.println("end of create.");

		}

	}

}
