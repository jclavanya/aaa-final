package streams;

import java.util.ArrayList;
import java.util.stream.Stream;

public class q3 {
	
		String name;
		int calories;
		int price;
		String color;
		q3(String name,int calories,int price,String color)
		{
			this.name=name;
			this.calories=calories;
			this.price=price;
			this.color=color;
		}

		public static void main(String args[])
		{
			ArrayList<Fruit> l5=new ArrayList<Fruit>();
			l5.add(new Fruit("Apple",121,188,"red"));
			l5.add(new Fruit("Mango",117,133,"red"));
			l5.add(new Fruit("Banana",146,178,"red"));
			l5.add(new Fruit("strawberry",16,133,"red"));
			l5.add(new Fruit("orange",17,177,"red"));
			Stream<Fruit> filtereddata=l5.stream().filter(F->F.color=="red");
			filtereddata.forEach
			(
					Fruit ->{
						System.out.println(Fruit.name+"---->"+Fruit.color);
											}
					);
		}
}
