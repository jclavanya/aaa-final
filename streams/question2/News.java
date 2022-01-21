package streams;
import java.util.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Stream;


public class News {
	int newsid;
	String postedbyuser;
	String commentbyuser;
	String comment;
	News(int newsid, String postedbyuser,String commentbyuser, String comment)
	{
		this.newsid=newsid;
		this.postedbyuser=postedbyuser;
		this.commentbyuser=commentbyuser;
		this.comment=comment;
		
	}

	public static void main(String args[])
	{
		ArrayList<News> r1=new ArrayList<News>();
		r1.add(new News(1,"lavanya","esther","budget, poor"));
		r1.add(new News(2,"johnpaul","nicholocs","budget,high"));
		r1.add(new News(3,"bob","bittu","average,high"));
		r1.add(new News(4,"marry","bob","budget,less"));
		
		Stream<News> filtereddata=r1.stream().filter(N->N.newsid==1);
		filtereddata.forEach
		(
				News ->{
					System.out.println(News.newsid);
					}
				);
	}
}
