package examples;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
public class filter 
{
	public static void main(String[] args) 
	{
        List<Integer> numbers = Arrays.asList(1,2,3,4,5);

        List<Integer> lessThanThree = numbers.stream()
                .filter((Integer number) -> {
                    return number < 3;
                })
                .collect(Collectors.toList());

        System.out.println(lessThanThree);
    }

}
