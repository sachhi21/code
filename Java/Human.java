public class Human {
    void display() {
        System.out.println("Freelancer");
    }

}

class employee extends Human {

    void display() {
        System.out.println("I am employee also");
    }
}

class husband extends Human {

    void display() {
        System.out.println("I am also husband of my wife");
    }
}
