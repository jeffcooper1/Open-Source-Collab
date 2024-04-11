import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class remove_duplicates {

    public static List<Integer> removeDuplicates(List<Integer> arr, List<Integer> removedElements) {
        List<Integer> uniqueArr = new ArrayList<>();
        for (int i = 0; i < arr.size() - 1; i++) {
            // adds integer from list and adds to new list if it is not already added
            if (!uniqueArr.contains(arr.get(i + 1))) {
                uniqueArr.add(arr.get(i));
            } else {
                // if the uniqueArr contains the integer, add it to the removedElements list
                removedElements.add(arr.get(i));
            }
        }
        return uniqueArr;
    }

    public static void main(String[] args) {
        // Test the function
        List<Integer> arr = Arrays.asList(1, 2, 2, 3, 4, 4, 5);
        List<Integer> removedElements = new ArrayList<>();
        List<Integer> uniqueArr = removeDuplicates(arr, removedElements);
        System.out.println("Original array: " + arr);
        System.out.println("Unique array: " + uniqueArr);
        System.out.println("Removed elements: " + removedElements);
    }
}
