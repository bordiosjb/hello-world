
import java.util.Scanner;
public class Activity3 {

    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        
        System.out.println("enter time in secounds");
        int secound = in.nextInt();
        
        int hours =secound / 60;
        int minutes = hours % 60;
        int remainingSeconds = minutes / 60;
      
        
       System.out.println("Time is " + hours + " hour " + minutes + " minutes " + remainingSeconds + " seconds");
       
       
       
       
       System.out.println();
       System.out.println("cost of driving");
       
       
             System.out.println("Enter the driving distance");
             double distance = in.nextDouble();
             System.out.print("Enter the miles per gallon:");
             double miles = in.nextDouble();
             System.out.print("Enter price per gallon: ");
             double price = in.nextDouble();
             
             double cost = (distance / miles) * price ;
             
             System.out.printf("The cost of driving is $%.2f\n", cost);
             
             
    }
    
}
