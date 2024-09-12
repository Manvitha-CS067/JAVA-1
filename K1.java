import java.util.ArrayList;
import java.util.List;

public K1.java Main {
    public static void main(String[] args) {
        
        // List1: [65, 66, ..., 90]
        List<Integer> list1 = new ArrayList<>();
        for (int i = 65; i <= 90; i++) {
            list1.add(i);
        }

        // List2: [97, 98, ..., 112]
        List<Integer> list2 = new ArrayList<>();
        for (int i = 97; i <= 112; i++) {
            list2.add(i);
        }

        // List3: ['A', 'B', ..., 'Z']
        List<Character> list3 = new ArrayList<>();
        for (char ch = 'A'; ch <= 'Z'; ch++) {
            list3.add(ch);
        }

        // List4: ['a', 'b', ..., 'z']
        List<Character> list4 = new ArrayList<>();
        for (char ch = 'a'; ch <= 'z'; ch++) {
            list4.add(ch);
        }

        // Printing the lists
        System.out.println("List1: " + list1);
        System.out.println("List2: " + list2);
        System.out.println("List3: " + list3);
        System.out.println("List4: " + list4);
    }
}