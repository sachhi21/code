import java.util.ArrayList;
import java.util.List;

public class Collections {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        for (int n : list) {
            System.out.println(n);
        }
        System.out.println(list);
        // System.out.println(list.get(2));

    }
}
