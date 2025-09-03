package Unit3;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedList1 {
    public static void main(String[] args) {
        LinkedList<String> ll=new LinkedList<>();
        ll.add("skjhg");
        ll.add("djhg");
        ll.add("jsuyd");
        ll.add("djhg");
        ll.add("hgftyuj");
        Iterator itr=ll.descendingIterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
        ll.remove("hgftyuj");
        ll.addFirst("hsgdye");
        ll.addLast("hgxxnn");
        System.out.println(ll);
    }
}
