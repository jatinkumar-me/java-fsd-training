import java.util.LinkedList;
import java.util.Scanner;

/**
 * Main
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("Enter height of star");

        Scanner sc = new Scanner(System.in);
        int height = sc.nextInt();
        height /= 2;
        sc.close();

        for (int i = 0; i < height; i++) {
            for (int j = 0; j < height - i - 1; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < 2 * i + 1; j++) {
                System.out.print("*");
            }
            System.out.println();
            LinkedList<Integer> ll = new LinkedList<>();
        }

        for (int i = height - 2; i >= 0; i--) {
            for (int j = 0; j < height - i - 1; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < 2 * i + 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }

}
