//public absract in interface every methd             
abstract class college {
    abstract public void display();

    public void run() {
        System.out.println("in college");
    }

}

class home extends college {

    @Override
    public void display() {
        System.out.println("in home right now");
    }
}

class AbstractClass {

    public static void main(String[] args) {

        college h = new home();
        h.display();
        h.run();

    }
}