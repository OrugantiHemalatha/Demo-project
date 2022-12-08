package examples;
import java.util.List;

public class streams {
public static void main (String[] args) {
	List<Integer>numbers=List.of(14,21,44,19);
	printAllNumbersInListFunctional(numbers);//function call
	
}
private static void printAllNumbersInListFunctional(List<Integer>numbers)
{
	System.out.println("Numbers printed without stream method----"+numbers);
	System.out.println("----------------------------------------------------------");
	System.out.println("Numbers with stream method");
	numbers.stream()//stream method accept the numbers individually and prints it one by one
	.forEach(System.out::println);
	
}
}
