package LamdaExpression;
import java.util.*;
import java.util.stream.Stream;

	class orders
	{
		float price;
		String ordername;
		String orderaddress;
		String orderstatus;
		public orders(float price,String ordername, String orderaddress,String orderstatus)
		{
			this.price=price;
			this.ordername=ordername;
			this.orderaddress=orderaddress;
			this.orderstatus=orderstatus;
		}
		public static void main(String args[])
		{
			ArrayList<orders> l1=new ArrayList<orders>();
			l1.add(new orders(2000f,"wathch","banglore","ACCEPTED"));
			l1.add(new orders(45000f,"bulb","AP","COMPLETED"));
			l1.add(new orders(2000f,"bench","mumbai","ACCEPTED"));
			l1.add(new orders(2000f,"chair","africa","COMPLETED"));
			Stream<orders> filtereddata=l1.stream().filter(o->o.price>10000);
			filtereddata.forEach
			(
					orders ->{
						System.out.println(orders.ordername+":"+orders.price);
						System.out.println(orders.orderstatus);
					}
					);
					
					
	 		
		}
		
		
	}


