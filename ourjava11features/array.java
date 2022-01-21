package ourjava11features;
import java.util.*;
import java.util.ArrayList;
public class array {
	public static void main(String args[])
	{
		ArrayList<String> list=new ArrayList();
		list.add("A");
		list.add("quick");
		list.add("brown");
		list.add("fox");
		list.add("jumps");
		list.add("over");
		list.add("the");
		list.add("lazy");
		list.add("dog");
		
		String[] arr2= list.toArray(size ->new String[size]);
		System.out.println(Arrays.toString(arr2));
		
		
	}
}
