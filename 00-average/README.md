# Calculating Averages
Import java.util.*;

Public class Average {

   public static void main(String[] args) {

      System.out.println(“Enter your grade”)
      Scanner in = new Scanner(System.in);
      int num = 0;
 
      System.out.print(“Enter your first number: ”);
      num+= in.nextInt();
 
      System.out.print(“Enter your second number: ”);
      num += in.nextInt();

      System.out.print(“Enter your third number: ”);
      num += in.nextInt();

      System.out.print(“Enter your fourth number: ”);
      num += in.nextInt();

      Double average = num / 5.0;

      System.out.println(“Your medium grade average is “ + average);”

   }
 
}
