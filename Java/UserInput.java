
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) {
        

        System.out.println("Enter a number");
        //int num1 = System.in.read();
       // System.out.println(num1);
/* 
       InputStreamReader is = new InputStreamReader(System.in);
       BufferedReader br = new BufferedReader(is);

       int num2 = Integer.parseInt(br.readLine());
       System.out.println(num2);
        br.close();

*/
        Scanner scanner = new Scanner(System.in);
        int num3 = scanner.nextInt();
        System.out.println(num3);
        






    }
}
