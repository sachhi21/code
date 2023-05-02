import com.demo.core.Calci;

public class metodoverload {

    public static void main(String[] args) {
        Calci c = new Calci();

        System.out.println(c.add(2, 3, 6));
        System.out.println(c.add(2, 3));

    }
}
