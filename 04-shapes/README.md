# Shapes Area/Volume Calculator
public class Drawing {
      
   private int width;
   private int height;
   
   public Drawing(int a, int b) {
      width = a;
      height = b;
   }
   
   public void draw(){
      for(int i = 0; i<width;i++){
         System.out.print("*");
      }
      System.out.println();
      
      for (int i = 0; i <height-2;i++) {
         System.out.print("*");
         for (int k=0; k <width-2;k++){
            System.out.print(" ");
         }
         System.out.print("*");
         System.out.println();
      }
      
      for (int i = 0;i<width;i++) {
         System.out.print("*");
      } 
   }
}
-------------------------------------------------------------------------------------------------------------------------------
 import javax.swing.*;
 
 public class EmptyFrameViewer
 {
    public static void main(String[] args)
    {
       JFrame frame = new JFrame();
 
       final int FRAME_WIDTH = 300;
       final int FRAME_HEIGHT = 400;
 
       frame.setSize(FRAME_WIDTH, FRAME_HEIGHT);
       frame.setTitle("An Empty Frame");
       frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 
       frame.setVisible(true);
    }
 }
-------------------------------------------------------------------------------------------------------------------------------
import java.util.*; 
class pattern { 
    public static void main(String[] args) 
    { 
        Scanner sc = new Scanner(System.in); 
        System.out.println("Enter the number of rows to be printed"); 
        int rows = sc.nextInt(); 
  
         
        for (int i = 1; i <= rows; i++) { 
  
             
            for (int j = rows; j >= i; j--) { 
                System.out.print(" "); 
            } 
  
             
            for (int j = 1; j <= i; j++) { 
                System.out.print("* "); 
            } 
  
             
            System.out.println(); 
        } 
    } 
}

