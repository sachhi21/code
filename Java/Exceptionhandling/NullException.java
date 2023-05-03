package Exceptionhandling;
public class NullException {

    public static void main(String[] args) {
        String[] text = null;
        try {
            text[4] = "sachin";
        } catch (NullPointerException e) {
            System.out.println("An error occurred: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("An unexpected error occurred: " + e.getMessage());
        } finally {
            System.out.println("I  always run to clean you");
        }
    }
}
