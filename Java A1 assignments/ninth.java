package training;

import java.util.Scanner;

public class lava {
	public static void main(String args[])
	{
	int total,average;
	 for(int i=1; i<=3; i++)
	 {
		 Scanner s = new Scanner(System.in);
		 System.out.println("enter student name");
		 String name =s.nextLine();
		 System.out.println("Enter the First Subject marks");
		 int sub1=s.nextInt();
		 System.out.println("Enter the second Subject marks");
		 int sub2=s.nextInt();
		 System.out.println("Enter the third Subject marks");
		 int sub3=s.nextInt();
		 total = sub1+sub2+sub3;
		 average = total/3;
		 System.out.println(s+ "total marks" +total);
		 System.out.println(s+ "total marks" +average);
		 }
		
	
	}
}
						
			
			
			
			
		
	
	
	
	

