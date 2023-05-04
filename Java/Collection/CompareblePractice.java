import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Collections;

class Cricket implements Comparable<Cricket> {
    int score;
    String name;

    public Cricket(int score, String name) {

        this.name = name;
        this.score = score;

    }

    @Override
    public String toString() {
        return "Cricket [score=" + score + ", name=" + name + "]";
    }

    @Override
    public int compareTo(Cricket o) {
        if (this.score > o.score) {
            return 1;
        } else {
            return -1;
        }
    }
}

public class CompareblePractice {
    public static void main(String[] args) {

        Comparator<Cricket> cricket = (o1, o2) -> o1.score > o2.score ? 1 : -1;
        List<Cricket> batsmans = new ArrayList<>();
        batsmans.add(new Cricket(12, "sachin"));

        batsmans.add(new Cricket(14, "sach"));

        batsmans.add(new Cricket(15, "sachi"));

        // Collections.sort(batsmans);
        Collections.sort(batsmans, cricket);
        // System.out.println(batsmans);
        for (Cricket c : batsmans) {
            System.out.println(c);
        }

    }
}
