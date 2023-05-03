package Interface;

@FunctionalInterface
interface Z {
    int multiply(int i, int j);
}

public class FuctionalInterface1 {

    public static void main(String[] args) {

        Z z = (int i, int j) -> i * j;
        int res = z.multiply(10, 10);
        System.out.println(res);

    }

}
