
public class main {
	public static void main(String args[])
	{
	demo d = new demo();
	Class c= d.getClass();
	
	info an =(info) c.getAnnotation(info.class);
	System.out.println(an.name());
	System.out.println(an.id());
	System.out.println(an.supervisor());
	System.out.println(an.date());
	System.out.println(an.version());
	System.out.println(an.time());
		

}

}