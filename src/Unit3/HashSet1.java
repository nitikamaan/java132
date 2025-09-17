package Unit3;

import java.util.*;

public class HashSet1 {
    public static void main(String[] args) {
        HashSet<String> set1=new HashSet<String>();
        HashSet<String> set2=new HashSet<String>();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter no of elements in hashset1: ");
        int n=sc.nextInt();
        System.out.println("Enter elements in hashset1: ");
        for(int i=0;i<n;i++){
            set1.add(sc.next());
        }
        System.out.println(set1);
        System.out.println("Enter no of elements in hashset2: ");
        int m=sc.nextInt();
        System.out.println("Enter elements in hashset2: ");
        for(int i=0;i<m;i++){
            set2.add(sc.next());
        }
        System.out.println(set2);
        set1.addAll(set2);
        System.out.println(set1);
        set1.removeAll(set2);
        System.out.println(set1);
        set1.removeIf(str->str.contains("am"));
        System.out.println(set1);
    }
}
