
package bordios;

import java.util.Scanner;

public class OHMS_Bordios
{
    
    public OHMS_Bordios ()
    {   
    
       try
       {
     double voltage = 0,current,Resistance = 0,Enterchoice;  
     Scanner in = new Scanner(System.in);  
     
     System.out.println("1. Solve for voltage :");
     System.out.println("2. Solve for current :");
     System.out.println("3. Solve for Resistance :");
     
      System.out.println("Enter choice :");
      Enterchoice = in.nextDouble();
     
      if(Enterchoice==1){
      System.out.println("current :");
      current  = in.nextDouble();
      System.out.println("Resistance :");
      Resistance = in.nextDouble();
      voltage = current * Resistance;
      System.out.println("voltage:"+voltage);
    }
      
      if(Enterchoice==2){
      System.out.println("voltage:");     
      voltage = in.nextDouble();
      System.out.println("Resistance :");
      Resistance = in.nextDouble();
      current = voltage / Resistance;
      System.out.println("current:"+current);
    }
      if(Enterchoice==3){
      System.out.println("voltage :");    
      voltage = in.nextDouble();
      System.out.println("current :");  
      current = in.nextDouble();
      Resistance = voltage / current;
      System.out.println("Resistance"+Resistance);
    }
      
    }catch (Exception e)
    {
    System.out.println(""+e.getMessage());
    }
    }
    public static void main(String[] args) 
    {
      new OHMS_Bordios ();
    }
    
}
