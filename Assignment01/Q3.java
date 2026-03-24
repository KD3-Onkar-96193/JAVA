import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int choice, quantity;
        int totalBill = 0;

        do{
            System.out.println("...........Food Menu...........");
			System.out.println(" 1.Dosa-30₹ \n 2.Samosa-15₹ \n 3.Idli-25₹ \n 4.Poha-20₹ \n 5.Bhaji-20₹ \n 6.KandaPoha-25₹ \n 7.Vada-Pav-18₹ \n 8.VegRoll-50₹ \n 9.Coffee-8₹");
			System.out.println(" 10.Generate Bill");
            System.out.println("Enter Your Choice: ");
            choice=sc.nextInt();
           
            switch(choice){
                case 1:
                     System.out.println("Enter Quantity: ");
                      quantity=sc.nextInt();
                    totalBill=totalBill+30*quantity;
                    break;
                case 2:
                    System.out.println("Enter Quantity: ");
                    quantity=sc.nextInt();
                     totalBill=totalBill+15*quantity;
                     break;
                case 3:
                    System.out.println("Enter Quantity: ");
                    quantity=sc.nextInt();
                     totalBill=totalBill+25*quantity;
                     break;

                case 4:
                    System.out.println("Enter Quantity: ");
                    quantity=sc.nextInt();
                     totalBill=totalBill+20*quantity;
                     break;
                case 5:
                    System.out.println("Enter Quantity: ");
                    quantity=sc.nextInt();
                     totalBill=totalBill+20*quantity;
                     break;
                case 6:
                    System.out.println("Enter Quantity: ");
                    quantity=sc.nextInt();
                     totalBill=totalBill+25*quantity;
                     break;
                case 7:
                    System.out.println("Enter Quantity: ");
                    quantity=sc.nextInt();
                     totalBill=totalBill+18*quantity;
                     break;
                case 8:
                    System.out.println("Enter Quantity: ");
                    quantity=sc.nextInt();
                     totalBill=totalBill+50*quantity;
                     break;
                case 9:
                    System.out.println("Enter Quantity: ");
                    quantity=sc.nextInt();
                     totalBill=totalBill+8*quantity;
                     break;
                case 10:

                    System.out.println("Total Bill: "+totalBill);
                    System.out.println("Thank You !! Visit Again ");
                     break;
                default:
                    System.out.println("Enter Valid Choice ");

            }


        }while(choice!=0);

      
    }
}