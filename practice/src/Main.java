import java.util.InputMismatchException;
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Welcome to Franco's Console Calculator!!");
        System.out.println("========================================");
        System.out.print("Would you like to use the calculator?(y/n): ");
        char access = scan.next().charAt(0);

        System.out.println(" ");

        if(access == 'y') {
            try {
                System.out.print("Enter first number: ");
                int num1 = scan.nextInt();
                System.out.print("Enter second number: ");
                int num2 = scan.nextInt();
                System.out.print("Enter operation(+,-,*,/): ");
                char opp = scan.next().charAt(0);

                int result = 0;

                if (opp == '+') {
                    result = num1 + num2;
                } else if (opp == '-') {
                    result = num1 - num2;
                } else if (opp == '*') {
                    result = num1 * num2;
                } else if (opp == '/') {
                    result = num1 / num2;
                }
                System.out.println(" ");

                System.out.println(num1 + " " + opp + " " + num2 + " = " + result);

            }catch(InputMismatchException e){
                System.err.println("Input must be a number!");
            }catch(ArithmeticException e){
                System.err.println("Input must be nonzero!");
            }
        }else if(access == 'n'){
            System.out.println("Why the fuck did you run this code if you ain't using it then?!");
            System.out.println("Closing...");
        }
        scan.close();
    }
}