/**
 * Main class for practicing iterator and list.
 * @author lskim
 */
import java.util.Iterator;
import java.util.ListIterator;
import java.util.ArrayList;

public class IteratorPractice {
    /**
     * Main method to run program.
     * @param args part of main method to run program.
     */
    public static void main(String[] args) {
        ArrayList<String> strArr = new ArrayList<>();
        strArr.add("zero");
        strArr.add("one");
        strArr.add("two");
        strArr.add("three");
        strArr.add("four");
        strArr.add("five");
        strArr.add("six");

        // Iterate through the strArr list with Iterator
        Iterator<String> itr = strArr.iterator();
        System.out.println("strArr ArrayList (iterator):");

        while (itr.hasNext()) {
            System.out.println(itr.next());
        }

        // Iterate through the strArr list with for-each
        System.out.println("\nstrArr ArrayList (for-each):");
        for (String str : strArr) {
            System.out.println(str);
        }

        // Iterate backwards
        System.out.println("\nstrArr in reverse order (ListIterator):");
        ListIterator<String> listItr = strArr.listIterator(strArr.size());

        while (listItr.hasPrevious()) {
            System.out.println(listItr.previous());
        }

        System.out.println("\n----------------------------\n");

        ArrayList<Integer> nums = new ArrayList<>();
        for (int i = 1; i <= 16; i++) {
            nums.add(i);
        }

        // Print even numbers only
        ListIterator<Integer> numItr = nums.listIterator();
        System.out.println("Even numbers from the list:");

        while (numItr.hasNext()) {
            int currentNum = numItr.next();
          
            if (currentNum % 2 == 0) {
                System.out.println(currentNum);
            }
        }

        // Iterate backwards and print previous indexes
        System.out.println("\nPrint numbers backwards and their previous indexes:");
        
        while (numItr.hasPrevious()) {
            System.out.println("Number: " + numItr.previous());
            System.out.println("-- Previous index: " + numItr.previousIndex());
        }

        // Multiply every third number from list by 100
        System.out.println("\nMultiply every third number by 100:");

        ListIterator<Integer> multItr = nums.listIterator();
        int count = 1;

        while (multItr.hasNext()) {
            int num = multItr.next();
          
            if (count % 3 == 0) {
                multItr.set(num * 100);
            }
            count++;
        }
      
        for (int n : nums) {
            System.out.println(n);
        }
    }
}
