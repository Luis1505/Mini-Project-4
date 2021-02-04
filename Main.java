import java.util.Scanner;

class Main {
  public static void main(String[] args) 
  {
  
  // introduced scanner for the methods
   
   Scanner scan = new Scanner (System.in);

   System.out.println("Have you brushed you teeth?");
   boolean brushedTeeth = scan.nextBoolean();

   System.out.println("Have you brush your hair?");
   boolean brushedHair = scan.nextBoolean();
   
   System.out.println(ready(brushedTeeth , brushedHair));

  // introduced the other method

   System.out.println("What degrees farenheit is it outside?");
   int degrees = scan.nextInt();

   System.out.println("It is "+ temperature(degrees)  + " degrees  celsius outside.") ;

  }
  // first method is a boolean
  static String ready(boolean brushedHair , boolean brushedTeeth)
  {
    if(brushedHair && brushedTeeth)
    {
     return "You're good to go";
    }else{
       return "You're not ready yet";     
    }
  }
 // this method takes farenheit and changes it to celsius
  static int temperature(int degrees)
  {
   int celsius = ( degrees - 32 )*5/9;
   return celsius;
  }
  

}