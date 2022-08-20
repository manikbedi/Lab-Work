package string_and_parsing;

import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class Exercise9 {
	
	void date(LocalDate pdate){
		
        LocalDate now = LocalDate.now();
 
        Period diff = Period.between(pdate, now);
 
     System.out.printf("\nDifference is %d years, %d months and %d days old\n\n", 
                    diff.getYears(), diff.getMonths(), diff.getDays());
		
	}
	 
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int dayInput=sc.nextInt();
				int monthInput=sc.nextInt();
				int yearInput=sc.nextInt();
		

		LocalDate pdate = LocalDate.of( yearInput , monthInput , dayInput );
		sc.close();
		Exercise9 e9 = new Exercise9();
		e9.date(pdate);
		

	}

}
