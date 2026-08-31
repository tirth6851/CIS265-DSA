import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;

public class Assingnment1 {
    public static ArrayList<Integer> getInput() {
        Scanner scan = new Scanner(System.in);
        ArrayList<Integer> inputs = new ArrayList<Integer>();
        while (true) {
            System.out.print("Please input an integer 0-100 (-1 to stop): ");
            if (!scan.hasNextInt()) {
                System.out.println("Invalid input. Please enter a number.");
                scan.next();
                continue;
            }
            int n = scan.nextInt();
            if (n == -1) {
                break;
            }
            if (n < 0 || n > 100) {
                System.out.printf("%d is not a valid input\n", n);
                continue;
            }
            inputs.add(n);
        }
        scan.close();
        return inputs;
    }

    public static void main(String[] args) {
        ArrayList<Integer> inputs = getInput();
        System.out.println(Collections.min(inputs));
        System.out.println(Collections.max(inputs));
        System.out.println(inputs.stream().mapToInt(Integer::intValue).average().orElse(0.0));
        System.out.println("Good bye!");
    }
}
