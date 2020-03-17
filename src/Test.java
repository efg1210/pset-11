import java.util.ArrayList;

public class Test {
    public static void main (String[] args) {
        Exercises e = new Exercises();
        String[] list = (new String[]{"e", "b", "d", "a"});
        e.insertion(list, false);
        for (String each: list) {
            System.out.print(each + ", ");
        }
    }
}