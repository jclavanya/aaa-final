package LamdaExpression;
import java.lang.*;
import java.util.*;
import java.util.function.ArrayList;
import java.util.function.UnaryOpeator;

public class operator {
	public static void main(String args[])
	{
	ArrayList<String> j1=new ArrayList<String>();
	j1.add("lavanya");
	j1.add("esther");
	System.out.println("ArrayList: " +j1);
	j1.replaceAll(e ->e.toUpperCase());
	System.out.println("updated ArrayList:"+j1);
	

}
}