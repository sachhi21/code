class parent {

    String name;
    int standard;

    public parent(String name, int standard) {
        this.name = name;
        this.standard = standard;

    }

    void display() {
        System.out.println("my parent is lecture");
    }

}

class child extends parent {
    public child(String name, int standard) {
        super(name, standard);
    }

    void displaychild() {
        System.out.println("i am child of parent" + "  my name is " + name + " i study in " + standard + "th class");
    }
}

public class inheritance {
    public static void main(String[] args) {
        child b = new child("amogh ", 5);

        b.displaychild();
        b.display();
    }
}
