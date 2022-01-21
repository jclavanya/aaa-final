package streams;
import java.util.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Stream;

public class trader {
String name,trader;
String city;
int year;
int value;
trader(String name,String trader, String city,int year,int value)
{
	this.name=name;
	this.trader=trader;
	this.city=city;
	this.year=year;
	this.value=value;
}
public static void main(String args[])
{
	ArrayList<trader> l5=new ArrayList<trader>();
	l5.add(new trader("lavanya","bussiness","tirupati",2011,3000));
	l5.add(new trader("esther","bussiness","pune",2011,4000));
	l5.add(new trader("johnpaul","business","delhi",2011,2000));
	
	Stream<trader> filtereddata=l5.stream().filter(t->t.name=="lavanya");
	filtereddata.forEach
	(
			trader ->{
				System.out.println(trader.name);
				}
			);


}
}
