package lab6;

import java.sql.Date;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Period;
import java.time.Year;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;

public class Exercise6 {
	List votersList(Map<Long,String> map) {
		ArrayList<Long> arl=new ArrayList<>();
		LocalDate now = LocalDate.now();
		String curdate=now.toString();
		  
		Set<Map.Entry<Long, String>> s = map.entrySet();
		for (Map.Entry<Long, String> it : s) {
			try {
			 SimpleDateFormat obj = new SimpleDateFormat("MM-dd-yyyy");  
			  java.util.Date date1 = obj.parse(curdate);   
	          java.util.Date date2 = obj.parse(it.getValue()); 
	          long time_difference = date2.getTime() - date1.getTime();
	          long years_difference = (time_difference / (1000l*60*60*24*365));
	          if(years_difference>18) arl.add(it.getKey());
			}
			catch(Exception e) {e.printStackTrace();}
		
			
			
		}
		return arl;
		
	}

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Total number of people");
		int p=sc.nextInt();
		HashMap<Long,String> map = new HashMap<>();
		int up =9999999;
		Random rand =new Random();
		
		
		for(int i =0;i<p;i++) {
			System.out.println("enter date of birth in dd/mm/yyyy  format");
			
			long rd = rand.nextInt(up);
			System.out.println(rd);
			
			String sDate1=sc.nextLine(); 
			map.put(rd, sDate1);
		
		}
		Exercise6 e6=new Exercise6();
		System.out.println(e6.votersList(map));

	}

}
