import java.util.Scanner;
import com.demo.core.datasample;

public class CallObjeact {

    public static void main(String[] args) {
        datasample d = new datasample();
        System.out.println(d.salary);

        int num = 19;
        num = 21;
        System.out.println(num);

        // Integer i1= num;
        // int num1 = i1;

        // System.out.println();
        Scanner scanner = new Scanner(System.in);
        String numberStr = scanner.nextLine();
        int number = Integer.parseInt(numberStr);
        System.out.println("Parsed number: " + number);

    }

}
