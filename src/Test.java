import java.util.*;

public class Test {
    public static void main (String[] args) {
        Exercises e = new Exercises();
        
        String[] test = new String[] {"apple", "banana", "cherry", "dog", "elephant", "fungus"};

        System.out.println("answer: " + e.findMeFaster(test, "cherry"));
        
        // System.out.println("test size: " + test.size());
        // for (String each: test) {
        //     System.out.print(each + ", ");
        // }
    }
}