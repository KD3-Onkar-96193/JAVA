import java.util.*;
public class Q3 {
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a String: ");
        String str=sc.nextLine();
        String arr[]=str.split(" ");
        int count=0; 

        for(String i:arr){
            count++;
          
        }
          System.out.print(" Total Words In String: "+count);
    }
}
