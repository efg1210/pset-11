import java.util.ArrayList;

public class Test {
    public static void main (String[] args) {
        Exercises e = new Exercises();
        //int[] list = (new int[]{6, 2, 7, 2, 9, 2, 10, 5987, -1});
        ArrayList<String> list = new ArrayList();
        list.add("e");
        list.add("b");
        list.add("a");
        list.add("c");
        e.selection(list, false);
        
        for (String each: list) {
            System.out.print(each + ", ");
        }
    }
}