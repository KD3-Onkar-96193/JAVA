import java.util.Scanner;

public class Q2{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double num1 = 0, num2 = 0;

        System.out.print("Enter the first number: ");
        if(!sc.hasNextInt()) {
              if (sc.hasNextDouble()) {
                      num1 = sc.nextDouble();
                      System.out.print("Enter the second number: ");
                  if(!sc.hasNextInt()) {   
                        if (sc.hasNextDouble()) {
                             num2 = sc.nextDouble();
                             double average = (num1 + num2) / 2;
                             System.out.println("The average of two no. is: " + average);
                          } 
                   }
                    else {
                         System.out.println("input is not of type double");
                    }
                   }
          } 
                  else {
                     System.out.println("input is not of type double");
          }
    }
}