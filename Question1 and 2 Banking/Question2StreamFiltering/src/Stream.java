//Rutendo V Mumvuri h240193J    Princess B Kwaniya H240301V
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Stream {
    public static void main(String[] args) {

        //  ArrayList
        List<Integer> numbers = new ArrayList<>(Arrays.asList(1, 4, 5, 20, 30, 6));
        System.out.println("Original list: " + numbers);
        System.out.println("Numbers divisible by 5:");
               numbers.stream()                           // Convert list to stream
                .filter(n -> n % 5 == 0)           // Filter condition
                .forEach(System.out::println);     // Print each result
    }
}
