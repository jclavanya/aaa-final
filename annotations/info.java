import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)

@interface info
{
	String name();
	int id();
	String supervisor();
	String date();
	String time();
	int version();
	
	
}
