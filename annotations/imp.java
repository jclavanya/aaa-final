import java.lang.reflect.Method;

public class imp {
	public static void main(String args[])throws Exception
	{
		johnpaul a =new johnpaul();
		a.fruits();
		Method m =a.getClass().getMethod("fruits");
		Test t=m.getAnnotation(Test.class);
		System.out.print(t.name());
		
		
	}
}
