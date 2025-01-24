import java.util.Scanner;

public class SquareAndCube {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number (n): ");

        int n=scanner.nextInt();

        int i = 1;
        while (i <= n) {
            int square = i * i;
            int cube = i * i * i;
            System.out.println("Number: " + i + ", Square: " + square + ", Cube: " + cube);
            i++;
        }

        scanner.close();
    }
}