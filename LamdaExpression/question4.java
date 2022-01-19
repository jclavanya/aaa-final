package LamdaExpression;
import java.util.*;

public class question4 {
	
	    public static void removeEvenLength(ArrayList <String> stringList){
	        for(int i=0;i<stringList.size();i++){
	            String word=stringList.get(i);
	            if(word.length()%2==0){//even
	                stringList.remove(word);//if it is
	                i = i-1;
	                continue;
	            }
	        }

	        for(int i=0;i<stringList.size();i++){
	            String word=stringList.get(i);
	            System.out.println(word);
	        }
	    }

	public static void main(String []args)
	{
	    ArrayList <String> stringList = new ArrayList <String>();
	    stringList.add("this");
	    stringList.add("is");
	    stringList.add("a");
	    stringList.add("test");
	    removeEvenLength(stringList);
	}

}
