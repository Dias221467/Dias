import Basic.AdditionAandB;
import Basic.DevisionAandB;
import Basic.MultiplicationAandB;
import Basic.SubstractionAandB;
import NotBasic.LogarithmAB;
import NotBasic.Pow;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        Scanner input = new Scanner(System.in);

        System.out.println("Choose number!\nSelect operation:\n1) Addition\n2) Subsctraction\n3) Multiplication\n4) Divide\n5) log(base b) a\n6) Pow a to b");

        int userChoice = input.nextInt();
        int a = 0;
        int b = 0;

        switch (userChoice) {
            case 1 -> {
                System.out.println("Enter a: ");
                a = input.nextInt();
                System.out.println("Enter b: ");
                b = input.nextInt();
                calc.setStrategy(new AdditionAandB());
                System.out.println(calc.executeStrategy(a, b));
            }
            case 2 -> {
                System.out.println("Enter a: ");
                a = input.nextInt();
                System.out.println("Enter b: ");
                b = input.nextInt();
                calc.setStrategy(new SubstractionAandB());
                System.out.println(calc.executeStrategy(a, b));
            }
            case 3 -> {
                System.out.println("Enter a: ");
                a = input.nextInt();
                System.out.println("Enter b: ");
                b = input.nextInt();
                calc.setStrategy(new MultiplicationAandB());
                System.out.println(calc.executeStrategy(a, b));
            }
            case 4 -> {
                System.out.println("Enter a: ");
                a = input.nextInt();
                System.out.println("Enter b: ");
                b = input.nextInt();
                calc.setStrategy(new DevisionAandB());
                System.out.println(calc.executeStrategy(a, b));
            }
            case 5 -> {
                System.out.println("Enter a: ");
                a = input.nextInt();
                System.out.println("Enter b: ");
                b = input.nextInt();
                calc.setStrategy(new LogarithmAB());
                System.out.println(calc.executeStrategy(a, b));
            }
            case 6 -> {
                System.out.println("Enter a: ");
                a = input.nextInt();
                System.out.println("Enter b: ");
                b = input.nextInt();
                calc.setStrategy(new Pow());
                System.out.println(calc.executeStrategy(a, b));
            }
        }

    }


}

