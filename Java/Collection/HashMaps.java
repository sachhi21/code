package Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.Iterator;


public class HashMaps {

    public static void main(String[] args) {

        Map<String, Integer> cricket= new HashMap<>();
        cricket.put("Thomas", 1000000);
        cricket.put("nkdebug", 40000);
        cricket.put("rkdebug", 20000);
        cricket.put("pkdebug", 20000);
        cricket.put("skdebug", 100000);
        cricket.put("nkdebug", 60000);

        System.out.println(cricket);
        System.out.println(cricket.get("Thomas"));

        System.out.println(cricket.keySet());

        for (String name : cricket.keySet()) {
            System.out.println(name + "--->" + cricket.get(name));
        }

        for (Integer salary : cricket.values()) {
            System.out.println(salary + "--->");
        }

         Set<Integer> set = new HashSet<>();
       
       set.add(11);
       set.add(2);
       set.add(43);
       set.add(54);
       set.add(15);
       set.add(2);

       System.out.println(set); 
       
         for(int n: set) {
             System.out.println(n);
         }
        

         Iterator<Integer> itr = set.iterator();
         while(itr.hasNext()) {
           System.out.println(itr.next());
         }  


    }

}