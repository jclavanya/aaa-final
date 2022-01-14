package strings;

public class question6 {

	public static void main(String[] args) {
		String s = " which it was called";
		String[] sArray =s.split("");
		for(String temp:sArray) {
			System.out.println(temp);
					}
for(int i=0; i<3;i++) {
	char[] s1=sArray[i].toCharArray();
	
	for(int j=s1.length-1; j>=0;j--) {
		System.out.println(s1[j]);
	}
}
	
	}

}
