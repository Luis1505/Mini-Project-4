import java.util.Scanner;

class Main {
  public static void main(String[] args) 
  {
   Scanner scan = new Scanner (System.in);

   System.out.println("have you brushed you teeth");
   boolean brushedTeeth = scan.nextBoolean();

   System.out.println("have you brush your hair?");
   boolean brushedHair = scan.nextBoolean();
   ready(brushedTeeth , brushedHair);

    System.out.println();
  }
  
  static boolean ready(boolean brushedHair , boolean brushedTeeth)
  {
    if(brushedHair && brushedTeeth)
    {
     System.out.println("You're good to go");
     return  ready = true;
    }else{
      System.out.println("You're not ready yet");
      return ready = false;
    }
  }
  static 



}