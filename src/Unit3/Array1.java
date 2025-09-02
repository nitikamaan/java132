package Unit3;
import java.util.Scanner;
public class Array1 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int a[]=new int[sc.nextInt()];
        System.out.println("Enter the elements");
        for(int i=0;i<a.length;i++) {
            a[i] = sc.nextInt();
        }
        System.out.println("Array:");
        for(int i=0;i<a.length;i++) {
            System.out.print(a[i]+" ");
        }
        System.out.println();
        System.out.println("Enter the size of the next array");
        int m=sc.nextInt();
        int n=sc.nextInt();
        int b[][]=new int[m][n];
        System.out.println("Enter the elements");
        for(int i=0;i<m;i++) {
            for(int j=0;j<n;j++){
                b[i][j] = sc.nextInt();
            }
        }
        System.out.println("Array:");
        for(int i=0;i<m;i++) {
            for(int j=0;j<n;j++){
                System.out.print(b[i][j]+" ");
            }
            System.out.println();
        }
    }
}
