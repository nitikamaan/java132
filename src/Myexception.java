import java.io.DataInputStream;
import java.io.IOException;
import java.util.*;
//import java.util.InputMismatchException

public class Myexception {
    public static void main(String[] args)throws IOException {
        int x, y, z = 0;
//        Scanner sc = new Scanner(System.in);
        DataInputStream dis = new DataInputStream(System.in);
//        try {
//            x = sc.nextInt();
//            y = sc.nextInt();
        x = dis.readInt();
        y = dis.readInt();
        z = x / y;
        System.out.println("Exception does not occur");
        System.out.println("Result is "+z);
//        }

//        catch(ArithmeticException | IOException e){
//                System.out.println(e.getMessage());
//            }
//        finally {
//            System.out.println("Result is " + z);
//        }
//    }
    }
}
