package streams;
import java.util.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Stream;

public class q2 {
	String name;
	int calories;
	int price;
	String color;
	q2(String name,int calories,int price,String color)
	{
		this.name=name;
		this.calories=calories;
		this.price=price;
		this.color=color;
	}

	public static void main(String args[])
	{
		ArrayList<q2> l5=new ArrayList<q2>();
		l5.add(new q2("Apple",121,188,"red"));
		l5.add(new q2("Mango",117,133,"white"));
		l5.add(new q2("Banana",146,178,"blue"));
		l5.add(new q2("strawberry",16,133,"red"));
		l5.add(new q2("orange",17,177,"red"));
		Stream<q2> filtereddata=l5.stream().filter(q2->q2.color=="red");
		filtereddata.forEach
		(
				q2 ->{
					System.out.println(q2.name+"->"+q2.color);
					}
				);
	

	}
}
