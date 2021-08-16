package ChapterTwoExamples;

import java.util.Scanner;

public class Exercise2Point5ChapterTwo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int integer1;
        int integer2;
        int sum;
        int product;
        int difference;
        int quotient;

        System.out.println("Enter first integer");
        integer1 = input.nextInt();

        System.out.println("Enter second integer");
        integer2= input.nextInt();

         sum = integer1 + integer2;
        System.out.println("Sum is " + sum);

        product = integer1 * integer2;
        System.out.println("Product is " + product);

        difference = integer2 - integer1;
        System.out.println("Difference is " + difference);

        quotient = integer2 / integer1;
        System.out.println("Quotient is " + quotient);
    }
}
