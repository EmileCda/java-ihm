package fr.emile.school.main;

import fr.emile.school.entity.ExchangeStudent;
import fr.emile.school.entity.RegularStudent;
import fr.emile.school.entity.School;
import fr.emile.school.entity.Secretary;
import fr.emile.school.entity.Teacher;

public class Main {

	public static void main(String[] args) {


		School school =new School(5);
		
		school.add(new RegularStudent("Gaston Peutimide",2008,"SSC",6.0));
		school.add(new RegularStudent("Yvan Rattrapeu",2009,"SSC",2.5));
		school.add(new ExchangeStudent("Bjorn Borgue",2010,"Informatique","KTH"));
		school.add(new Teacher("Mathieu Matheu",1998,"LMEP",10000,"Physique"));
		school.add(new Secretary("Sophie Scribona",1995,"LMT",5000));
		
		school.displayStat();
		school.displayAlien();
	}

}
