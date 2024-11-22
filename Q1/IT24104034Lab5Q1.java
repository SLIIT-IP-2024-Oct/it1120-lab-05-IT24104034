import java.util.Scanner;
public class IT24104034Lab5Q1{
 public static void main(String[] args){
   Scanner input = new Scanner(System.in);
   System.out.print("Enter the first integer: ");
   int num1 = input.nextInt();
   System.out.print("Enter the second integer: ");
   int num2 = input.nextInt();
   System.out.print("Enter the third integer: ");
   int num3 = input.nextInt();
   System.out.println("User entered numbers are : " + num1 + " " + num2 + " " + num3);
   int largest, smallest;
   largest = num1;
   smallest = num3;
   if (num2 > largest){
     largest = num2;
   }
   if (num3 > largest){
     largest = num3;
   }
   if (smallest > num1){
     smallest = num1;
   }
   if (smallest > num2){
     smallest = num2;
   }
   System.out.println("The Smallest number is: " + smallest);
   System.out.println("The Largest number is: " + largest);
 }
} 