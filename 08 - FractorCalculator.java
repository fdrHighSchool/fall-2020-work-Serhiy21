import java.io.*;
   import java.util.Scanner;
  public class FractionCalculator{
     public  class Fraction{
                  private int nomo;
                  private int deno;
                  Fraction(){nomo=0;deno=1;}
                  Fraction(int n,int d){nomo=n;deno=d;}
  
     }

          private static Fraction f1;
          private static Fraction f2;
 

     public static void main(String[] args){
         int choi;
       Scanner sc=new Scanner(System.in);
       FractionCalculator FC=new FractionCalculator();
       Fraction f;
       printMenu();
           System.out.print("Choose one operation:");
       choi=sc.nextInt();
       switch(choi){
             case 1: FC.getInput();
                           f=FC.addFraction(f1,f2);
                           System.out.format("\nResult:%d/%d\n",f.nomo,f.deno);
                           break;
               case 2: FC.getInput();
                            f=FC.subtractFraction(f1,f2);
                            System.out.format("\nResult:%d/%d\n",f.nomo,f.deno);
                            break;
               case 3: FC.getInput();
                             f=FC.multiplyFraction(f1,f2);
                             System.out.format("\nResult:%d/%d\n",f.nomo,f.deno);
                             break;
               case 4: FC.getInput();
                             f=FC.divideFraction(f1,f2);
                             System.out.format("\nResult:%d/%d\n",f.nomo,f.deno);
                             break;
                   default: System.out.println("Invalid choice!");
         }
    }

    public Fraction addFraction(Fraction f1,Fraction f2){
                Fraction resul=new Fraction();
                resul.nomo=(f1.nomo*f2.deno)+(f1.deno*f2.nomo);
                resul.deno=f1.deno*f2.deno;
                return resul;
 }
   public Fraction subtractFraction(Fraction f1,Fraction f2){
                 Fraction resul=new Fraction();
                 resul.nomo=(f1.nomo*f2.deno)-(f1.deno*f2.nomo);
                 resul.deno=f1.deno*f2.deno;
                 return resul;
 }
  public Fraction multiplyFraction(Fraction f1,Fraction f2){
                 Fraction resul=new Fraction();
                 resul.nomo=f1.nomo*f2.nomo;
                 resul.deno=f1.deno*f2.deno;
                 return resul;
 }
  public Fraction divideFraction(Fraction f1,Fraction f2){
                 Fraction resul=new Fraction();
                 resul.nomo=f1.nomo*f2.deno;
                 resul.deno=f1.deno*f2.nomo;
                 return resul;
 }
 public static void printMenu(){
                 System.out.println("FRACTIONS CALCULATOR");
                 System.out.println("-------------------------------");
                 System.out.println("1. Add fractions");
                 System.out.println("2. Subtract fractions");
                 System.out.println("3. Multiply fractions");
                  System.out.println("4. Divide fractions");
     }
 public void getInput(){
                 String[] ftext=new String[2];
                 String[] sptext=new String[2];
                 int no,de;
                 f1=new Fraction();
                 f2=new Fraction();
                 int i;
                
                try{
                     for(i=0;i<=1;i++){
                          BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
                          System.out.format("Enter fraction %d (e.g. 1/2):",i+1);
                         ftext[i]=br.readLine();
 
                  }
               sptext=ftext[0].split("/");
               f1.nomo=Integer.parseInt(sptext[0]);
               f1.deno=Integer.parseInt(sptext[1]);
 
              sptext=ftext[1].split("/");
              f2.nomo=Integer.parseInt(sptext[0]);
              f2.deno=Integer.parseInt(sptext[1]);
              if(f1.deno==0 || f2.deno==0) { System.out.println("A denominator can't be zero."); System.exit(100);}
 
                }catch(IOException e){System.out.println("Error in reading user input...");}
    }
  }
