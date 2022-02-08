import java.util.Arrays;
import java.util.ArrayList;
public class AnotherRunner {
    public static void main(String[] args) {
        // create an array with the known types
        Integer[] intsArray = {1, 2, 3, 4, 5};

// use the Arrays.asList utility method to convert the array to a list "inline"
        ArrayList<Integer> intList = new ArrayList<Integer>(Arrays.asList(intsArray));
        System.out.println(intList);

        Integer[] intsArray2 = {5, 4, 3, 2, 1};
        ArrayList<Integer> intList2 = new ArrayList<Integer>(Arrays.asList(intsArray2));
        System.out.println(intList2);
    }
}
