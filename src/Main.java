import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        oneAndTwo();
        threeAndFour();
        fiveAndSix();
    }

    public static void oneAndTwo() {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int sum = 0;
        for (int i : numbers) {
            sum += i;
        }
        System.out.println(sum);
    }

    public static void threeAndFour() {
        Scanner sc = new Scanner(System.in);
        int[] numbers = new int[10];
        int total = 0;
        double average;

        for (int i = 0; i <= 9; i++) {
            System.out.print("Enter a number: ");
            int number = sc.nextInt();
            numbers[i] = number;
            total += numbers[i];
        }

        average = (double) total / numbers.length;
        System.out.println("The total is " + total);
        System.out.printf("The average is %.2f", average);
    }

    public static void fiveAndSix() {
        String[] names = new String[3];
        names[0] = "George";
        names[1] = "Thomas";
        names[2] = "Mary";

        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i]);
        }

        int[] numbers = {2,5,9,0,2,1,8,5,4};
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == 5) {
                System.out.println(i);
            }
        }
    }

}
