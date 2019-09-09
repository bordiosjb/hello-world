
import java.util.Scanner;


public class Bordios {
    public static void main(String[] args) {
       System.out.println(" *********       ***        *        *");
       System.out.println(" *       *     *     *     ***      * *");
       System.out.println(" *       *    *       *   *****    *   *");
       System.out.println(" *       *    *       *     *     *     *");
       System.out.println(" *       *    *       *     *    *       *");
       System.out.println(" *       *    *       *     *     *     *");
       System.out.println(" *       *    *       *     *      *   *");
       System.out.println(" *       *     *     *      *       * *");
       System.out.println(" *********       ***        *        *");        
       
       System.out.println(""); 
       System.out.println(""); 
       System.out.println(""); 
       System.out.println(""); 
       
       //variables
       final double tax = 0.05, pizzaprice = 12.00, addtop = 1.50;
       double cost;
       int num_top, num_pizzas;
       Scanner in = new Scanner(System.in);
       System.out.println("Enter the number of pizzas : ");
       num_pizzas = in.nextInt();
       System.out.println("Enter the total number of topping : ");
       num_top = in.nextInt();
       
       //computation
       cost = (pizzaprice * num_pizzas + addtop * num_top) +((pizzaprice * num_pizzas + addtop * num_top) * tax);
       
       //display
       System.out.printf("Receipt: Number of Pizzas : %d\n", num_pizzas); 
       System.out.printf("Number of Tooings : %d\n", num_top); 
       System.out.printf("cost (inci tax) : %.2f\n ", cost); 
    }
    
}
