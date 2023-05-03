package lnnerClass;

class P1 {
    public void display() {
        System.out.println("in P1 display");
    }
}

public class InnerClass1 {
    public static void main(String[] args) {
        P1 p = new P1() {
            public void display() {
                System.out.println("in new  display");
            }

            // public void display1() {
            // System.out.println("in new display");
            // }

        };
        p.display();
    }
}
