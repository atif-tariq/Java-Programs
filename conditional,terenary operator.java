/*       CSE-18-50      */
import java.util.*;  
public class Number {
    
  public static void main(String args[]) {
   
    Scanner sc= new Scanner(System.in); 
    System.out.print("Enter first number- ");  
    int a=sc.nextInt();  
    System.out.print("Enter second number- ");  
    int b=sc.nextInt();  
    int result = (a < b) ? a : b;
    System.out.println(result + " is the minimum value");
  }
}
