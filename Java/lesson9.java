import java.util.Scanner;

public class lesson9 {

    public static void main(String[] args) {

        int t = (int) (Math.random() * 20);
        Scanner r = new Scanner(System.in);
        int a = r.nextInt();
        System.out.println("your numder is : " + a);
        System.out.println(t);
        // String t =r.nextLine();
        // boolean y = r.nextBoolean();
        // long u = r.nextLong();
        // double i = r.nextDouble();
        int[][] d = { { 1, 2, 3, 4, 5 }, { 5, 6, 7, 8, 9 } };

        for (int i = 0; i < d.length; i++) {
            for (int j = 0; j < d[i].length; j++) {
                System.out.println(d[i][j]);

            }
        }

        String chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZ123456789";
        String finalstring = "";
        for (int i = 0; i < 10; i++) {
            finalstring += chars.charAt((int) (Math.random() * chars.length()));
            System.out.println(finalstring); // add "" + after += (if mismatch happens)
        }
        System.out.println(finalstring);

        String charss = "ABCDEFGHIJKLMNOPQRSTUVWXYZ123456789";
        String finalstrings = "";
        finalstrings += charss.charAt((int) (Math.random() * charss.length()));
        System.out.println(finalstrings);
    }
}
