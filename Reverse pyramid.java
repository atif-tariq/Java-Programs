/*      CSE - 18 - 50   
        For Loop 
*/ 
public class Pyramid {
    public static void main(String[] args) {
        for (int i = 10; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print(j + 1);
            }
            System.out.println("");
        }
    }
}
