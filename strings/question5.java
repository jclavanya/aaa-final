package strings;

public class question5 {

	public static void main(String[] args) {
		StringBuffer s =new StringBuffer("insert text");
		System.out.println("string = "+s);
		s.insert(8, "it is used at the specified index position" );
		System.out.println("after insertion = ");
		System.out.println(s.toString());
		
		

	}

}
