package Interface;

interface Interface1 {
    void method1();
}

interface Interface2 {
    void method2();
}

class MyClassa implements Interface1 {
    public void method1() {
        System.out.println("inside myclassa");
    }

}

class MyClass implements Interface1, Interface2 {
    public void method1() {
        System.out.println("I am method1");
    }

    public void method2() {
        System.out.println(" i am method 2");
    }
}

public class InterfaceJava {
    public static void main(String[] args) {
        MyClass obj = new MyClass();
        obj.method1();
        obj.method2();
    }
}
