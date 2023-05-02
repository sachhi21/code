import com.demo.core.PublicMadifier;
import com.demo.core.protectedmodifier;

public class accesmodifier {

    public static void main(String[] args) {

        PublicMadifier p = new PublicMadifier();
        p.display();
        // protectedmodifier p1 = new protectedmodifier();
        // p1.display(); not accessible
        // p1.salary = 12222; outside package not accessible onlu\y inside package class
        // subclass

    }

}
