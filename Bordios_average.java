
import java.util.Scanner;

public class Bordios_average{

    double pre, mid, pref, fin, average;
    
    String remark;

    public Bordios_average() {
        try {
        Scanner in = new Scanner(System.in);
           
        System.out.print("Prelim: ");
               pre = in.nextDouble();
        System.out.print("Midterm: ");
               mid = in.nextDouble();
        System.out.print("Prefinal: ");
               pref = in.nextDouble();
        System.out.print("Final: ");
               fin = in.nextDouble();

            //compute
            average = (pre + mid + pref + fin) / 4;
            //statement
                   
                   if (average < 74) {
                       remark = "Failed";
            } else if (average > 75 && average < 78.9) {
                       remark = "Conditional";
            } else if (average > 79 && average < 82.9) {
                       remark = "Fair";
            } else if (average > 83 && average < 86.9) {
                       remark = "Good";
            } else if (average > 87 && average < 91.9) {
                       remark = "Very Good";
            } else if (average > 92 && average < 95.9) {
                       remark = "Excellent";
            } else if (average < 96 && average > 100)  {
                       remark = "Dean's List";
            }

            System.out.println("Average: " + average);

            System.out.println("Remarks: " + remark);

        }catch (Exception e) 
        
        {
            System.out.println("" + e.getMessage());
        }
        }

    public static void main(String[] args)
    
    {
        new Bordios_average();
    }

}
