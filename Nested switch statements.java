/*       CSE-18-50      
         Nested Switch 
*/

public class PrintSubjects
{
    public static void main(String arg[])
    {
        char branch = 'E'; // C - CSE, E - ECE, M - Mech
        int year = 2;
        
        switch( year )
        {
            case 1:
                System.out.println("English, Maths, Drawing");
                break;
            case 2:
                switch( branch ) 
                {
                    case 'C':
                        System.out.println("Data structures, Java, Computer Organization");
                        break;
                    case 'E':
                        System.out.println("Micro processors");
                        break;
                    case 'M':
                        System.out.println("Drawing, Manufacturing");
                        break;
                }
                break;
            case 3:
                switch( branch ) 
                {
                    case 'C':
                        System.out.println("Operating System, RDBMS");
                        break;
                    case 'E':
                        System.out.println(" Microelectronics");
                        break;
                    case 'M':
                        System.out.println(" Mechanical Vibration");
                        break;
                }
                break;
        }
    
    }
}
