package sample;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        try {
            System.out.println("vveditestroky");

            String consoleLine = in.nextLine();
            String[] arguments = consoleLine.split(" ");
            double x = Double.parseDouble(arguments[0]);
            char operation = arguments[1].charAt(0);
            double y = Double.parseDouble(arguments[2]);
            System.out.println(calc(x, y, operation));
        } catch(NumberFormatException ex) {
            System.out.println("Invalid format");
        }
    }
    public static double calc(double x, double y, char operation) {
        switch (operation) {
            case '+':
                return x + y;
            case '-':
                return x - y;
            case '*':
                return x*y;
            case '/':
                return x/y;
            default:
                return Double.NaN;
        }


    }
}