package lnnerClass;

class A {
    String name;

    public void display() {
        System.out.println("in display");
    }

    static class B {
        public void show() {
            System.out.println("in show");
        }
    }
}

public class lnnerClass {
    public static void main(String[] args) {
        A obj = new A();
        obj.display();

        A.B obj1 = new A.B();
        obj1.show();
    }

}
