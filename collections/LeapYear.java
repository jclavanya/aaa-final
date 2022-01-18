package collections;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.LinkedList;

 class LeapYear {

	public static void main(String[] args) {

		LocalDate date1 = LocalDate.of(2000, 07, 26);
		LocalDate date2 = LocalDate.of(2017, 11, 7);
		LocalDate date3 = LocalDate.of(1999, 10, 11);

		LinkedList<LocalDate> list = new LinkedList<LocalDate>();

		list.add(date1);
		list.add(date2);
		list.add(date3);

		for(LocalDate l : list)
		{
			String printDate = l.format(DateTimeFormatter.ofPattern("dd-MM-YYYY"));

			if(l.isLeapYear())
			{
				System.out.println("Your Date of Birth is " + printDate + " and it was a leap year");
			}
			else
			{
				System.out.println("Your Date of Birth is " + printDate + " and it was not a leap year");
			}
		}

	}

}





