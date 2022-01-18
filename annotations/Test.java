import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.annotation.*;
import java.lang.reflect.*;

	@Retention(RetentionPolicy.RUNTIME)
	@Target(ElementType.METHOD)

	@interface Test
	{
	String name();
	}
		
