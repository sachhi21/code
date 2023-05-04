import java.util.TreeSet;

public class TreeSets {
    public static void main(String[] args) {

        TreeSet<Integer> numbers = new TreeSet<>();

        numbers.add(5);
        numbers.add(3);
        numbers.add(8);
        numbers.add(1);

        System.out.println(numbers);

        boolean contains = numbers.contains(3);
        System.out.println(contains);

        numbers.remove(5);
        System.out.println(numbers);

        int first = numbers.first();
        int last = numbers.last();
        System.out.println(first);
        System.out.println(last);
    }
}
