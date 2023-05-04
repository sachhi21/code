package Collection;
import java.util.HashSet;
import java.util.Set;

public class HashSets {
    public static void main(String[] args) {

        Set<String> names = new HashSet<>();

        names.add("Alice");
        names.add("Bob");
        names.add("Charlie");
        names.add("Alice");

        System.out.println(names);

        for(int n: names) {
            System.out.println(n);
        }
       

        Iterator<String> itr = names.iterator();
        while(itr.hasNext()) {
          System.out.println(itr.next());
        }  
    }
}
