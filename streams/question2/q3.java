package streams;

import java.util.ArrayList;
import java.util.stream.Stream;

public class q3 {
		int newsid;
		String postedbyuser;
		String commentbyuser;
		String comment;
		q3(int newsid, String postedbyuser,String commentbyuser, String comment)
		{
			this.newsid=newsid;
			this.postedbyuser=postedbyuser;
			this.commentbyuser=commentbyuser;
			this.comment=comment;
			
		}

		public static void main(String args[])
		{
			ArrayList<News> r1=new ArrayList<News>();
			r1.add(new News(1,"lavanya","India has poorbudget this year"," good"));
			r1.add(new News(2,"johnpaul","budget income is low","nicholos"));
			r1.add(new News(3,"bob","bittu","average,high"));
			r1.add(new News(4,"marry","bob","budget,less"));
			
			Stream<News> filtereddata=r1.stream().filter(N->N.commentbyuser=="budget income is low");
			filtereddata.forEach
			(
					News ->{
						System.out.println(News.commentbyuser);
						}
							);

}
}
