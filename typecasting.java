import java.io.*;
import java.util.Scanner;
class vai{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        byte b;
        int i;
        short s;
        System.out.println("Enter your integer:");
        int x=sc.nextInt();
        double y= sc.nextDouble();
        System.out.println("Conversion of int to short:");
        s=(short)x;
        System.out.println(+x+" "+s);
        System.out.println("\nconversion int to byte:");
        b=(byte)x;
        System.out.println(+x+" "+b);
        System.out.println("Conversion of double to int");
        i=(int)y;
        System.out.println(+y+ " "+i);
        
    }
}
