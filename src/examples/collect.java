package examples;
import java.util.stream.Collectors;
import java.util.List;
import java.util.Arrays;

public class collect {
	public static void main(String[] args) {

	    List<String> listOfString = Arrays.asList("Java", "C", "C++", "Go",
	        "JavaScript", "Python", "Scala");
	    System.out.println("input list of String: " + listOfString);

	    // converting Stream to List using collect() method
	    List<String> listOfStringStartsWithJ
	                              = listOfString.stream()
	                                            .filter(s -> s.startsWith("J"))
	                                            .collect(Collectors.toList());
	    System.out.println("list of String starts with letter J: "
	            + listOfStringStartsWithJ);


}
}
