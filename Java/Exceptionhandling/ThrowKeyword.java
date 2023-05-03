package Exceptionhandling;
public class ThrowKeyword {

    public static void main(String[] args) {

        int a = 10;
        int b = 0;
        try {
            if (b == 0)
                throw new CustomException("invalid b go study ");

        } catch (ArithmeticException e) {
            System.out.println("message: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("An error occurred: " + e.getMessage());
        }

    }
}