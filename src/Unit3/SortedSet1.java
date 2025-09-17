package Unit3;

import java.util.SortedSet;
import java.util.TreeSet;

public class SortedSet1 {
    public static void main(String[] args) {
        SortedSet<String> set=new TreeSet<>();
        set.add("hbsg");
        set.add("sgghb");
        set.add("shmj");
        System.out.println(set.first());
        System.out.println(set.last());
        System.out.println(set.headSet("sgghb"));
        System.out.println(set.tailSet("hbsg"));
    }
}
