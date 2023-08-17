import java.util.Scanner;

public class calc {
    public static void main(String[] args)
    {
        double num1;
        double num2;
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your first number");
        num1 = scan.nextDouble();
        System.out.println("Enter your second number");
        num2 = scan.nextDouble();
        System.out.println("Enter operator");

        char op = scan.next().charAt(0);
        double o = 0;

        switch (op) {
            case '+':
                o = num1 + num2;
                break;
            case '-':
                o = num1 - num2;
                break;
            case '*':
                o = num1 * num2;
                break;
            case '/':
                o = num1 / num2;
                break;
            default:
                System.out.println("Wrong Input");
        }

        System.out.println("Answer:" + o);
    }
}