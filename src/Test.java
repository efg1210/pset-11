import java.util.ArrayList;

public class Test {
    public static void main (String[] args) {
        Exercises e = new Exercises();
        ArrayList<Integer> list = new ArrayList();
        list.add(3);
        list.add(44);
        list.add(38);
        list.add(5);
        list.add(47);
        ArrayList<Integer> list2 = e.insertion(list, false);
        for (int each: list2) {
            System.out.print(each + ", ");
        }
    }
}