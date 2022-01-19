interface Aoperations
{
	int arithmetic(int a, int b);
}
public class question1 {
	public static void main(String args[]) {
		
		Aoperations plus = ( a, b)->(a+b);
		System.out.println(plus.arithmetic(10, 20 )+"---addition");
		Aoperations minus = (a,b)->(a-b);
		System.out.println(minus.arithmetic(10, 20)+"----subtraction");
		Aoperations div = (a,b)->(a/b);
		System.out.println(div.arithmetic(10, 20)+"-----division");
		Aoperations mul = (a,b)->(a*b);
		System.out.println(mul.arithmetic(10, 20)+"-----multiplication");
		
	}

}
