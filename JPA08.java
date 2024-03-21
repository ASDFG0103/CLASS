import java.util.*;
public class JPA08{
 static Scanner keyboard = new Scanner(System.in);
 public static void main(String[] args) {
  test();
  test();
  test();
  test();
  test();
 }
 public static void test() {
  System.out.println("Input:");
  int g = keyboard.nextInt();
  if (g>=90)System.out.println("Your grade is A");
  else if (g>=80)System.out.println("Your grade is B");
  else if (g>=70)System.out.println("Your grade is C");
  else if (g>=60)System.out.println("Your grade is D");
  else System.out.println("Your grade is F");
 }
}
