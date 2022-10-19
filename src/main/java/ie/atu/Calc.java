package ie.atu;

import java.util.Scanner;

public class Calc {

    public int add(){
       // System.out.println("First number: ");
       // Scanner inputs = new Scanner(System.in);
        int firstNumber = 1; //inputs.nextInt();

       // System.out.println("Second number: ");
        int secondNumber = 1; //inputs.nextInt();

        int total = firstNumber + secondNumber;
        System.out.println("The total is " + total);
        return total;
    }

    public int subtract(){
        // System.out.println("First number: ");
        // Scanner inputs = new Scanner(System.in);
        int firstNumber = 1; //inputs.nextInt();

        // System.out.println("Second number: ");
        int secondNumber = 1; //inputs.nextInt();

        int total = firstNumber - secondNumber;
        System.out.println("The total is " + total);
        return total;
    }

    public int multiply(){
        // System.out.println("First number: ");
        // Scanner inputs = new Scanner(System.in);
        int firstNumber = 2; //inputs.nextInt();

        // System.out.println("Second number: ");
        int secondNumber = 2; //inputs.nextInt();

        int total = firstNumber * secondNumber;
        System.out.println("The total is " + total);
        return total;
    }
}

