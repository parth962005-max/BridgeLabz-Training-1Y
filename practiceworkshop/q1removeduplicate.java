package PracticeQuestions;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class q1removeduplicate {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(20);
        list.add(40);
        list.add(10);

        System.out.println("Original ArrayList: " + list);

        Set<Integer> set = new HashSet<>(list);

        ArrayList<Integer> uniqueList = new ArrayList<>(set);

        System.out.println("ArrayList after removing duplicates: " + uniqueList);
    }
}