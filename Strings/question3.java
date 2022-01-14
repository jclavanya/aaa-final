package strings;

public class question3 {

	public static void main(String[] args) {
		
		String s="java string pool refers to collection of strings which are stored in heap memory";
		String pp="java string pool refers to collection of strings which are stored in heap memory";
		String s1= s.toLowerCase();
		
		System.out.println("s1 is:"+s1);
		String s2= s.toUpperCase();
		System.out.println("s2 is:"+s2);
		System.out.println(s.replace('a', '$'));
		if(s.contains("collection"))
		{
			System.out.println("found");
					}
		else {
			System.out.println("not found");
		}
		
        if(s==pp)
        {
        	System.out.println("match");
        }
        else
        {
        	System.out.println("mismatch");
        }
	}

}
