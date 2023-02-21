import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try {
            Scanner input = new Scanner(System.in);
            System.out.print("Enter two integers: ");
            int number1 = input.nextInt();
            int number2 = input.nextInt();
            Calculator obj1 = new Calculator(number1, number2);
            obj1.Add();
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println(e.getMessage());
        }
        try {
            Scanner input = new Scanner(System.in);
            System.out.print("Enter two integers: ");
            int number3 = input.nextInt();
            int number4 = input.nextInt();
            Calculator obj2 = new Calculator(number3, number4);
            obj2.Subtract();
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println(e.getMessage());
        }
        try {
            Scanner input = new Scanner(System.in);
            System.out.print("Enter two integers: ");
            int number5 = input.nextInt();
            int number6 = input.nextInt();
            Calculator obj3 = new Calculator(number5, number6);
            obj3.Multiplication();
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println(e.getMessage());
        }
        try {
            Scanner input = new Scanner(System.in);
            System.out.print("Enter two integers: ");
            int number7 = input.nextInt();
            int number8 = input.nextInt();
            Calculator obj4 = new Calculator(number7, number8);
            obj4.Division();
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println(e.getMessage());
        }
    }
}