import java.util.Scanner;
public class JPA01 {
   public static void main(String[] args){
      System.out.println("Please enter score");
      Scanner s = new Scanner(System.in);
      int a = s.nextInt();
      if(a>60 || a==60){
         System.out.println("You pass");
         System.out.println("End");        
      }else{
         System.out.println("End");
      }
   }   
}
