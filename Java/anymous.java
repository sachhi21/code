class A {
    public A() {
        System.out.println("constructor");
    }

    public void show() {
        System.out.println("in show method");
    }
}

public class anymous {

    public static void main(String[] args) {

        new A().show();
        new A().show();

    }

}
