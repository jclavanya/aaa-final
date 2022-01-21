package ourjava11features;
interface si
{
	int atirh(int a , int b,int c);
}

public class simpleinterest {
	
	
	public static void main(String args[])
	{
		si g =(int  p,int t,int r) ->p*t*r/100;
		System.out.println(g.atirh(10,20,30));
	}
	

}
