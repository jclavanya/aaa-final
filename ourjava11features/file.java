package ourjava11features;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;


public class file {
	public static void main(String args[]) throws IOException
	{
		var path="c:\\Java11Assignments_StudentList.txt";
		String data =Files.readString(Path.of(path));
		System.out.println(data);
	}
	

}
