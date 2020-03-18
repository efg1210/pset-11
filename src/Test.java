import java.util.ArrayList;

public class Test {
    public static void main (String[] args) {
        Exercises e = new Exercises();
        int[] list = (new int[]{6, 2, 7, 2, 9, 2, 10, 5987});
        e.selection(list, false);
        
        for (int each: list) {
            System.out.print(each + ", ");
        }
    }
}