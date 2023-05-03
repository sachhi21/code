package Interface;

@FunctionalInterface
interface p {
    int add(int i, int j);
}

public class FuctionalInterface {

    public static void main(String[] args) {
        p P = new p() {
            public int add(int i, int j) {
                return i + j;
            }
        };

        int res = P.add(10, 10);
        System.out.println(res);
    }

}
