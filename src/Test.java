import java.util.*;

public class Test {
    public static void main (String[] args) {
        Exercises e = new Exercises();
        
        String[] test = new String[] {"b", "a", "e", "c", "z", "d"};

        System.out.println("answer: " + e.findMeFaster(test, "d"));
        
        // System.out.println("test size: " + test.size());
        // for (String each: test) {
        //     System.out.print(each + ", ");
        // }
    }
}