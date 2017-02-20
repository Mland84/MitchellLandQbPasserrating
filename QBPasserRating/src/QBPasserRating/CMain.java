package QBPasserRating;

import java.util.Scanner;

public class CMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		System.out.println("How many passes has the quarterback attempted?");
		double attempted=input.nextDouble();
		System.out.println("How many of the quarterbacks passes are completions?");
		double completions = input.nextDouble();
		System.out.println("How many touchdowns has the quarterback thrown?");
		double touchdowns= input.nextDouble();
		System.out.println("How many yards has the quarterback thrown for?");
		double yards = input.nextDouble();
		System.out.println("How many interceptions has the quarterback thrown?");
		double interceptions = input.nextDouble();
		
		double a = ((completions/attempted*100-30)*0.05);
			if (a>2.375){
			a=2.375;
		}
		double b = ((yards/attempted-3.0)*0.25);
			if (b>2.375){
				b=2.375;
			
		}
		double c = ((touchdowns/attempted)*20);
		if (c>2.375){
		c=2.375;
		}
		double d = (2.375-((interceptions/attempted)*100*0.25));
		if (d<0){
		d=0;
		}
		double passerratingdecimal= (((a+b+c+d)/6.0));
		double passerrating=passerratingdecimal*100;
		
		System.out.println("The quarterbacks passer rating is: " + passerrating);
		
		
	}

	
}

	
	
