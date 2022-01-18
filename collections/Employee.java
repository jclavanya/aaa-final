package collections;
import java.util.Collections;
import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.HashSet;

public class Employee {
	int phonenumber;
	String name,Email,gender;
	public Employee(String name, String Email, String gender)
	{
		this.name=name;
		this.Email=Email;
		this.gender=gender;
			}
	public static void main(String args[])
	{
		TreeMap<Integer,Employee> tm= new TreeMap<Integer,Employee>(Collections.reverseOrder());
		Employee e1=new Employee("timothy","123@ww","male");
		Employee e2=new Employee("paul","rr@ww","male");
		Employee e3=new Employee("acts","qq@ww","female");
		tm.put(11, e1);
		tm.put(12, e2);
		tm.put(13, e3);
		for(Map.Entry<Integer,Employee> entry:tm.entrySet())
		{
			int Key=entry.getKey();
			Employee b =entry.getValue();
			System.out.println(Key +"phonenumber");
			System.out.println(b.name+ "" +b.Email+"" +b.gender);
			
			
		}
		
	}

}
