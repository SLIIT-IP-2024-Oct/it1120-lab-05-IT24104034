import java.util.Scanner;
public class IT24104034Lab5Q3{
    public static void main(String[] args){
        final double Room_Charges = 48000.00;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Start Date (1-31): ");
        int start_date = input.nextInt();
        System.out.print("Enter Ending Date (1-31): ");
        int end_date = input.nextInt();
        if ((start_date >= 1 && start_date <= 31) && (end_date >= 1 && end_date <= 31)){
            int NoOf_Days = end_date - start_date;
            if (NoOf_Days > 0){
                System.out.println("\nRoom Charge Per Day: Rs. " + Room_Charges);
                System.out.println("Number of Days Reserved : " + NoOf_Days);
                double Pay = NoOf_Days * Room_Charges;
                if (NoOf_Days == 3 || NoOf_Days == 4){
                    Pay = Pay * 0.90;    
                }else if (NoOf_Days >= 5){
                    Pay = Pay * 0.80;
                }
                System.out.println("Total Amount to be paid : " + Pay);            
            }else{
                System.out.print("Error: Start Date must be less than End Date");
            }
            
        }else{
            System.out.print("Error: Days must be between 1 and 31");
        }
        

    }
    
}