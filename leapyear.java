import java.util.Scanner;


public class leapyear {
    public static void main(String[]args){
        Scanner in = new Scanner(System.in);

        System.out.print("Enter year:");
        int year = in.nextInt();

        if ( year % 4 == 0 ) {
            System.out.print(year+"is a leap year");
            
           }
        else {
            System.out.print("is not a leap year");
         }
        }
    }
        
    
    

