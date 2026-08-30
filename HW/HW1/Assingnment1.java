import java.util.Scanner;

public class Assingnment1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Please input an integer 0-100 (-1 to stop): ");
        int input = scan.nextInt();
        while (true) {
            if (input == -1) {
                System.out.println("Good bye!");
                break;
            } else if (input < 0 || input > 100) {
                System.out.printf("%d is not a valid input\n", input);
            }
        }

        scan.close();
    }
}
