import java.util.Scanner;

class Main {
  public static void main(String[] args) 
  {
   Scanner scan = new Scanner (System.in);

   System.out.println("Have you brushed you teeth?");
   boolean brushedTeeth = scan.nextBoolean();

   System.out.println("Have you brush your hair?");
   boolean brushedHair = scan.nextBoolean();
   
   System.out.println(ready(brushedTeeth , brushedHair));

   System.out.println("What temperature is it outside?");
   int degrees = scan.nextInt();

   System.out.println(temperature(degrees));

  }
  
  static String ready(boolean brushedHair , boolean brushedTeeth)
  {
    if(brushedHair && brushedTeeth)
    {
     return "You're good to go";
    }else{
       return "You're not ready yet";     
    }
  }
  static String temperature(int degrees)
  {
    if(degrees > 90)
    {
     return "It's way too hot!";
    }else if(degrees > 62){
      return "Its a perfect day to be out.";
    }else{
      return "Its a way too cold";
    }
  }



}