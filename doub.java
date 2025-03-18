import java.util.Scanner;


    public class doub {
        public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first double: ");
        double a = scanner.nextDouble();

        System.out.print("Enter second double: ");
        double b = scanner.nextDouble();

        System.out.print("Enter third double: ");
        double c = scanner.nextDouble();

        System.out.print("Enter fourth double  : ");
        double d = scanner.nextDouble();


        if (a>0&&a<1&&b>0&&b<1) {
            System.out.println("hauji");
        } else {
            System.out.println("baigan bhi hai");
        }
    }
}