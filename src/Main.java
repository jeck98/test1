import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please, enter the height of the Christmas tree: ");
        int size = scanner.nextInt();

        for (int i = 0; i < size; i++) {
            for (int k = 1; k < size-i;k++) {
                System.out.print(" ");
            }

            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }

            System.out.println();
        }
    }
}