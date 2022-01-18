import java.lang.reflect.Method;

public class third {
	public static void main(String args[])throws Exception
	{
		last a =new last();
		a.fruit();
		Method m =a.getClass().getMethod("last");
		Execute t=m.getAnnotation(Execute.class);
		System.out.print(t.name1());
		
	
	
		
		
		
	}
}
