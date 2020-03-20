import java.util.ArrayList;

public class Test {
    public static void main (String[] args) {
        Exercises e = new Exercises();
        //int[] list = (new int[]{6, 2, 7, 2, 9, 2, 10, 5987, -1});
        ArrayList<Integer> list = new ArrayList();
        list.add(5);
        list.add(2);
        list.add(1);
        list.add(null);
        list.add(3);

        //System.out.println(e.merge(list, 1));

        ArrayList<Integer> list2 = e.insertion(list, true);
        
        for (Integer each: list2) {
            System.out.print(each + ", ");
        }
    }
}