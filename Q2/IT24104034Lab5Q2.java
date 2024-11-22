import java.util.Scanner;
public class IT24104034Lab5Q2{
 public static void main(String[] args){
   Scanner input = new Scanner(System.in);
   System.out.print("Enter the number of new members introduced : ");
   int NoOf_Customers = input.nextInt();
   String Prize = "";
   if (NoOf_Customers > 0){
       switch (NoOf_Customers){
           case 1: Prize = "Pen";
           break;
           case 2: Prize = "Umbrella";
           break;
           case 3: Prize = "Bag";
           break;
           case 4: Prize = "Travelling Chair";
           break;
           default: Prize = "Headphone";
       }
       System.out.print("Prize is a : " + Prize);
   }else if (NoOf_Customers == 0){
       System.out.print("No Prize");
   }else {
    System.out.print("Input must be a number 0 or greater");
   }
   
  }
}