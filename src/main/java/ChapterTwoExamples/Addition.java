package ChapterTwoExamples;

import java.util.Scanner;

public class Addition {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int fisrtNumber;
        int secondNumber;
        int sum;

        System.out.println("Enter firstNumber");
        fisrtNumber = input.nextInt();

        System.out.println("Enter secondNumber");
        secondNumber = input.nextInt();

        sum = fisrtNumber + secondNumber;

        System.out.println("Sum is " + sum);


    }
}