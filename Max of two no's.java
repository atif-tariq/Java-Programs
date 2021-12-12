/*       CSE-18-50      */
import java.lang.Math;
public class Maximum  {
   public static void main(String[] args) {
      // declaring and intializing some integer values
      int a = 10;
      int b = 9;
      // declaring and intializing some float values
      float c = 10.00f;
      float d = 9.99f;
      // declaring and initializing some double values
      double x = 300.01d;
      double y = 290.344d;
      // declaring and initializing some long values
      long r = 123456l;
      long s = 35678l;
      System.out.println("Maximum of " + a +" and " + b +" is " + Math.max(a,b));
      System.out.println("Maximum of " + c +" and " + d +" is " + Math.max(c,d));
      System.out.println("Maximum of " + x +" and " + y +" is " + Math.max(x,y));
      System.out.println("Maximum of " + r +" and " + s +" is " + Math.max(r,s));
   }
}
