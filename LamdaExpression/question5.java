package LamdaExpression;
import java.util.function.Consumer;
import java.util.List;


public class question5 {
	public static void main(String args[])
	{
		var words =List.of("Apple", "mango","banana","pineapple");
		words.forEach(new Consumer<String>()
				{
			
			public void accept(String s)
			
			{
				StringBuffer initials = new StringBuffer();
				for(String st :s.split(""))
				{
					initials.append(st.charAt(0));
					
				}
				System.out.println(initials.toString());
			}
						
				});
	}
}
		
				
		
	


