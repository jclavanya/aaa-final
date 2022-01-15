package training;
import java.util.*;

class Gen<T> {

	T obj;
	Gen(T ob)
	{
	this.obj=ob;
	}
	public void show()
	{
		System.out.println("The type of object is "+obj.getClass().getName());
		
	}
	public T getobj()
	{
		return obj;
	}
}
class Gendemo
{
	Public Static void main(String args[])
	
	{
	HashSet<String> h = new HashSet<String>("lava");
	h.show();
	System.out.println(h.getobj());
		
	HashSet<String> h = new HashSet<String>("id");
	h.show();
	System.out.println(h.getobj());
		
	}
	
}

	
