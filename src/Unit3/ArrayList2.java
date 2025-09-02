package Unit3;
import java.util.*;
import java.util.ArrayList;
import java.util.Scanner;

public class ArrayList2 {
    public static void main(String[] args) {
        ArrayList<String> project=new ArrayList<>();
        System.out.println("Enter the number of projects: ");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println("Enter project name: ");
        for(int i=0;i<n;i++){
            project.add(sc.next());
        }
        System.out.println("Projects are : ");
        Collections.sort(project);
        Iterator it= project.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
        project.add(1,"Apple");
        project.addLast("garpes");
        project.addFirst("Mango");
        System.out.println(project.get(1));
    }

}
