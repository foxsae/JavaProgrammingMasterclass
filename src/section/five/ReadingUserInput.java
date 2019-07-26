package section.five;

import java.util.Scanner;

public class ReadingUserInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int count = 0;
        int sum = 0;
        int value = 0;
        while (count < 10) {
            System.out.print("Enter number #" + (count+1) + ":");
            boolean hasNext = scanner.hasNextInt();
            if (hasNext) {
                value = scanner.nextInt();
                scanner.nextLine(); // account for nextline bug
                sum += value;
                count++;
            } else {
                System.out.println("Invalid Number");
            }
        }
        System.out.println(sum);
        scanner.close();
    }
}
