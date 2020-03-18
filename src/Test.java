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
        ArrayList<String> list2 = e.bubble(list, true);
        
        for (String each: list2) {
            System.out.print(each + ", ");
        }
    }
}