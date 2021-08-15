package ChapterTwoExamples;

import java.util.Scanner;

public class Comparison {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int number1;
        int numner2;

        System.out.println("Enter first number");
        number1 = input.nextInt();

        System.out.println("Enter second number");
        numner2 = input.nextInt();

        if (number1 == numner2)
            System.out.printf("%d == %d%n", number1, numner2);

        if (number1 != numner2)
            System.out.printf("%d != %d%n", number1, numner2);

        if (number1 > numner2)
            System.out.printf("%d > %d%n", number1, numner2);

        if (number1 < numner2)
            System.out.printf("%d < %d%n", number1, numner2);

        if (number1 >= numner2)
            System.out.printf("%d >= %d%n", number1, numner2);

        if (number1 <= numner2)
            System.out.printf("%d <= %d%n", number1, numner2);

    }
}
