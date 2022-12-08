package examples;
import java.util.List;

public class methodreference {
	private static void print(String str)
	{
		System.out.println(str);
	}
@SuppressWarnings("unused")
public static void main(String[] args)
{
	List<String>courses=List.of("Spring","Spring Boot","API","Microservices","AWS");
	courses.stream()
	.map(str->str.toUpperCase())
	.map(String::toUpperCase)
	.forEach(methodreference::print);
}

}
