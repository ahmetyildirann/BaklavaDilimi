import java.util.Scanner;

public class Main {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Please enter height : ");
            int height = scanner.nextInt();

            for (int i = 1; i <= height; i++) {

                for (int j = 0; j < (height-i); j++)
                {
                    System.out.print(" ");
                }
                for (int k = 0; k < 2*i-1; k++)
                {
                    System.out.print("*");
                }
                System.out.println();
            }


            for (int i = height-1; i > 0; i--) {

                for (int j = 0; j < height-i; j++)
                {
                    System.out.print(" ");
                }
                for (int k = 0; k < 2*i-1; k++)
                {
                    System.out.print("*");
                }
                System.out.println();
            }

        }
    }
