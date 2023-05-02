class car {
    private int price;
    private static int gstprntge = 18;
    static String type;
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int gst() {
        return (price / 100) * gstprntge;

    }

}

public class staticenacapsulation {

    public static void main(String[] args) {
        car c = new car();
        c.setPrice(1200000);
        car.type = "bike";
        c.setName("kawaki");
        System.out.println(c.getName());
        System.out.println(c.type);
        System.out.println(c.getPrice());
        System.out.println(c.gst());
    }
}
