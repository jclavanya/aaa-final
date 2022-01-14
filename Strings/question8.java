package strings;

public class question8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuilder s =new StringBuilder("insert text");
		System.out.println("string = "+s);
		s.insert(8, "it is used at the specified index position" );
		System.out.println("after insertion = ");
		System.out.println(s.toString());
		
	}

}
