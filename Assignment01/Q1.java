import java.util.*;

public class Q1{

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Number : ");
        int num=sc.nextInt();
        System.out.println("Given Number : "+num);
        Integer i= new Integer(num);
        System.out.println("Binary equivalent : "+i.toBinaryString(num));
        System.out.println("Octal equivalent : "+i.toOctalString(num));
        System.out.println("Hexadecimal equivalent : "+i.toHexString(num));
        

    }
    
}