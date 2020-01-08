package bordios_iprt;

 import java.util.Scanner;

  public class bordios_IPRT 
{
    
    public bordios_IPRT()
{
 try
  {    
  Scanner in = new Scanner (System.in);
  double Interest,Principal,Rate,Time;
  System.out.print(" Interest :");
     Interest=in.nextDouble();
  System.out.print(" Principal :");
    Principal=in.nextDouble();
  System.out.print(" Rate :");
         Rate=in.nextDouble();
  System.out.print(" Time :");
         Time=in.nextDouble();
   
  if(Interest==0)
{
    Interest =Principal * (Rate* Time);
    System.out.println("The Interest Value "+Interest);
   }
  else if(Principal==0)
{
      Principal =Interest / (Rate* Time);
      System.out.println("The Principal Value "+Principal);
   }
  else if(Rate==0)
{
      Rate  =Interest /(Principal* Time);
      System.out.println("The Rate Value "+Rate);
   } 
  else if (Time==0)
{ 
      Time  =Interest /(Principal* Rate); 
       System.out.println("The Time Value "+ Time);
   }  
 }
   catch (Exception e) 
   {
     System.out.println(""+e.getMessage());
   }
}
    
    public static void main(String[] args) 
{
        bordios_IPRT bordios_IPRT = new bordios_IPRT ();
    }
    
}
