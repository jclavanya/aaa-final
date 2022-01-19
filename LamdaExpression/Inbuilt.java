package LamdaExpression;
import java.lang.*;
import java.util.*;
import java.util.function.Supplier;
import java.util.function.Predicate;
import java.util.function.Consumer;
public class Inbuilt {
	public static void main(String args[])
	{
		String name ="marry";//Supplier Inbuilt
		display(()->name+"is a student");
		display(()->name+" is a Employee");
		 
		Consumer<Inbuilt> address=n->n.enter("lavanya");//Consumer Inbuilt
		Inbuilt i =new Inbuilt();
		address.accept(i);
		Predicate<String> isALongWord=t->t.length() >10;// predicate Inbuilt
		String s="success";
		boolean result =isALongWord.test(s);
		System.out.println(result);
	}
	static void display(Supplier<String> a)//Supplier Method
	{
		System.out.println(a.get());
	}
	static void enter(String s)//Consumer Method
	{
		System.out.println(s);
	}	
		
		
		
	}
	


